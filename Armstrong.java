import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {

       int temp, total = 0;
System.out.println("Enter the number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
       int originalNumber = n;
        while (n != 0)
        {
            temp = n % 10;
            total = total + temp*temp*temp;
            n /= 10;
        }

        if(total == originalNumber)
            System.out.println(originalNumber + " is an Armstrong number");
        else
            System.out.println(originalNumber + " is not an Armstrong number");
    }
}