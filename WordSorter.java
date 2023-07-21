import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class WordSorter
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
        scanner.nextLine();
          String input = scanner.nextLine();
         String[] words = input.split(" ");
         Arrays.sort(words, Comparator.comparing(WordSorter::getAsciiValue));
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
    
    private static int getAsciiValue(String word)
{
        int sum = 0;
        
        for (int i = 0; i < word.length(); i++) 
{
            sum += word.charAt(i);
        }
        
        return sum;
    }
}