class Pen{
    String colour;
    String type;
   public void getInfo(){
        System.out.println("the colour of this pen is:"+this.colour);
        System.out.println("the type of this pen is:"+this.type);
        
    }
    Pen(){
        System.out.println("constructor is called");
    }
}
public class OOPS2{
    public static void main (String[]args){
       Pen p1 = new Pen ();
       p1.colour = "black";
       p1.type = "ballpen";
       p1.getInfo();
    }
}