package Week1.Classes;

public class Rectangle {
    private int height;
    private int width;
    private String color = "Blue";

    public Rectangle(int height, int width) {
        setHeight(height);
        setWidth(width);
    }

    public Rectangle(int height, int width, String color) {
        this(height, width);
        setColor(color);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height > 0 ? height : 1;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width > 0 ? width : 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.length() < 3 || color.length() > 20) ? "Blue" : color;
    }

    void draw() {
        char letter = getColor().charAt(0);
        for (int row = 0; row < getHeight(); row++) {
            for (int collumn = 0; collumn < getWidth(); collumn++) {
                System.out.print(letter);
            }
            System.out.println("");
        }
    }
}

