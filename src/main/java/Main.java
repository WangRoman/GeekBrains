public class Main {

    public static void main(String[] args) {
        Human human = new Human("Human",120, 8, false);
        Cat cat = new Cat("Cat",90, 12, false);
        Robot robot = new Robot("Robot",150, 15, false);
        Stage stage = new Stage();

        human.run();
        human.jump();
        cat.run();
        cat.jump();
        robot.run();
        robot.jump();
        stage.resultRun();
    }
}
