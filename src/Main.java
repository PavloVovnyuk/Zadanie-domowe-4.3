public class Main {
    public static void main(String[] args) {
        Metods metods = new Metods ();
        Triangle triangle = new Triangle ();
        triangle.setA (1);
        triangle.setB (1);
        triangle.setC (10);
        boolean result = metods.isRightTriangle (triangle);
        System.out.println (result);
    }
}