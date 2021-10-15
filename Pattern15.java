import java.util.Scanner;

public class Pattern15
{
public static void main(String[] args)
{
int i, n, j;
System.out.println("Enter the number: ");
Scanner scanner = new Scanner(System.in);
n = scanner.nextInt();

for(i = 1; i <= n; i++){
for(j = 1; j <= n; j++){
if(i == 1 || j == 1 || i == n || j == n){
System.out.print("*");
} else {
System.out.print(" ");
}
}
System.out.println();
}
}
}