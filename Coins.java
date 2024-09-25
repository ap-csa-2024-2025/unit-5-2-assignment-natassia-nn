public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(259);
  }

  public static void coinConverter(int p)
  {
    int dollars = (p/100);
    int quarters = (p%100/25);
    int dimes = (p%100%25/10);
    int nickels = (p%100%25%10/5);
    int pennies = (p%100%25%10%5);
    System.out.println("Dollar Bills: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
  }

}
