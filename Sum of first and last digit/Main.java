import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in =new Scanner(System.in);
      int n = in.nextInt();
      int last_digit = n%10;
      while (n >= 10)
      {
        n=n/10;
      }
      int sum = last_digit + n;
      System.out.print(sum);
	}
}