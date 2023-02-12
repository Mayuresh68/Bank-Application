import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name,Password and initial amount");
        String name=sc.next();
        String password=sc.next();
        int balance=sc.nextInt();

        SBIAccount empAcc = new SBIAccount(name,balance,password);

        System.out.println("Your account has been created with account number: "+empAcc.getAccountNo());

        //getBalance
        System.out.println("Your current Balance : "+empAcc.getBalance());

        //deposit
        System.out.println(empAcc.depositMoney(500));
        System.out.println("new balance is:"+empAcc.getBalance());

        //withdraw
        System.out.println("enter amount to be withdrawn");
        int amount=sc.nextInt();
        System.out.println("enter your password");
        String enteredPassword = sc.next();

        System.out.println(empAcc.withdraw(amount,enteredPassword));
        System.out.println("currunt balance is: "+ empAcc.getBalance());

        // ineterst
        System.out.println("Interest for 4 years on current balance "+empAcc.getBalance()+" is "+empAcc.calculateInterest(4));
    }
}