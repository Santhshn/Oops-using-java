import java.io.*;
import java.util.*;
public class triplets
{
public static void main(String args[])
 {
    for (int i = 0; i < n; i++) 
{
      for (int j = i + 1; j < n; j++) 
{
        for(int k = j + 1; k < n; k++)
 {
          if((arr[i]+arr[j]==arr[k]) || (arr[i]+arr[k]==arr[j]) || (arr[j]+arr[k]==arr[i])) 
{
            System.out.println("Numbers are: " + arr[i] + " " + arr[j] + " " + arr[k]);
            return;
          }
        }
      }
    }
    System.out.println("No such triplet exists");
  }
 