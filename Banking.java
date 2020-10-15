import java.util.*;

class Banking
{
    public static void main(String args[])
    {
      int n;
      Bank b=new Bank();
      Scanner scan=new Scanner(System.in);
      
      do
      {
          
      System.out.println("1. Creat Account ");
      System.out.println("2. Deposit ");
      System.out.println("3. Withdrawl ");
      System.out.println("4. Check Balance ");
      System.out.println("5. Exit :");
      
      System.out.println("Enter your choise :");
      n=scan.nextInt();
      
     switch(n)
      {
          case 1 : 
                   b.acc();
                   break;
                   
          case 2 : 
                   
                   b.deposit();
                   break;
                   
          case 3 : 
                   b.withd();
                   break;
                   
          case 4 : 
                   
                   b.display();
                   break; 
          
          case 5 : 
                   System.out.println("Good Bye ! ");
                   break; 
                   
          default : 
                   System.out.println("Enter valid choise ");
                   break;
                   
            
      }
      }while(n!=5);
      
      

    }
}

class Bank
{
    private String name;
    private int limit=500; 
    private long amt=0,bal=0,acc;
    
    Scanner in=new Scanner(System.in);
    
    void acc()
    {
        System.out.println("Enter your name :");
        name=in.nextLine();
        System.out.println("Enter account number :");
        acc=in.nextLong();
        deposit();
        
    }
    
    void deposit()
    {
        System.out.println("Enter amount");
        amt=in.nextLong();
        
        if(amt>=limit)
        {
           bal+=amt;
           System.out.println("Amount deposited successfully");
           display();
        }
        else 
        {
            System.out.println("Minimum balance should be Rs 500 ");
            deposit();
        }
    }
    
    void withd()
    {
        System.out.println("Enter the withdrawl amount : ");
        amt=in.nextLong();
        if(500<=bal-amt)
        {
            bal-=amt;
            display();
        }
        else
        {
            System.out.println("Not enough balance : ");
        }
        
        
    }
    
    void display()
    {
        System.out.println("Balance : Rs "+bal);
    }
    
   
    
}