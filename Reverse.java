import java.util.Scanner;
public class Reverse   
{  
public static void main(String[] args)   
{ 
int reverse = 0; 
System.out.print("Enter the number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();  
while(n != 0)   
{  
int remainder = n % 10;  
reverse = reverse * 10 + remainder;  
n = n/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
} 