import java.util.*;

class question
{
   public static void main(String[] args)
{
    Scanner s= new Scanner(System.in);   
    System.out.print("Enter a string: ");  
        String sentence= s.nextLine();  
        String rev = reverse(sentence);
        System.out.println("the Reversed given string is "+rev);
  }
  public static String reverse(String s) 
{
    int i=s.indexOf(" ");
    
    if(i==-1)
      return s;
    
    return reverse(s.substring(i+1)) +" "+s.substring(0,i);
     }
}