class LL{
    class Node{
        int data;
        Node next;
        Node(int  data){
        this.data = data;
        this.next= null;
        }

    
    }

    Node head;
    public void addfirst(int data){
    Node newnode = new Node(data);
    newnode.next= head;
    head = newnode;

    
}


public void addlast(int data){
    Node newnode = new Node(data);
    if(head == null){
        head = newnode;
        return ;
    }
Node temp = head;
while(temp.next != null){
    temp = temp.next;
}
temp.next=newnode; 

}
public void deletefirst(){
    if (head==null){
        System.out.println("list is empty");
        return;
    }
    head = head.next;
}
public void deletelast(){
    if (head==null){
        System.out.println("list is empty");
        return;
    }
    if(head.next==null){
        head= null;
        return;
    }

Node temp = head;
while (temp.next.next != null){
    temp = temp.next;
}
temp.next=null;
}
public int search (int key){
    Node temp = head;
    int index = 0;
    while (temp != null){
if(temp.data==key){
    return index;
    //foundd element of searching 

}
temp = temp.next;
index++;


    }
    return -1;


}
public void printlist(){
    if (head==null){
        System.out.println("list is empty");
        return;
    }
    Node temp = head;
    System.out.println("linked list");
    while (temp!=null){
        System.out.print(temp.data +"->");
        temp=temp.next;
    }
    System.out.println("null");
    
}


public static void main (String[]args){
    LL list = new LL();

list.addfirst(5);
list.addfirst(1);
list.addlast(7);
list.addlast(3);
list.addlast(8);
list.addlast(2);
list.addlast(3);
list.printlist();
int index = list.search(7);
if (index != -1){
    System.out.println("7 found at index "+ index);
}
else{
     System.out.println("7 not found");
}

}
}