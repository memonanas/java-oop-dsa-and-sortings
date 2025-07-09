

class Shape{
    public void area(){
        System.out.println("displays area of the shape");
    }
}
class Square extends Shape{
    public void area (int l){
    System.out.println("the area of square is"+(l*l));
}
}
class Rectangle extends Square{
    public void area(int i,int l){
    System.out.println("the rectangle of circle is"+(l*i));
}
}
class Circle extends Shape{
    public void area (int r){
    System.out.println("the area of circle is"+(3.14*r*r));
}
}
public class Inheritance{
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.area(5);
        Circle c1 =new Circle();
        c1.area(4);
        Rectangle r1 = new Rectangle();
        r1.area(4,5);
    }
}