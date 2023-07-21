import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        boolean[] isPrime = new boolean[(int) (N + 1)];
        for (int i = 2; i <= N; i++) 
{
            isPrime[i] = true;
        }
        
        int count = 0;
        
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                count++;
                for (int j = i * 2; j <= N; j += i) 
{
                    isPrime[j] = false;
                }
            }
        }
        
        System.out.println(count);
    }
}