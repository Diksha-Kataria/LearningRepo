import java.util.Scanner;

public class Minimum
{
    public static void main(String args[])
    {
        int a, b, c, min;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Three Number : ");
        a = sc.nextInt();
        b = sc.nextInt();
c = sc.nextInt();
		
        if(a<=b && a<=c)  
System.out.println(a+" is the smallest number");  
//comparing b with a and b with c  
//if both conditions are true, prints b  
else if (b<=a && b<=c)  
System.out.println(b+" is the smallest number");  
else  
//prints c if the above conditions are false  
System.out.println(c+" is the smallest number");  
}
}