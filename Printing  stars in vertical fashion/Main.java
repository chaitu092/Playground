import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner (System.in);
    int n= in.nextInt();
    int starcount;
    for (starcount = 1;starcount <= n;starcount++)
    {
      System.out.print("*");
      System.out.print("\n");
    }
  }
}