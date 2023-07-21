import java.util.Scanner;


public class FlamesGame 
{

 
 public static void main(String[] args)
 {
   
 Scanner scanner = new Scanner(System.in);
  
  System.out.println("Please enter 1st name: ");
 
   String name1 = scanner.nextLine();
  
  System.out.println("Please enter your 2nd name: ");
  
  String name2 = scanner.nextLine();
    
  
  int count = 0;
 
   for (int i = 0; i < name1.length(); i++) 
{
  
    for (int j = 0; j < name2.length(); j++)
 {
      
  if (name1.charAt(i) == name2.charAt(j)) 
{
      
    count++;
     
   }
   
   }
   
 }
 
   int totalCount = name1.length() + name2.length() - (2 * count);
 
   
    String flames = "FLAMES";
  
  int flamesCount = 0;
    

    while (flames.length() != 1)
 {
   
   flamesCount = (totalCount % flames.length()) - 1;
   
   if (flamesCount >= 0)
 {
 
       flames = flames.substring(0, flamesCount) + flames.substring(flamesCount + 1);
 
     } 
else
 {
     
   flames = flames.substring(0, flames.length() - 1);
   
   }
    }
    
 
   System.out.println("Result: ");
 
   switch (flames)
 {
    
  case "F":
      
  System.out.println("love");
      
  break;
    
  case "L":
      
  System.out.println(" Friends");
      
  break;
     
 case "A":
      
  System.out.println(" Affection!");
      
  break;
    
  case "M":
       
 System.out.println("You two are ready to get Married!");
     
   break;
     
 case "E":
       
 System.out.println("You two are Enemies!");
    
    break;
   
   case "S":
  
      System.out.println("You two are Soulmates!");

}
}
}