// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle.DoubleRectangle(10.0,20.0);
        Rectangle r2 = new Rectangle.FloatRectangle(5.0f, 8.0f);
        System.out.println("Width of Double Rectangle "+r1.getWidth());
        System.out.println("Width of Float Rectangle "+r2.getWidth());
        System.out.println("The Area of Double Rectangle 1 is "+r1.getArea());
    }
}