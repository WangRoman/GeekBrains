public class Wall implements instrumentMethod {
    private int length;
    private int height;

    public Wall(int length, int height) {
        this.length = 0;
        this.height = height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
