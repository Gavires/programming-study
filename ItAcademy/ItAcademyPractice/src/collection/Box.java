package collection;

public class Box
{
    private int length;
    private int width;
    private int height;
    private int weight;
    private int volume;

    public Box( int length, int width, int height, int weight ) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        volume = length * height * weight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }
}
