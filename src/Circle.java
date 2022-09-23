public class Circle extends Shape{
    double radiys;
    double s;
    double pi = 3.14;
    public void ploshad(){
        System.out.println("Площадь круга = " + s );
    }
    public Circle (double r){
        radiys = r;
        s = radiys + radiys * pi;

    }
}
