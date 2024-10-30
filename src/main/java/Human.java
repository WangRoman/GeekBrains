public class Human implements runMethod, jumpMethod, memberFunction {

    private String name;
    private int lengthCapacity;
    private int heightCapacity;
    private boolean runSuccess;


    public Human(String name, int lengthCapacity, int heightCapacity, boolean runSuccess) {
        this.name = name;
        this.lengthCapacity = lengthCapacity;
        this.heightCapacity = heightCapacity;
        this.runSuccess = runSuccess;
    }

    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public void jump() {
        System.out.println("Human is jumping");
    }
    @Override
    public String getName() {return name;}
    @Override
    public int getLengthCapacity() {
        return lengthCapacity;
    }
    @Override
    public int getHeightCapacity() {
        return heightCapacity;
    }
    @Override
    public boolean getRunSuccess() {
        return runSuccess;
    }
    @Override
    public void setRunSuccess(boolean runSuccess) {
        this.runSuccess = runSuccess;
    }
}

