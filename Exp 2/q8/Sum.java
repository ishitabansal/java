import java.util.Scanner;
public class Sum
{
 public static void main(String args[])
 {
  int n, sum = 0;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter no.of elements for array");
  n = s.nextInt();
  int a[] = new int[n];
  System.out.println("enter all the elements");
  for(int i=0; i<n; i++)
  {
   a[i] = s.nextInt();
   sum = sum + a[i];
  }
 System.out.println("sum"+sum);
 }
}