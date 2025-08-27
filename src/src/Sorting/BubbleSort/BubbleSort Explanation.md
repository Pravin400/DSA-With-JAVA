
## 🔹 Your `bubblesort`

```java
for (int i = 0; i < number.length - 1; i++) {
    for (int j = 0; j < number.length - 1; j++) {
        if (number[j] > number[j+1]) {
            int temp = number[j];
            number[j] = number[j+1];
            number[j+1] = temp;
        }
    }
}
```

### ✅ What it does:

* Outer loop runs `n-1` times.
* Inner loop **always compares from `0` to `n-2`**, regardless of how many elements are already sorted.

👉 That means even when the last `i` elements are already in the correct position, it **still keeps checking them unnecessarily**.

### ⏱ Time Complexity:

* Always **O(n²)** comparisons and swaps, no matter what.

---

## 🔹 Your `bubblesort1`

```java
for (int i = 0; i < number.length - 1; i++) {
    for (int j = 0; j < number.length - i - 1; j++) {
        if (number[j] > number[j + 1]) {
            int temp = number[j];
            number[j] = number[j + 1];
            number[j + 1] = temp;
        }
    }
}
```

### ✅ What it does:

* Outer loop runs `n-1` times.
* Inner loop runs only up to `n-i-1`.

  * After the first pass, the **largest element is already at the end** → no need to compare it again.
  * After the second pass, the **two largest elements are at the end** → skip them.
* So gradually, the inner loop checks **fewer and fewer elements**.

👉 This is the **optimized bubble sort** compared to your first one.

### ⏱ Time Complexity:

* Still **O(n²)** in the worst case.
* But does **fewer comparisons**, so practically faster than your first version.

---

## 🔑 Key Difference:

* `bubblesort` → checks the whole array every pass (wasteful).
* `bubblesort1` → avoids re-checking the sorted portion at the end of the array.

---

⚡ If you also add a **`swapped` flag** to stop when no swaps happen in a pass, then it becomes even better → **Best case O(n)** (already sorted array).

---

👉 Do you want me to **rewrite your `bubblesort1` with that `swapped` optimization** and show how it stops early when the array is already sorted?
