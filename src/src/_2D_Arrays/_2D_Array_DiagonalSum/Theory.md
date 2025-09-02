Got it ✅
Here’s a **Markdown (`.md`) file** that explains **all diagonal matrix sums** (Primary, Secondary, and Other diagonals) — without including code.

---

# 📘 Diagonal Matrix Sums

In a 2D square matrix, diagonals are important for various algorithms and problem-solving. There are two main types of diagonals, but we can also extend the concept to **all diagonals**.

---

## 1️⃣ Primary Diagonal (Main Diagonal)

* The **primary diagonal** is formed by elements where the row index equals the column index.
* Formula: `matrix[i][i]`

### Example:

For a 4×4 matrix:

```
1   2   3   4
5   6   7   8
9  10  11  12
13 14  15  16
```

Primary diagonal elements: **1, 6, 11, 16**
Primary diagonal sum = **1 + 6 + 11 + 16 = 34**

---

## 2️⃣ Secondary Diagonal (Anti-Diagonal)

* The **secondary diagonal** is formed by elements where the sum of row and column indices equals `n - 1`.
* Formula: `matrix[i][n - i - 1]`

### Example:

For the same 4×4 matrix:

Secondary diagonal elements: **4, 7, 10, 13**
Secondary diagonal sum = **4 + 7 + 10 + 13 = 34**

---

## 3️⃣ Other Diagonals (Extended Diagonals)

Besides the main two diagonals, we can calculate **all possible diagonals** in a matrix:

* **Upper Diagonals (above primary diagonal):**
  Elements like `(0,1), (1,2), (2,3)` etc.

* **Lower Diagonals (below primary diagonal):**
  Elements like `(1,0), (2,1), (3,2)` etc.

* Similarly, diagonals parallel to the **secondary diagonal** can be computed.

---

## 4️⃣ Total Diagonal Sum

* Sometimes, the problem asks for the **sum of both primary and secondary diagonals**.
* If the matrix size `n` is **odd**, the center element (middle of the matrix) belongs to both diagonals, so it should be **counted once**.

---

## ✅ Key Points Summary

* **Primary diagonal:** `(i, i)` elements
* **Secondary diagonal:** `(i, n - i - 1)` elements
* **Avoid double-counting center** (if `n` is odd)
* **Extended diagonals** include all diagonals parallel to primary/secondary
* Diagonal sums are widely used in **matrix problems, image processing, and algorithms**

---


- **Primary Diagonal** → `1, 5, 9` → Sum = **15**
- **Secondary Diagonal** → `3, 5, 7` → Sum = **15**

---

## Use Cases of Diagonal Sum
- **Image Processing**: Extracting diagonal pixel intensity patterns.
- **Game Development**: Checking win conditions in tic-tac-toe.
- **Mathematics**: Trace of a matrix (sum of primary diagonal).
- **Data Analysis**: Symmetry checks in data grids.

---

## Key Notes
- Works mainly on **square matrices (n × n)**.
- For rectangular matrices, diagonals can be considered only within bounds.
- Time Complexity: **O(n)** (since only one pass needed through diagonals).

---
