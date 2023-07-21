    
 import java.io.*;
class numbers; 
{
static int fact(int n)
{
 int m, w, n, k;
    m = 7;
    w = 6;
    n = 5;
    k = 3;
    int fact = 1;
    for (int i = 2; i <= n; i++)
        fact *= i;
    return fact;
}
static int ncr(int n, int r)
{
    int ncr = fact(n) / (fact(r) * fact(n - r));
    return ncr;
}
static int ways(int m, int w, int n, int k)
{
 
    int ans = 0;
    while (m >= k) 
{
        ans += ncr(m, k) * ncr(w, n - k);
        k += 1;
    }
 
    return ans;
}
    
    System.out.println( ways(m, w, n, k));
    }
}
