import java.util.Scanner;

public class Pattern11
{
public static void main(String[] args)
{
System.out.print("Enter the number: ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();

for(int i = 1; i <= n; i++)
{
for( int j = n; j > i; j--)
{
System.out.print(" ");
}
for(int k = 1; k <= i; k++)
{
if(i >= 2 && k > 1)
{
System.out.print(" ");
} else {
System.out.print("*");
}
}
System.out.println();
}
}
}