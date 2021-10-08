import java.util.Scanner;

public class Pattern13
{
public static void main(String[] args)
{
int n,i, j, k;
System.out.print("Enter the number: ");
Scanner scanner = new Scanner(System.in);
n = scanner.nextInt();

for(i = 1; i <= n; i++)
{
for(j = n-1; j >= i; j--)
{
System.out.print(" ");
}
for(k = 1; k <= i; k++)
{
System.out.print("*");
}
System.out.println();
}
for(i = 1; i <= n; i++)
{
for(j = 1; j<= i; j++)
{
System.out.print(" ");
}
for(k = n-1; k >= i; k--)
{
System.out.print("*");
}
System.out.println();
}
}
}