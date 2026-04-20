import java.util.*;
public class ATM
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int balance=25000;
        int pin=1234;
        int enteredPin;
        int amount;
        int choice;
        int attempts=0;
         while (attempts < 3) {
            System.out.print("ENTER YOUR PIN: ");
            enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                System.out.println("LOGIN SUCCESSFUL!\n");
                break;
            } else {
                attempts++;
                System.out.println("INCORRECT PIN!");
            }
        }

        if (attempts == 3) {
            System.out.println("CARD BLOCKED! TOO MANY ATTEMPTS.");
            return;
        }
        while(true){
            System.out.println("---ATM OPTIONS---");
            System.out.println("1.DEPOSITE\n");
            System.out.println("2.WITHDRAW\n");
            System.out.println("3.CHECK BALANCE\n");
            System.out.println("4.CHANGE PIN\n");
            System.out.println("5.EXIT\n");
            System.out.println("ENTER YOUR CHOICE FROM ABOVE OPTIONS\n");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                     System.out.print("ENTER  amount TO DEPOSIT\n");
                     amount=sc.nextInt();
                     balance=balance+amount;
                     System.out.println("DEPOSIT SUCCESFULLY...");
                     System.out.println("\n");
                    break;

                case 2:
                     System.out.println("ENTER amount TO WITHDRAW FROM CURRENT BALANCE\n");
                     amount=sc.nextInt();
                     if(balance>=amount)
                        {
                        balance=balance-amount;
                        System.out.println("WITHDRAW SUCCESSFULLY COMPLETED!!");
                        System.out.println("\n");
                }
                else{
                    System.out.println("INSUFFICENT BALANCE!");
                    System.out.println("\n");
                }
                    break; 
                case 3:
                     System.out.println("YOUR CURRENT BALANCE IS :"+ balance);
                     break;
                case 4:
                    System.out.print("ENTER OLD PIN: ");
                    int oldPin = sc.nextInt();

                    if (oldPin == pin) {
                        System.out.print("ENTER NEW PIN: ");
                        pin = sc.nextInt();
                        System.out.println("PIN CHANGED SUCCESSFULLY!");
                    } else {
                        System.out.println("WRONG PIN!");
                    }
                    break;
                case 5:
                    System.out.println("THANKS FOR VISITING.....");
                    System.out.println("\n");
                    System.exit(0);
                    break;
                default:System.out.println("INVALID CHOICE IS ENTERED !\n");
                System.out.println("PLEASE RE-ENTERE THE CHOICE/OPTION\n");
                break;
            }
            
            

        }
    }

}