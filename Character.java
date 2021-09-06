import java.util.Scanner;
public class Character  
{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();   
          
        //Displays individual characters from given string  
        System.out.println("Individual characters from given string:");  
          
        //Iterate through the string and display individual character  
        for(int i = 0; i < str.length(); i++){  
            System.out.print(str.charAt(i) + "  ");  
        }  
    }  
}  