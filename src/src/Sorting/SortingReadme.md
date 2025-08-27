9\
][  📘 Sorting Day – Complete Guide

Sorting is one of the most fundamental topics in Data Structures & Algorithms (DSA).  
This guide covers everything you should learn in **one full day of sorting practice** 🚀

---

## 🔹 1. Basics of Sorting
Before diving into algorithms, understand:
- **What is sorting?** → Rearranging data in increasing or decreasing order.  
- **Types of sorting:**  
  - **Internal Sorting** → fits in memory (arrays, lists).  
  - **External Sorting** → too big for memory (uses disk, e.g., Merge Sort with files).  

---

## 🔹 2. Simple (Brute-Force) Sorting
These are easy to learn but not efficient for large data.

### 2.1 Bubble Sort
- Repeatedly swap adjacent elements if they are in wrong order.  
- **Time Complexity:** `O(n^2)`  

### 2.2 Selection Sort
- Repeatedly pick the smallest (or largest) element and place it at correct position.  
- **Time Complexity:** `O(n^2)`  

### 2.3 Insertion Sort
- Build sorted part by inserting one by one.  
- **Time Complexity:** `O(n^2)` but fast for small/partially sorted arrays.  

👉 **Practice these first, so you get the intuition.**

---

## 🔹 3. Efficient Sorting
These are actually used in real-world.

### 3.1 Merge Sort
- Divide & Conquer → split, sort, and merge.  
- **Time Complexity:** `O(n log n)` (always).  

### 3.2 Quick Sort
- Partition-based sorting.  
- **Time Complexity:** Avg → `O(n log n)`, Worst → `O(n^2)` (but usually fastest).  

### 3.3 Heap Sort
- Uses heaps to build sorted order.  
- **Time Complexity:** `O(n log n)`  

👉 **These give you interview-level preparation.**

---

## 🔹 4. Special-Purpose Sorting
For specific cases (non-comparison based):

### 4.1 Counting Sort
- Works with integer ranges.  
- **Time Complexity:** `O(n + k)`  

### 4.2 Radix Sort
- Digit-by-digit sorting.  
- **Time Complexity:** `O(nk)`  

### 4.3 Bucket Sort
- Distributes numbers into buckets and sorts individually.  
- **Time Complexity:** `O(n + k)`  

👉 Used when input is integers, limited range, or uniformly distributed.

---

## 🔹 5. Real-World Sorting
- In **Java** → `Arrays.sort()` → dual-pivot quicksort (for primitives), Timsort (for objects).  
- In **Python** → `sorted()` → Timsort (merge + insertion hybrid).  

---

## 🔹 6. What to Do Today (Plan)
✅ Implement **Bubble, Selection, Insertion** → understand swaps & comparisons.  
✅ Move to **Merge & Quick Sort** → recursion and partition logic.  
✅ Try solving a few problems on **LeetCode / Codeforces** (sorting-based).  

---

## 🎯 Final Note
Sorting is the **foundation of many algorithms**. Once you master it, you’ll be more confident in tackling problems like searching, greedy, and graph algorithms.

Happy Coding 🚀
