
Trapping Rain Water Problem
📌 Problem Statement
The **Trapping Rain Water Problem** is a classic **array-based DSA problem** where we are given `n` non-negative integers representing an elevation map (bars of different heights).
The task is to **find the total amount of water** that can be trapped between these bars after raining.
Analogy
Think of bars as walls of different heights.
If there's a **dip/valley** between two tall walls, water gets trapped in that valley.
The trapped water at each index depends on:
The **tallest bar on the left** of that index.
The **tallest bar on the right** of that index.
The water level at that index = `min(leftMax, rightMax)` – height of the current bar.

🧩 Example
Input:

Step-by-Step Visualization
Bars:

LeftMax = [4, 4, 4, 6, 6, 6, 6]
RightMax = [6, 6, 6, 6, 5, 5, 5]
Water trapped at each index:

Total Water Trapped = `0+2+4+0+2+3+0 = 11`

✅ Code Implementation (Java)

⏱️ Complexity Analysis
**Time Complexity:** `O(n)` (we traverse the array 3 times: leftMax, rightMax, final water calculation).
**Space Complexity:** `O(n)` (for storing leftMax and rightMax arrays).
🔹 There is also an **optimized approach** using two pointers with **O(1) extra space**, but this solution is easier to understand.

📚 References
LeetCode Problem: [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)
GeeksforGeeks Article: [Trapping Rain Water](https://www.geeksforgeeks.org/trapping-rain-water/)

👉 Do you want me to also give you the **optimized two-pointer approach (O(1) space)** explanation and code so you can add it as an "Advanced Section" in this README?
make reasdme file

Perfect 👍
Here’s a **professional README.md** for your `Array_TappingWater_Problem` code. I’ve structured it cleanly with definitions, analogy, a worked-out example, Java implementation, complexity analysis, and references. I’ll also prepare a placeholder for the **optimized two-pointer approach**, so you can extend it later if you wish.

***

# 🌊 Trapping Rain Water Problem

## 📌 Problem Statement

The **Trapping Rain Water** problem is a classic **array-based DSA problem**.

We are given `n` non-negative integers representing the heights of bars in an elevation map (like a histogram).
The task is to calculate the **total amount of water trapped** between the bars after rain.

***

## 🎯 Analogy

Think of the heights as walls of different heights:

- If there's a **valley** (dip) between two tall walls, **rainwater will accumulate there**.
- The water trapped at each bar depends on:
    - **The tallest bar to its left**
    - **The tallest bar to its right**
- So, **Water trapped at index `i` = min(leftMax[i], rightMax[i]) – height[i]**

***

## 🧩 Example

### Input

```text
Heights = [4, 2, 0, 3, 2, 5]
```


### Step-by-Step Visualization:

- **LeftMax** →
- **RightMax** →

**Water trapped at each index:**

```
Index:   0  1  2  3  4  5
Height:  4  2  0  3  2  5
Water:   0  2  4  1  2  0
```

**Total Water Trapped = 9**

***

## ✅ Code Implementation (Java)

```java
public class Array_TappingWater_Problem {

    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int water = 0;

        // Step 1: Fill leftMax
        leftMax[0] = height;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Step 2: Fill rightMax
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Step 3: Calculate water trapped
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println("Total water trapped: " + trap(height));
    }
}
```

**Output:**

```
Total water trapped: 9
```


***

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
(One pass for leftMax, one for rightMax, and one for water calculation)
- **Space Complexity:** `O(n)`
(for `leftMax[]` and `rightMax[]` arrays)

***

## 🚀 Optimized Approach (Two-Pointer, O(1) Space) *(Advanced)*

Another approach uses two pointers (`left` and `right`) without extra arrays:

- Move the pointer with the smaller height.
- Maintain running `leftMax` and `rightMax`.
- Compute trapped water on the fly.

👉 If you want, I can add the **optimized code snippet and explanation** as an "Advanced Section".

***

## 📚 References

- [LeetCode – Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)
- [GeeksforGeeks – Trapping Rain Water](https://www.geeksforgeeks.org/trapping-rain-water/)

***

✅ This README is clean, explains step-by-step, gives definition, example, code, complexity, and references.

👉 Do you want me to now **add that two-pointer optimized code** into this file as well so it looks complete with *both approaches*?

