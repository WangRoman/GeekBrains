package Models;


import Interfaces.InstrumentMethod;

public class Treadmill implements InstrumentMethod {
    private int length;
    private int height;

    public Treadmill(int length, int height) {
        this.length = length;
        this.height = height;
    }
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
