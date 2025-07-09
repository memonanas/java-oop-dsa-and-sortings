
abstract class Animals {
abstract void walk();
public void eat(){
    System.out.println("the animal eats");
}
}
class Horse extends Animals{
    public void creation(){
        System.out.println("you are creating a horse");
    }
    public void walk (){
        System.out.println("Horse walks on 4 feet");
    }
}
    class Chicken extends Animals{
        public void creation(){
            System.out.println("you are creating a chicken");
        }
        public void walk(){
            System.out.println("Chicken walks on two feet");
    
        }
    }


public class oopslast{
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.creation();
        horse1.eat();
        horse1.walk();

        Chicken chicken1 = new Chicken();
        chicken1.creation();
        chicken1.eat();
        chicken1.walk();
        
    }
}