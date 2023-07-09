package Abstract;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SBIATM implements ATMInterface
{
    static Scanner sc= new Scanner(System.in);
    double balance;
    int pin;
    int NewPin1;
    public void withDrawl(){

        System.out.println("Insert the Atm card");
        System.out.println("Enter your pin");
        int pin2=sc.nextInt();
        boolean flag= true;
        while(flag)
        {
            if(this.pin!=pin2)
            {
                System.out.println("Incorrect pin");
                System.out.println("Enter the correct pin");
                pin2 = sc.nextInt();
            }
            else if(this.pin==pin2)
            {
                System.out.println("Enter the Amount");
                double Amt=sc.nextDouble();
                 System.out.println("Available balance is" + (this.balance-Amt));
                flag=false;
            }
        }
    }
    public void balanceCheck()
    {
        System.out.println("Insert your Card");
        System.out.println("Enter your pin");
        int pin3=sc.nextInt();
        boolean flag= true;
        while(flag)
        {
            if(this.pin!=pin3)
            {
                System.out.println("Incorrect pin");
                System.out.println("Enter the correct pin");
                pin3 = sc.nextInt();
            }
            else if(this.pin==pin3)
            {
                System.out.println("Available Balance is" + this.balance);
                flag=false;
            }
        }
    }
    public void changePin()
    {
        System.out.println("Insert your card");
        System.out.println("Enter your old pin");
        int pin4=sc.nextInt();
        boolean flag= true;
        while(flag)
        {
            if(this.pin!=pin4)
            {
                System.out.println("Incorrect pin");
                System.out.println("Enter the correct pin");
                pin4 = sc.nextInt();
            }
            else if(this.pin==pin4)
            {
                System.out.println("Enter your new pin");
                int NewPin=sc.nextInt();
                System.out.println("Confirm your new pin");
                this.NewPin1=sc.nextInt();
                if(NewPin==this.NewPin1)
                {
                    System.out.println("Your pin is changed");
                }
                else
                {
                    System.out.println("Your pin is incorrect");
                }
                flag=false;
            }
        }
    }
    public void deposit()
    {
        System.out.println("Insert your Card");
        System.out.println("Enter your pin");
        int pin5=sc.nextInt();
        boolean flag= true;
        while(flag)
        {
            if(this.pin!=pin5)
            {
                System.out.println("Incorrect pin");
                System.out.println("Enter the correct pin");
                pin5 = sc.nextInt();
            }
            else if(this.pin==pin5)
            {
                System.out.println("Enter amount to be deposit");
                double AmtDeposit=sc.nextDouble();
                System.out.println("Available Balance is" + (this.balance+AmtDeposit));
                flag=false;
            }
        }
    }



    public static void main(String[] args) {
        SBIATM s=new SBIATM();
        s.balance=40000;
        s.pin=4567;
        boolean flag=true;
        System.out.println("Press 1 for deposit \n Press 2 for Withdrawl \n Press 3 for Balance check \n Press 4 for Change Pin");
        while(flag)
        {
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
            switch (choice)
            {
                case 1 :
                {
                    s.deposit();
                    s.pin=s.NewPin1;
                    break;
                }
                case 2:
                {
                    s.withDrawl();
                    s.pin=s.NewPin1;
                    break;
                }
                case 3:
                {
                    s.balanceCheck();
                    s.pin=s.NewPin1;
                    break;
                }
                case 4:
                {
                    s.changePin();
                    s.pin=s.NewPin1;
                    break;
                }
                default :
                {
                    flag=false;
                    System.out.println("Exit");
                }
            }

        }
    }
}
