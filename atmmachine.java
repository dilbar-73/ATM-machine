import java.util.Scanner;

class ATM 
{
    Scanner sc=new Scanner(System.in);
    float balance;
    int pin=7777;
    public void menu()
    {
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.CHECK A/C BALANCE");
        System.out.println("2.WITHDRAWL MONEY");
        System.out.println("3.DEPOSITE MONEY");
        System.out.println("4.EXIT");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkbalance();
        }
        else if(opt==2){
            withdrawmoney();
        }
        else if(opt==3){
            Depositemoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("ENTER A VALID CHOICE");
        } 
    }
    public void checkpin()
    {
        System.out.println("ENTER YOUR PIN");
        int enteredpin=sc.nextInt();
        if(enteredpin==pin)
        {
            menu();
        }
        else
        {
            System.out.println("ENTER A VALID PIN");
            menu();
        }
    }
    public void checkbalance()
    {
        System.out.println("YOUR BALANCE IS:" +balance);
        menu();
    }
    public void withdrawmoney()
    {
        System.out.println("ENTERED AMOUNT IS WITHDRAWL");
        float amount=sc.nextFloat();
        if(amount>balance)
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
        else
        {
            balance=balance-amount;
            System.out.println("AMOUNT WITHDRAWL SUCCESFULLY");
            System.out.println("YOUR BALANCE IS:" +balance);
            menu();
        }
    }
    public void Depositemoney()
    {
        System.out.println("ENTERED AMOUNT IS DEPOSITE:");
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("AMOUNT DEPOSITE SUCCESFULLY");
        System.out.println("YOUR BALANCE IS:" +balance);
        menu();
    }
    class atm{
        public static void main(String[] args) {
    }
    }
        public static void main(String[] args) {
            ATM obj=new ATM();
            obj.checkpin();
    }
    
}

