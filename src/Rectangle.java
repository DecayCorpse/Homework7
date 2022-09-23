public class Rectangle extends Shape{
    int pervaya_trty;
    int vtoraya_chetvertaya;
    int s;
    public Rectangle(int a, int b){
       pervaya_trty = a;
       vtoraya_chetvertaya = b;
       s = pervaya_trty * vtoraya_chetvertaya;

    }
    public void ploshad(){
        System.out.println("площпдь прямоугольника = " + s);
    }

}
