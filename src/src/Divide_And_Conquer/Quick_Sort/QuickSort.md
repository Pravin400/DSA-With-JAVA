# Quick Sort — Theory, Working, and Code Explanation


---

## 1. What is Quick Sort?

* **Quick Sort** is a sorting algorithm that uses the **Divide and Conquer** strategy.
* It sorts an array by picking a **pivot** element, partitioning the array around the pivot so that smaller elements go to the left and larger to the right, then sorting the left and right parts recursively.
* Quick Sort is usually **in-place** (needs little extra memory) and is typically **fast in practice**.
* **Worst Case Complexity** for **Time O(n²)** & for **Space O(n)** 
* **Average/Best Complexities** for **time O(n log n)** & for **Space O(log n)** .
* **Analogy:**
Think of organizing books on a shelf: pick one book as a reference (pivot). Put all thinner books to the left and thicker books to the right, then repeat the same process for the left pile and the right pile.

---

## 2. High-level steps (Divide & Conquer)

1. **Divide**: Pick a pivot and partition the array into two parts — left (smaller than pivot) and right (greater than pivot).
2. **Conquer**: Recursively apply Quick Sort to left and right subarrays.
3. **Combine**: No complex combine step — when recursion returns, array is sorted.

---

## 3. Pivot & Partition (core idea)

* **Pivot**: an element chosen to split the array. Common choices: last element, first element, random element, or median-of-three.
* **Partition**: rearrange the array so every element left of pivot is less than pivot and every element right is greater or equal (or vice versa depending on implementation). After partitioning, pivot is at its correct final index.

**Common partition schemes:**

* **Lomuto partition** (used in the provided code): pivot = last element, simple and easy to implement.
* **Hoare partition**: uses two indices from both ends, usually faster but slightly trickier.

---

## 4. Your Java implementation (cleaned & explained)

```java
package Divide_And_Conquer.Quick_Sort;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quicksort(arr, 0, arr.length - 1);
        printSortedArray(arr);
    }

    public static void printSortedArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // Recursive QuickSort function
    public static void quicksort(int arr[], int si, int ei) {
        // Base case: when subarray has 0 or 1 element it is already sorted
        if (si >= ei) return;

        // Partition the array and get pivot index where pivot is placed correctly
        int pIdx = partition(arr, si, ei);

        // Recursively sort left part
        quicksort(arr, si, pIdx - 1);

        // Recursively sort right part
        quicksort(arr, pIdx + 1, ei);
    }

    // Lomuto partition scheme: pivot = arr[ei]
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];          // choose last element as pivot
        int i = si - 1;               // boundary for elements smaller than pivot

        // Iterate and move elements smaller than pivot to the left side
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[j] and arr[i]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Place pivot at correct position (just after the last smaller element)
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // pivot's final index
    }
}
```

---

## 5. Line-by-line explanation (easy language)

* `quicksort(arr, 0, arr.length - 1);` — start sorting the whole array.

* In `quicksort(arr, si, ei)`:

    * If the subarray has less than 2 elements (`si >= ei`) there is nothing to do.
    * Call `partition(...)` to place pivot in correct position and get its index `pIdx`.
    * Recursively sort the left part (`si` to `pIdx-1`) and the right part (`pIdx+1` to `ei`).

* In `partition(arr, si, ei)` (Lomuto):

    * `pivot = arr[ei]` — choose last element as pivot.
    * `i = si - 1` — `i` will mark the end of the "less-than-pivot" region.
    * Loop `j` from `si` to `ei-1`:

        * If `arr[j] < pivot`, increment `i` and swap `arr[i]` and `arr[j]`. This expands the less-than-pivot region.
    * After loop, increment `i` and swap `arr[i]` with `arr[ei]` to put pivot in place.
    * Return `i` — the pivot's final index.

---

## 6. Example run (your array) — step-by-step

Array: `{6, 3, 9, 8, 2, 5}`

1. Call `quicksort(arr,0,5)` → `partition(arr,0,5)` with pivot=5.

    * After partition: pivot 5 goes to correct index; array becomes `{3,2,5,8,9,6}` (pivot index 2) — note: internal swaps may vary but final partition property holds.
2. Sort left `{3,2}` → becomes `{2,3}`.
3. Sort right `{8,9,6}` recursively → will eventually become `{6,8,9}`.
4. Entire array becomes `{2,3,5,6,8,9}`.

(Exact intermediate arrays may differ slightly depending on swap order but final sorted array will be correct.)

---

## 7. Time & Space Complexity (simple)

* **Average / Best case:** `O(n log n)` — pivot splits array roughly into halves.
* **Worst case:** `O(n^2)` — happens when pivot is always smallest or largest (e.g., already sorted input and pivot chosen poorly).
* **Space complexity:** `O(log n)` on average for recursion stack; worst-case `O(n)` if recursion is unbalanced.

---

## 8. Advantages and Disadvantages

**Advantages**

* Typically very fast in practice.
* In-place (needs little extra memory).
* Simple to implement (Lomuto partition is straightforward).

**Disadvantages**

* Worst-case `O(n^2)` time if pivot selection is poor.
* Not stable by default (equal elements can change relative order).

---

## 9. Practical tips & improvements

* **Randomized pivot**: choose a random pivot to avoid worst-case on ordered inputs.
* **Median-of-three pivot**: pick median of `first, middle, last` as pivot to get better splits.
* **Tail recursion optimization**: always recurse on smaller partition first to limit stack depth.
* **Use insertion sort** for small subarrays (e.g., size < 10) for better performance.

---

## 10. Final notes

* Quick Sort is one of the most important and commonly used sorting algorithms — interviewers often ask for its logic, partition schemes, and complexity trade-offs.
* Try implementing variations (random pivot, Hoare partition) to deepen understanding.

---

**If you want, I can:**

* Add a visual diagram showing partition steps, or
* Provide a commented version with printed debug lines showing swaps and pivot positions for the given example array.

Which one would you like next?
