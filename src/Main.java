public class Main
{
    public static void main(String[] args)
    {
        int balance = 5000;
        double mon1Balance = 0;
        double interest = 0.17;
        double mon2Balance = 0;

        mon1Balance = balance * interest;
        mon2Balance = mon1Balance * interest;

        System.out.println("The interest due after 1 month is " + mon1Balance);

        mon2Balance = (mon1Balance + balance) * interest;

        System.out.println("The interest due after 2 months is " + mon2Balance);
        





    }
}