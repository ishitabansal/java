import java.util.*;
class Call
{
float dur;
String type;
float rate()
{
if(type.equals("urgent"))
return 4.5f;
else if(type=="lightning")
return 3.5f;
else
return 3f;
}
}
class Bill extends Call
{
float amount;
void read()
{
Scanner input=new Scanner(System.in);
System.out.println("enter call type(urgent,lihtning,ordinary):");
type=input.next();
System.out.println("enter call duration");
dur=input.nextFloat();
}
void Calculate()
{
if(dur<=1.5)
amount=rate()*dur+1.5f;
else if(dur<=3)
amount=rate()*dur+2.5f;
else if(dur<=5)
amount=rate()*dur+4.5f;
else
amount=rate()*dur+5f;
}
void print()
{
System.out.println("************");
System.out.println("PHONE BILL");
System.out.println("**************");
System.out.println("call type:"+type);
System.out.println("duration:"+dur);
System.out.println("charge:"+amount);
System.out.println("***************");
}
}
class Telephone
{
public static void main(String args[])
{
Bill b=new Bill();
b.read();
b.Calculate();
b.print();
}
}     
