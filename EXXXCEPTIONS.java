import java.util.*;
public class EXXXCEPTIONS{
    public static void main (String[]args){
int[] marks = new int[5];
marks[0]=34;
marks[1]=77;
marks[2]=28;
marks[3]=79;
marks[4]=67;
Scanner sc = new Scanner (System.in);
int index = sc.nextInt();
System.out.println("input the array index");
int divisor = sc.nextInt();
System.out.println("input the array divisor");
 
 try{
    System.out.println("the marks on array index is:" + (marks[index]));
    System.out.println("product is:" + (marks[index]/divisor));
      }     catch(ArithmeticException e){
        System.out.println("Arithmetic Exception occured");
    System.out.println(e);

    }
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("ArrayOutOfBounds Exception occured!");
    System.out.println(e);

}
catch(Exception e){
    System.out.println("some other Exception occured!");
    System.out.println(e);
}
sc.close();
    }

 }
    