import java.util.*;
public class vowe
{
public static void main(String[] s)
{
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b="aeiouAEIOU";
int count=0;
for(int i=0;i<b.length();i++)
{
if(a.charAt(0)==b.charAt(i))
{
count++;
}
}
if(count>0)
System.out.println("vowel");
else
System.out.println("consonant");
}
}
