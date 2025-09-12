# 📘 Merge Sort – Comprehensive Guide

## 🔹 1. Overview

**Merge Sort** is a classic **Divide and Conquer** algorithm used for sorting.  
It works by **dividing** the array into smaller subarrays, **sorting** each recursively, and finally **merging** them back into a single sorted array.

*Invented by **John von Neumann** in 1945.*

---

## 🔹 2. Core Concept

1. **Divide** – Split the array into two halves.
2. **Conquer** – Recursively sort each half.
3. **Combine** – Merge the two sorted halves into a fully sorted array.

**Analogy:**  
Imagine a large pile of unsorted playing cards:  
- First, split the pile into two smaller piles.  
- Sort each pile separately.  
- Finally, merge the two sorted piles into one perfectly ordered stack.

---

## 🔹 3. Algorithm Steps

For an array `arr[l…r]`:

1. **Divide:** Find the middle index `m = (l + r) / 2`.
2. **Conquer:** Recursively sort `arr[l…m]` and `arr[m+1…r]`.
3. **Combine:** Merge the two sorted subarrays back into a single sorted segment.

---

## 🔹 4. Pseudocode

```

mergeSort(arr, left, right):
if left < right:
mid = (left + right) / 2
mergeSort(arr, left, mid)
mergeSort(arr, mid + 1, right)
merge(arr, left, mid, right)

merge(arr, left, mid, right):
create temp arrays L\[] and R\[]
copy data into L\[] and R\[]
merge L\[] and R\[] into arr\[left…right]

```

---

## 🔹 5. Step-by-Step Example

Sort the array: `[38, 27, 43, 3, 9, 82, 10]`

1. **Divide:** `[38, 27, 43, 3]` and `[9, 82, 10]`
2. Sort left `[38, 27, 43, 3]` → divide → `[38, 27]` & `[43, 3]`
   * `[38, 27]` → `[27, 38]`
   * `[43, 3]` → `[3, 43]`
   * Merge → `[3, 27, 38, 43]`
3. Sort right `[9, 82, 10]` → `[9]` & `[82, 10]`
   * `[82, 10]` → `[10, 82]`
   * Merge → `[9, 10, 82]`
4. Final Merge → `[3, 9, 10, 27, 38, 43, 82]` ✅

---

## 🔹 6. Time Complexity

| Case         | Complexity |
| ------------ | ---------- |
| Best         | `O(n log n)` |
| Average      | `O(n log n)` |
| Worst        | `O(n log n)` |

**Reason:**  
- The array is halved repeatedly → `log n` levels.  
- Each level requires merging → `O(n)`.  
- Total = `O(n log n)`.

---

## 🔹 7. Space Complexity

* Requires **`O(n)`** extra space for temporary arrays.

---

## 🔹 8. Stability

*Merge Sort is a **stable algorithm**.*  
Equal elements retain their original order.

*Example:*  
If two students have the same marks, their roll number order remains unchanged.

---

## 🔹 9. Advantages

✅ Predictable `O(n log n)` performance regardless of input.  
✅ Stable sort (maintains relative order of equal elements).  
✅ Excellent for **linked lists** (can be implemented in-place).  
✅ Ideal for **external sorting** (huge datasets stored on disk).

---

## 🔹 10. Disadvantages

❌ Needs extra memory (`O(n)`) for temporary arrays.  
❌ Slower than simple algorithms like Insertion Sort for very small datasets.

---