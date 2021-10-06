import java.io.*;
import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
 int i,num,f;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number");
 num = sc.nextInt();
 for(i=0;i<=num;i++)
 {
   f=num*i;
 }
 System.out.println("The factorial of number is" +f);
 }
 }
