import java.util.*;
public class QueueCFW{
    //CFW question on stack to queue operation
    static class Queue{
    static Stack<Integer> IS = new Stack<>();
    static Stack<Integer> OS= new Stack<>();

    public static boolean isEmpty(){
        return IS.isEmpty () && OS.isEmpty();
    }
    public static void add (int data){
       
        IS.push(data);

         
        }
//complexity is O(n)
    

    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
        
        return -1;
        }
    if(OS.isEmpty()){
        while(!IS.isEmpty()){
            OS.push(IS.pop());
        
        }
    }
    return OS.pop();
    //complexity O(1)
    }
      public static int peek(){
      if(isEmpty()){
            System.out.println("empty queue");
        
        return -1;
      }
    if(OS.isEmpty()){
        while(!IS.isEmpty()){
            OS.push(IS.pop());
        
        }
        //complexity O(1)
    }
    return OS.peek();
}
}

    public static void main(String []args){
   
Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
     
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}