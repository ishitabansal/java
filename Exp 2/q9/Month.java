import java.util.Scanner;
public class Month 
{
 public static void main(String[] args)
 {
 Scanner input = new Scanner(System.in);
 String Month_of_name;
 System.out.println("Input a month number");
 int Month = input.nextInt();
 switch (Month)
 {
  case 1:
  Month_of_name = "january";
  System.out.println("january");
  break;
  case 2:
  Month_of_name = "febuary";
  System.out.println("febuary");
  break;
  case 3:
  Month_of_name = "march";
  System.out.println("march");
  break;
  case 4:
  Month_of_name = "april";
  System.out.println("april");
  break;
  case 5:
  Month_of_name = "may";
  System.out.println("may");
  break;
  case 6:
  Month_of_name = "june";
  System.out.println("june");
  break;
  case 7:
  Month_of_name = "july";
  System.out.println("july");
  break;
  case 8:
  Month_of_name = "august";
  System.out.println("august");
  break;
  case 9:
  Month_of_name = "september";
  System.out.println("september");
  break;
  case 10:
  Month_of_name = "october";
  System.out.println("october");
  break;
  case 11:
  Month_of_name = "november";
  System.out.println("november");
  break;
  case 12:
  Month_of_name = "december";
  System.out.println("december");
  break;
  default:
  System.out.println("Month is not found");
  break;
}
}
} 
