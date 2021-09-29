import java.util.Scanner;

class Pattern9
{
public static void main(String[] args)
{
int i, j, k;
System.out.println("Enter the number: ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
  
for(i = n; i >= 1; i--)
{
for(j = n; j > i; j--)
{
System.out.print(" ");
}
for(k = 1; k < (i*2); k++)
{
if( k > 1 && k < (i*2)-1)
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