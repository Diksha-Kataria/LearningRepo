import java.util.*;
public class Pattern4 {
  
    public static void main(String[] args) 
    {
     
         int n, first = 0,next = 1;
          
            System.out.println("Enter the number: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            
            for (int i = 1; i<=n; ++i)
            {
for(int j=1; j<=i; j++){
System.out.print(" ");
}
for(int k=n; k>=i; k--){
System.out.print("*");
}
for(int l = n-1; l>=i; l--){
System.out.print("*");
}
System.out.println();
}
}
}
               