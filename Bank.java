class Accounts {
    public String name;
    protected String email;
    private int password ;

public int getpassword(){ //getter//in getter simply just create a function and return it with this
    return this.password;
}
public void  setpassword(int pass ){  //setter//in setter create a function set this pass to some other variable then call
    //the setter pass the parameter you setted with this. to set
    this.password =pass;

}
}
public class Bank{
    public static void main(String[]args){
        Accounts account1 = new Accounts();
        account1.name = "anas memon";
        account1.email ="anusmeon9@gmail.com";
        account1.setpassword(110805);
    
        System.out.println("password was set succesfully");
        System.out.println("retrived password was;" + account1.getpassword());
        
    }
}