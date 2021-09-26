import java.util.*;

public class Pattern6
{
public static void main(String[] args)
{
int i, j, row;

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows: ");
row = scanner.nextInt();

for(i=0; i<row; i++)
{ 
for(j=0; j<=i; j++)
{
 System.out.print(" *");
}
System.out.println();
}
}
}

