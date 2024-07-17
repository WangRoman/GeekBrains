package ru.geekbrains.lesson8;

public class Dictionary {
    public static void main(String[] args) {
        String text = "Unfortunately I don't have access to any specific article text. As an AI " +
                "assistant, I don't have the ability to retrieve articles or text on my own. I'm happy " +
                "to analyze and provide insights on any text you are able to provide, but I'll need you" +
                " to share the actual text first before I can proceed. Please feel free to copy and" +
                " paste a short excerpt from an article, or provide the text in some other way, and" +
                " I'll be glad to take a look at it for you.";
        char [] letter = text.toCharArray();
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0, countG = 0,
                countH = 0, countI = 0, countJ = 0, countK = 0, countL = 0, countM = 0, countN = 0,
                countO = 0, countP = 0, countQ = 0, countR = 0, countS = 0, countT = 0, countU = 0,
                countV = 0, countW = 0, countX = 0, countY = 0, countZ = 0;
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == 'a' || letter[i] == 'A') {
                countA++;
            }
            if (letter[i] == 'b' || letter[i] == 'B') {
                countB++;
            }
            if (letter[i] == 'c' || letter[i] == 'C') {
                countC++;
            }
            if (letter[i] == 'd' || letter[i] == 'D') {
                countD++;
            }
            if (letter[i] == 'e' || letter[i] == 'E') {
                countE++;
            }
            if (letter[i] == 'f' || letter[i] == 'F') {
                countA++;
            }
            if (letter[i] == 'g' || letter[i] == 'G') {
                countG++;
            }
            if (letter[i] == 'h' || letter[i] == 'H') {
                countA++;
            }
            if (letter[i] == 'i' || letter[i] == 'I') {
                countI++;
            }
            if (letter[i] == 'j' || letter[i] == 'J') {
                countJ++;
            }
            if (letter[i] == 'k' || letter[i] == 'K') {
                countK++;
            }
            if (letter[i] == 'l' || letter[i] == 'L') {
                countL++;
            }
            if (letter[i] == 'm' || letter[i] == 'M') {
                countM++;
            }
            if (letter[i] == 'n' || letter[i] == 'N') {
                countN++;
            }
            if (letter[i] == 'o' || letter[i] == 'O') {
                countO++;
            }
            if (letter[i] == 'p' || letter[i] == 'P') {
                countP++;
            }
            if (letter[i] == 'q' || letter[i] == 'Q') {
                countQ++;
            }
            if (letter[i] == 'r' || letter[i] == 'R') {
                countR++;
            }
            if (letter[i] == 's' || letter[i] == 'S') {
                countA++;
            }
            if (letter[i] == 't' || letter[i] == 'T') {
                countT++;
            }
            if (letter[i] == 'u' || letter[i] == 'U') {
                countU++;
            }
            if (letter[i] == 'v' || letter[i] == 'V') {
                countV++;
            }
            if (letter[i] == 'w' || letter[i] == 'W') {
                countW++;
            }
            if (letter[i] == 'x' || letter[i] == 'X') {
                countX++;
            }
            if (letter[i] == 'y' || letter[i] == 'Y') {
                countY++;
            }
            if (letter[i] == 'z' || letter[i] == 'Z') {
                countZ++;
            }
        }
        System.out.println("\"A\" letter has been mentioned " + countA + " times");
        System.out.println("\"B\" letter has been mentioned " + countB + " times");
        System.out.println("\"C\" letter has been mentioned " + countC + " times");
        System.out.println("\"D\" letter has been mentioned " + countD + " times");
        System.out.println("\"E\" letter has been mentioned " + countE + " times");
        System.out.println("\"F\" letter has been mentioned " + countF + " times");
        System.out.println("\"G\" letter has been mentioned " + countG + " times");
        System.out.println("\"H\" letter has been mentioned " + countH + " times");
        System.out.println("\"I\" letter has been mentioned " + countI + " times");
        System.out.println("\"J\" letter has been mentioned " + countJ + " times");
        System.out.println("\"K\" letter has been mentioned " + countK + " times");
        System.out.println("\"L\" letter has been mentioned " + countL + " times");
        System.out.println("\"M\" letter has been mentioned " + countM + " times");
        System.out.println("\"N\" letter has been mentioned " + countN + " times");
        System.out.println("\"O\" letter has been mentioned " + countO + " times");
        System.out.println("\"P\" letter has been mentioned " + countP + " times");
        System.out.println("\"Q\" letter has been mentioned " + countQ + " times");
        System.out.println("\"R\" letter has been mentioned " + countR + " times");
        System.out.println("\"S\" letter has been mentioned " + countS + " times");
        System.out.println("\"T\" letter has been mentioned " + countT + " times");
        System.out.println("\"U\" letter has been mentioned " + countU + " times");
        System.out.println("\"V\" letter has been mentioned " + countV + " times");
        System.out.println("\"W\" letter has been mentioned " + countW + " times");
        System.out.println("\"X\" letter has been mentioned " + countX + " times");
        System.out.println("\"Y\" letter has been mentioned " + countY + " times");
        System.out.println("\"Z\" letter has been mentioned " + countZ + " times");
    }
}
