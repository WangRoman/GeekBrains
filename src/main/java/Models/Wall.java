package Models;


import Interfaces.InstrumentMethod;

public class Wall implements InstrumentMethod {
    private int length;
    private int height;

    public Wall(int length, int height) {
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
