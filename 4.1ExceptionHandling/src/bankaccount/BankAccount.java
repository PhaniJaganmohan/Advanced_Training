package bankaccount;

class BankAccount {
    int account_number;
    String customer_name;
    String account_type;
    double balance;
   
    public int getAccount_number() {
        return account_number;
    }
   
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
   
    public String getName() {
        return customer_name;
    }
   
    public void setName(String customer_name) {
        this.customer_name = customer_name;
    }
   
    public String getAccount_type() {
        return account_type;
    }
   
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
   
    public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException nw)
        {
            System.out.println("Balance is less than 500");
        }
        }
       
       
        return balance;
       
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }//end setter and getter

    public BankAccount() {
       
        this.account_number = 100;
        this.customer_name = "nischith";
        this.account_type = "Saving";
        this.balance = 400;
    }
   
   
   
   
    public BankAccount(int account_number, String customer_name, String account_type,
            double balance) {
       
        this.account_number = account_number;
        this.customer_name = customer_name;
        this.account_type = account_type;
        this.balance = balance;
    }
    void deposit(double amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf)
            {
                System.out.println("Negaive Amount cant be deposited");
            }
        }
        else
        {
            balance=getBalance()+amt;
            System.out.println("Current balance is ="+balance);
           
        }
       
       
       
    }
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException nf)
                {
                    System.out.println("WE CANT DEPOSITE AMOUNT INSUFFICENT BALANCE ");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
       
       
       
       
       
    }
     void display()
     {
    System.out.println("Balance is ="+getBalance());   
     }
   
   
   
   
    public static void main(String[] args) {
       
       
        BankAccount b=new BankAccount();
        b.deposit(2000);
        b.display();
        b.withdraw(500);
        b.display();
        b.withdraw(2000);
        b.getBalance();
        b.display();
       
       
       
    }
   
   
   
   
}