public class Main {
    public static void main(String[] args) {
        Shape[] a = new Shape[] {new Triangle(10,20,30), new Rectangle(10, 20), new Square(10), new Circle(5)};
        for (int i = 0; i < a.length; i++) {
            a[i].ploshad();
            
        }


    }
}