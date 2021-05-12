public class Square extends Shape {
    private int width;
    private int height;

    public int calcArea() {
        int area = width * height;
        return area;
    }

    public int calcCircumference() {

        int circumference = 2 * (width + height);
        return circumference;

    }
}


