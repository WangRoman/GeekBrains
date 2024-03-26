package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static final int SIZE = 5;
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char EMPTY_DOT = '*';
    public static char[][] map;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Random rand = new Random();

    public static void main(String[] args) throws IOException {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap(); //нужно для новой распечатки карты после хода
            if (checkWin(DOT_X)) {
                System.out.println("You're a winner!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Nobody wins");
                break;
            }
            aiTurn();
            printMap(); //нужно для новой распечатки карты после хода
            if (checkWin(DOT_O)) {
                System.out.println("The computer_0 is a winner!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Nobody wins");
                break;
            }
        }
        System.out.println("Game over!");
    }

    public static boolean checkWin(char symb) {
        int[][] winComb = {
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {0, 5, 10, 15, 20},
                {1, 6, 11, 16, 21},
                {2, 7, 12, 17, 22},
                {3, 8, 13, 18, 23},
                {4, 9, 14, 19, 24},
                {0, 6, 12, 18, 24},
                {4, 8, 12, 16, 20}
        };
        for (int[] comb : winComb) {
            boolean win = true;
            for (int i = 0; i < comb.length; i++) {
                int row = comb[i] / 5;
                int col = comb[i] % 5;
                if (map[row][col] != symb) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }
        return false;
        /*if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) {
            return true;
        }
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) {
            return true;
        }
        if (map[2][0] == symb && map[2][1] == symb && map[0][2] == symb) {
            return true;
        }
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) {
            return true;
        }
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) {
            return true;
        }
        return false;*/
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == EMPTY_DOT) return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        // Проверяем, есть ли возможность выиграть на следующем ходу
        for (y = 0; y < SIZE; y++) {
            for (x = 0; x < SIZE; x++) {
                if (isCellValid(x, y)) {
                    map[y][x] = DOT_O;
                    if (checkWin(DOT_O)) {
                        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                        return true;
                    }
                    map[y][x] = EMPTY_DOT;
                }
            }
        }
        // Проверяем, есть ли возможность блокировать ходы игрока
        for (y = 0; y < SIZE; y++) {
            for (x = 0; x < SIZE; x++) {
                if (isCellValid(x, y)) {
                    map[y][x] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[y][x] = DOT_O;
                        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                        return true;
                    }
                    map[y][x] = EMPTY_DOT;
                }
            }
        }
        // Если нет возможности ни выиграть, ни заблокировать ход игрока, то случайный ход
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() throws IOException {
        int x, y;
        do {
            System.out.println("Put your coordinates: ");
            x = Integer.parseInt(reader.readLine()) - 1;
            y = Integer.parseInt(reader.readLine()) - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }
}