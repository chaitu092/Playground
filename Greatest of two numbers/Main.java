import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      if (num1>num2)
      {
        System.out.println("num1 is the greatest number");
      }
      else
      {
        System.out.println("num2 is the greatest number");
      }
	}
}