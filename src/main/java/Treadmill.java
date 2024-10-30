public class Treadmill implements instrumentMethod {
    private int length;
    private int height;

    public Treadmill(int length, int height) {
        this.length = length;
        this.height = 0;
    }
    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}