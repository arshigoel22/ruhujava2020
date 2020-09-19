package com.beginnersbook.string;
public class LongToString
{
public static void main(String []args)
{
long lvar=123;
String str=String.valueOf(lvar);
System.out.println("String is: "+str);
long lvar2=200;
String str2=Long.toString(lvar2);
System.out.println("String2 is: "+str2);
}
}