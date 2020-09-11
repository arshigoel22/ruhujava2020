import java.util.Scanner;
 class days 
{
 public static void main(String []args)
{
 Scanner Sc=new Scanner(System.in);
  int n;
 System.out.println("enter the value of n=");
 n=Sc.nextInt();

 if(n==1)
 System.out.println("monday");
 else if(n==2)
 System.out.println("tuesday");
 else if(n==3)
 System.out.println("wednesday");
 else if(n==4)
 System.out.println("thursday");
 else if(n==5)
 System.out.println("friday");
 else if(n==6)
 System.out.println("saturday");
 else if(n==7)
 System.out.println("sunday");
 else
 System.out.print("invalid input");
}
}
 
                                              