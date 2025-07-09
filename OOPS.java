
import java.util.*;

class Student{
    String name;
    int age;

public void getInfo(String name,int age){
     System.out.println(age + " " + name);
}
public void getInfo(String name ){
    System.out.println(name);
}
    }
Student(){
    System.out.println("constructor is called");
}

public class OOPS{
    public static void main (String[]args){
        Student s1 = new Student();
        s1.name ="anas";
        s1.age =19;
       s1.getInfo(s1.name);
    }
}