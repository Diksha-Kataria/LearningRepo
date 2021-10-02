import java.util.Scanner;

public class Pattern10
{
public static void main(String[] args)
{

System.out.print("Enter the number: ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();

for(int i = 1; i <= n; i++){
for(int j = 1; j <= i; j++){
System.out.print("* ");
}
System.out.println();
}
for(int i = 1; i <= n; i++){
for(int j = n-1; j >= i; j--){
System.out.print("* ");
}
System.out.println();
}
}
}