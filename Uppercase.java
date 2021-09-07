import java.util.Scanner;
public class Uppercase
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any character: ");
char ch = scanner.next().charAt(0);
if(ch>=A && ch<=Z)
{
System.out.println(ch+ "is an uppercase character");
} else{
System.out.println(ch+ "is a lowercase character");
}
}
}