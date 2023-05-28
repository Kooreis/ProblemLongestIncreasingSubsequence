```C#
using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        int n = arr.Length;
        Console.WriteLine("Length of longest increasing subsequence is " + LongestIncreasingSubsequence(arr, n));
    }

    static int LongestIncreasingSubsequence(int[] arr, int n)
    {
        int[] tailTable = new int[n];
        int len;

        tailTable[0] = arr[0];
        len = 1;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] < tailTable[0])
                tailTable[0] = arr[i];

            else if (arr[i] > tailTable[len - 1])
                tailTable[len++] = arr[i];

            else
                tailTable[CeilIndex(tailTable, -1, len - 1, arr[i])] = arr[i];
        }

        return len;
    }

    static int CeilIndex(int[] arr, int l, int r, int key)
    {
        while (r - l > 1)
        {
            int m = l + (r - l) / 2;
            if (arr[m] >= key)
                r = m;
            else
                l = m;
        }

        return r;
    }
}
```