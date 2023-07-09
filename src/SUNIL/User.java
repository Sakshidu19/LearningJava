package SUNIL;

import java.util.Scanner;
public class User implements ATM{
     static Scanner sc=new Scanner(System.in);
        static double balance=20000;
        static int PIN =1234;

        public void checkBal(){
            System.out.println("Enter your Card");
            System.out.println("Enter your pin");
            int pin=sc.nextInt();
            if(PIN==pin)
            {
                System.out.println("Your Balance is : " +this.balance);
            }
            else{
                System.out.println("Incorrect Pin");
            }


        }
        public void changePIN(){
            System.out.println("Insert your card");
            System.out.println("Enter your old Pin");
            int pin=sc.nextInt();
            if(PIN==pin)
            {
                System.out.println("Enter new Pin");
                int newPin=sc.nextInt();
                System.out.println("Confirm your Pin");
                int newPin1=sc.nextInt();
                System.out.println("PIN is successfully Changed");
                System.out.println("Remove your card");
            }
            else{
                System.out.println("Incorrect Pin");
            }

        }
        public double withDrawl(double balance){
            System.out.println("Insert your Card");
            System.out.println("Enter your pin");
            int pin=sc.nextInt();
            if(PIN==pin)
            {
                System.out.println("Enter amount for Withdrawl");
                balance=sc.nextDouble();
                System.out.println("Your Balance is : " +(this.balance-balance));
            }
            else{
                System.out.println("Incorrect Pin");
            }
            return (balance);
        }
        public double deposit(double amount){
            System.out.println("Insert your card");
            System.out.println("Enter your pin");
            int pin=sc.nextInt();
            if(PIN==pin)
            {
                System.out.println("Enter amount to be deposit");
                amount=sc.nextDouble();
                System.out.println("Your Balance is : " +(this.balance+amount));
            }
            else{
                System.out.println("Incorrect Pin");
            }
            return (amount);
        }
        public static void main(String[] args) {
            User u=new User();
            System.out.println("what do you Want to do");
            boolean flag=true;
            while(flag==true)
            {
                System.out.println(" 1. Deposit \n 2. Check Balance \n 3. Withdrawl \n 4. Change PIN \n 5. Exit ");
                int choice=sc.nextInt();
                // System.out.println(" 1. Deposit \n 2. Check Balance \n 3. Withdrawl \n 4. Change PIN \n 5. Exit "
                switch (choice) {
                    case 1:{
                        u.deposit(balance);
                        break;

                    }
                    case 2: {
                        u.checkBal();
                        break;
                    }
                    case 3 :{
                        u.withDrawl(balance);
                        break;
                    }
                    case 4 :{
                        u.changePIN();
                        break;
                    }
                    default:
                    {
                        flag=false;
                        System.out.println("Exit");
                        break;
                    }
                }
            }
        }
    }

