import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        StringBuffer sb=new StringBuffer(s);
        String b=sb.reverse().toString();
        if(s.equals(b))
            System.out.print(n);
        else{
            for(i=n-1;i>=0;i--){
                String s1=String.valueOf(i);
                StringBuffer sb1=new StringBuffer(s1);
                String b1=sb1.reverse().toString();
                if(s1.equals(b1))
                    break;
            }
            for(j=n+1;j<=999;j++){
                String s2=String.valueOf(j);
                StringBuffer sb2=new StringBuffer(s2);
                String b2=sb2.reverse().toString();
                if(s2.equals(b2))
                    break;
            }
            int ans1=n-i;
            int ans2=j-n;
            
            if(ans1>ans2)
                System.out.println(j);
            else
                System.out.println(i);
        }
    }
}