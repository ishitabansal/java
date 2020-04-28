import java.util.*;
interface pi
{
final double pi=3.14;
}
public class Solve implements pi
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your radius");
int r=sc.nextInt();
double s=pi*r*r;
System.out.println("The area of circle is:"+s);
}
}
