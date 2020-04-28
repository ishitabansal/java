import java.util.*;
interface A
{
void meth1();
void meth2();
}
public class Myclass implements A
{
public void meth1()
{
System.out.println("This is meth1");
}
public void meth2()
{
System.out.println("This is meth2");
}
public static void main(String[] args)
{
Myclass m=new Myclass();
m.meth1();
m.meth2();
}
}
