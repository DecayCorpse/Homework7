public class Square extends Shape {
    int storona;
    int s;

    public Square(int a) {
         storona = a;
         s = storona * storona;

    }
    public void ploshad() {
        System.out.println("площпдь квадрата = " + s  );
    }
}
