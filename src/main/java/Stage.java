public class Stage {
    private Object[] members = new Object[3];
    private Object[] instruments = new Object[2];

    public Stage() {
        members[0] = new Human("Human", 120, 8, false);
        members[1] = new Cat("Cat", 90, 12, false);
        members[2] = new Robot("Robot", 150, 15, false);
        instruments[0] = new Treadmill(100, 0);
        instruments[1] = new Wall(0, 10);
    }

    public void resultRun() {
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < (instruments.length); j++) {
                if (members[i] instanceof memberFunction && instruments[j] instanceof instrumentMethod && j % 2 == 0) {
                    if (((memberFunction) members[i]).getLengthCapacity() >= ((instrumentMethod) instruments[j]).getLength()) {
                        ((memberFunction) members[i]).setRunSuccess(true);
                        System.out.println(((memberFunction) members[i]).getName() + " has run the distance");
                        System.out.println("Status: " + ((memberFunction) members[i]).getRunSuccess());
                    } else {
                        System.out.println(((memberFunction) members[i]).getName() + " hasn't run the distance");
                        ((memberFunction) members[i]).setRunSuccess(false);
                        System.out.println("Status: " + ((memberFunction) members[i]).getRunSuccess());
                    }
                }
                if (((memberFunction) members[i]).getRunSuccess() && j % 2 != 0) {
                    if (((memberFunction) members[i]).getHeightCapacity() >= ((instrumentMethod) instruments[j]).getHeight()) {
                        System.out.println(((memberFunction) members[i]).getName() + " has jumped on the wall");
                    } else {
                        System.out.println(((memberFunction) members[i]).getName() + " hasn't jumped on the wall");
                    }
                }
            }
        }
    }
}
