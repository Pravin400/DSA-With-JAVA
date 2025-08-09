
# Only and could you can add the output of that. will. Beneficial to understand.

Got it ✅
You want me to enhance the **Day 3 README** by **adding the expected outputs** for each problem’s example — so anyone reading it can understand the concept and also see what the program will produce.

Here’s the **updated README with outputs included**:

***

# 🚀 100 Days of DSA – Day 3 (Arrays)

## 📅 Overview

This repository contains my learning and code implementations for **Day 3** of the coding challenge.
Main focus: mastering **array operations** and **subarray sum problems**, along with implementing efficient algorithms.

***

## 📚 Topics Covered, Sample Code \& Outputs

### 1. Reverse an Array

**Definition:** Reverse the order of elements in the array.

**Example:**
Input → ``**Output:**``

```java
for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

**Time Complexity:** O(n)
**Space Complexity:** O(1)

***

### 2. Array Pairs

**Definition:** Print all possible pairs from an array.

**Example:**
Input → ``
**Output:**

```
(1, 2)
(1, 3)
(2, 3)
```

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        System.out.println("(" + arr[i] + ", " + arr[j] + ")");
    }
}
```

**Time Complexity:** O(n²)

***

### 3. Print All Subarrays

**Definition:** Generate and print all contiguous subarrays.

**Example:**
Input → ``
**Output:**

```
1
1 2
2
```

```java
for (int start = 0; start < arr.length; start++) {
    for (int end = start; end < arr.length; end++) {
        for (int k = start; k <= end; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
```

**Time Complexity:** O(n²)

***

### 4. Subarray Sum (Max \& Min)

**Definition:** Find the maximum and minimum sum among all subarrays.

**Example:**
Input → `[2, -1, 3]`
**Output:**

```
Maximum Subarray Sum: 4
Minimum Subarray Sum: -1
```

```java
int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
for (int start = 0; start < arr.length; start++) {
    int sum = 0;
    for (int end = start; end < arr.length; end++) {
        sum += arr[end];
        maxSum = Math.max(maxSum, sum);
        minSum = Math.min(minSum, sum);
    }
}
```

**Time Complexity:** O(n²)

***

### 5. Prefix Sum

**Definition:** A prefix sum array stores the cumulative sum up to each index.

**Example:**
Input → ``**Output:**``

```java
int[] prefixSum = new int[arr.length];
prefixSum[0] = arr[0];
for (int i = 1; i < arr.length; i++) {
    prefixSum[i] = prefixSum[i - 1] + arr[i];
}
```

**Use case:** Speeds up range sum queries from O(n) to O(1).

***

### 6. Maximum Subarray Sum — Kadane’s Algorithm

**Definition:** Finds the contiguous subarray with the largest sum efficiently.

**Example:**
Input → `[-2, -3, 4, -1, -2, 1, 5, -3]`
**Output:** `7` (from subarray `[4, -1, -2, 1, 5]`)

```java
int maxSum = arr[0], currSum = arr[0];
for (int i = 1; i < arr.length; i++) {
    currSum = Math.max(arr[i], currSum + arr[i]);
    maxSum = Math.max(maxSum, currSum);
}
```

**Time Complexity:** O(n)

***

## 🛠 Problems Completed

- Reverse Array ✅
- Array Pairs ✅
- Print All Subarrays ✅
- Subarray Sum (Max \& Min) ✅
- Prefix Sum ✅
- Kadane’s Algorithm ✅

***

## 💡 Next Steps

- Trapping Rain Water
- Best Time to Buy \& Sell Stock

***

If you want, I can now **add visuals/diagrams** for these Day 3 problems so they’re even easier to grasp for beginners.
Do you want me to make that illustrated version next?

