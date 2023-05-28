Here is a Python console application that finds the longest increasing subsequence in an array:

```python
def longest_increasing_subsequence(arr):
    n = len(arr)
    lis = [1] * n
    for i in range (1 , n):
        for j in range(0 , i):
            if arr[i] > arr[j] and lis[i]< lis[j] + 1 :
                lis[i] = lis[j]+1
    maximum = 0
    for i in range(len(lis)):
        maximum = max(maximum , lis[i])
    return maximum

arr = list(map(int, input("Enter the array elements: ").split()))
print("Length of longest increasing subsequence is ", longest_increasing_subsequence(arr))
```

In this application, you can input the array elements separated by space. The application will then find the longest increasing subsequence in the array and print its length.