public class Main {
    public static void main(String[] args)
    {
        double initialBalance = 5000;
        double INTEREST_RATE = .17;
        double interest = initialBalance * INTEREST_RATE;
        double firstMonth = interest * 1;
        double secondMonth = interest * 2;

        System.out.println("Your credit card balance is $" + initialBalance);
        System.out.println("Your interest rate is $" + interest);
        System.out.println("Your first month fee is $" + firstMonth);
        System.out.println("Your second month fee is $" + secondMonth);

    }
}