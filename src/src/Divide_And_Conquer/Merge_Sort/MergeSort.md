# 📘 Merge Sort in Detail

## 🔹 1. What is Merge Sort?

* **Merge Sort** is a **Divide and Conquer** based sorting algorithm.
* It **divides** the array into halves, **sorts** them recursively, and then **merges** the sorted halves.
* Developed by **John von Neumann in 1945**.

---

## 🔹 2. Key Idea

1. **Divide** → Split the array into two halves.
2. **Conquer** → Sort each half recursively.
3. **Combine** → Merge the two sorted halves into a single sorted array.

**Analogy:**
Imagine you want to sort **a big pile of cards**.

* First, split the pile into two smaller piles.
* Sort each pile separately.
* Finally, merge both piles in order to get the sorted pile.

---

## 🔹 3. Algorithm Steps

Given an array `arr[l..r]`:

1. **Divide**: Find the middle index `m = (l+r)/2`.
2. **Conquer**: Recursively sort `arr[l..m]` and `arr[m+1..r]`.
3. **Combine**: Merge the two sorted subarrays into a sorted array.

---

## 🔹 4. Pseudocode

```
mergeSort(arr, left, right):
    if left < right:
        mid = (left + right) / 2
        mergeSort(arr, left, mid)
        mergeSort(arr, mid+1, right)
        merge(arr, left, mid, right)

merge(arr, left, mid, right):
    create temp arrays L[] and R[]
    copy data into L[] and R[]
    merge L[] and R[] into arr[left..right]
```

---

## 🔹 5. Example Walkthrough

Let’s sort `[38, 27, 43, 3, 9, 82, 10]`.

1. **Divide** → `[38, 27, 43, 3]` and `[9, 82, 10]`
2. Sort left part `[38, 27, 43, 3]` → further divide → `[38, 27]` & `[43, 3]`

    * `[38, 27]` → `[27, 38]`
    * `[43, 3]` → `[3, 43]`
    * Merge → `[27, 38, 3, 43]` → `[3, 27, 38, 43]`
3. Sort right part `[9, 82, 10]` → `[9]` & `[82, 10]`

    * `[82, 10]` → `[10, 82]`
    * Merge → `[9, 10, 82]`
4. Final Merge: `[3, 27, 38, 43]` and `[9, 10, 82]`
   → `[3, 9, 10, 27, 38, 43, 82]` ✅

---

## 🔹 6. Time Complexity

| Case         | Time Complexity |
| ------------ | --------------- |
| Best Case    | `O(n log n)`    |
| Average Case | `O(n log n)`    |
| Worst Case   | `O(n log n)`    |

* **Why?**

    * The array is divided into halves (`log n` levels).
    * At each level, merging takes `O(n)`.
    * Total = `O(n log n)`

---

## 🔹 7. Space Complexity

* `O(n)` (extra space needed for temporary arrays).

---

## 🔹 8. Stability

* Merge Sort is a **stable sort** → preserves the order of equal elements.

    * Example: If two students have same marks, their order (say by roll number) remains unchanged.

---

## 🔹 9. Advantages

✅ Always `O(n log n)` (not dependent on input).
✅ Stable sorting algorithm.
✅ Well-suited for **linked lists** (can be done in-place without extra space).
✅ Good for **external sorting** (large datasets on disk).

---

## 🔹 10. Disadvantages

❌ Requires extra space (`O(n)`), not in-place.
❌ Slower for small datasets compared to simpler sorts (like Insertion Sort).

---