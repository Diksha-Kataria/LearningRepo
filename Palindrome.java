import java.util.Scanner;

public class Palindrome
{
public static void main(String[] args)
{
int rem, rev = 0, originalNumber = 0;

System.out.print("Enter the number: ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();

originalNumber = n;
while(n != 0){
rem = n % 10;
rev = rev * 10 + rem;
n = n / 10;
}
if(originalNumber == rev){
System.out.println(originalNumber + " is palindrome.");
} else {
System.out.println(originalNumber + " is not palindrome.");
}
}
}