import java.util.*;
interface method
{
void div();
void mod();
}
public class Overriding implements method
{
public void div()
{
System.out.println("division method for class");
}
public void mod()
{
System.out.println("modulo method for class");
}
public static void main(String[] args)
{
Overriding obj=new Overriding();
obj.div();
obj.mod();
}
}
