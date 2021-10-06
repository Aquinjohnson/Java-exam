import java.io.*;
import java.util.Scanner;
class OddEven
{
  public static void main(String args[])
   {     
        int i;
        int a[] = new int[5];
        FileWriter f1 = new FileWriter("/home/exam/odd.txt");
        FileWriter f2 = new FileWriter("/home/exam/even.txt");
        FileWriter oe = new FileWriter("/home/exam/Oddeven.txt");
        Scanner sc = new Scanner(System.in);
        
        for(i=0;i<=5;i++)
           {
              a[i]=sc.nextInt();
              oe.write(i);
           }
            oe.close();
            FileReader fr = new FileReader("/home/exam/Oddeven.txt");
            BufferedReader br=new BufferedReader(fr);
            while(i!=-1)
              {
                  int c;
                  Scanner st = new Scanner(System.in);
                  c = st.nextInt();
                  if(c % 2 == 0)
                  f2.write(i);
                  else
                  f1.write(i);
                  f1.close();
                  f2.close();
                }
}
}


