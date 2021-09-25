import java.util.*;
public class Pattern3 {
  
    public static void main(String[] args) 
    {
            System.out.println("Enter the number: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            
            for (int i = 1; i<=n; i++)
            {
for(int j=n-1; j>=i; j--){
System.out.print(" ");
}
for(int k=1; k<=i; k++){
System.out.print(" *");
}
System.out.println();
}
}
}
               