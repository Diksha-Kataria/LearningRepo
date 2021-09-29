import java.util.Scanner;

class Pattern7
{
public static void main(String[] args)
{
int i, j, k;
System.out.println("Enter the number: ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
  
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
{
if( i == j || i + j == n-1)
{
System.out.print("*");
} else {
System.out.print(" ");
}
} 
System.out.println();
}
}
}