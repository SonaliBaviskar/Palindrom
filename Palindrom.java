import java.util.*;
class Palindrom
{
    public static void main(String args[])
    {
        String original ="";
        String reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        original = sc.nextLine();
        
        for(int i =original.length()-1;i>=0;i--)
        {
        reverse = reverse + original.charAt(i);
        }
    
       if(original.equals(reverse))
        {
            System.out.println("Enter Word is Palindrom");
        }
        else
        {
         System.out.println("Not palindrom");   
        }
             
    }
}

        