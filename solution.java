Here is a Java console application that solves the problem:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Length of longest increasing subsequence: " + longestIncreasingSubsequence(arr));
    }

    static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        int i, j, max = 0;

        for (i = 0; i < n; i++) {
            lis[i] = 1;
        }

        for (i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        for (i = 0; i < n; i++) {
            if (max < lis[i]) {
                max = lis[i];
            }
        }

        return max;
    }
}
```

This console application first takes the length of the array and the elements of the array as input from the user. Then it calculates the length of the longest increasing subsequence in the array using dynamic programming and prints it.