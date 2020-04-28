import java.util.*;
interface test
{
void square(int num);
}
class arithmetic implements test
{
public void square(int num)
{
int b=num*num;
System.out.println(b);
}
}
public class Lab5
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
arithmetic s=new arithmetic();
s.square(a);
sc.close();
}
}
