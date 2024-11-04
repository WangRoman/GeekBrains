package Models;

import Interfaces.InstrumentMethod;
import Interfaces.MemberFunction;

import java.util.Random;

public class Stage {
    private Object[] members = new Object[3];
    private Object[] instruments = new Object[2];
    Random rand = new Random();

    public Stage() {
        members[0] = new Human("Human", rand.nextInt(200), rand.nextInt(20), false);
        members[1] = new Cat("Cat", rand.nextInt(200), rand.nextInt(20), false);
        members[2] = new Robot("Robot", rand.nextInt(200), rand.nextInt(20), false);
        instruments[0] = new Treadmill(100, 0);
        instruments[1] = new Wall(0, 10);
    }


    public void run() {
        for (int i = 0; i < members.length; i++) {
            System.out.println(((MemberFunction) members[i]).getName() + " is running");
        }
    }


    public void jump() {
        for (int i = 0; i < members.length; i++) {
            System.out.println(((MemberFunction) members[i]).getName() + " is jumping");
        }
    }

    public void resultRun() {
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < (instruments.length); j++) {
                if (members[i] instanceof MemberFunction && instruments[j] instanceof InstrumentMethod && j % 2 == 0) {
                    if (((MemberFunction) members[i]).getLengthCapacity() >= ((InstrumentMethod) instruments[j]).getLength()) {
                        ((MemberFunction) members[i]).setRunSuccess(true);
                        System.out.println(((MemberFunction) members[i]).getName() + " has " +
                                ((MemberFunction) members[i]).getLengthCapacity() + " units");
                        System.out.println(((MemberFunction) members[i]).getName() + " has run the distance");
                        System.out.println("Status: " + ((MemberFunction) members[i]).getRunSuccess());
                    } else {
                        System.out.println(((MemberFunction) members[i]).getName() + " has " +
                                ((MemberFunction) members[i]).getLengthCapacity() + " units");
                        System.out.println(((MemberFunction) members[i]).getName() + " hasn't run the distance");
                        ((MemberFunction) members[i]).setRunSuccess(false);
                        System.out.println("Status: " + ((MemberFunction) members[i]).getRunSuccess());
                    }
                }
                if (((MemberFunction) members[i]).getRunSuccess() && j % 2 != 0) {
                    if (((MemberFunction) members[i]).getHeightCapacity() >= ((InstrumentMethod) instruments[j]).getHeight()) {
                        System.out.println(((MemberFunction) members[i]).getName() + " has " +
                                ((MemberFunction) members[i]).getHeightCapacity() + " units");
                        System.out.println(((MemberFunction) members[i]).getName() + " has jumped on the wall");
                    } else {
                        System.out.println(((MemberFunction) members[i]).getName() + " has " +
                                ((MemberFunction) members[i]).getHeightCapacity() + " units");
                        System.out.println(((MemberFunction) members[i]).getName() + " hasn't jumped on the wall");
                    }
                }
            }
        }
    }
}
