
# 📘 2D Array – Creation, Reading, and Searching

A **2D array** is a **matrix-like data structure** in Java that stores data in **rows and columns**. Each element is accessed using **two indices**: `[row][column]`.

---

## 1. Creation of 2D Array

To create a 2D array:

- **Syntax:**
```

dataType\[]\[] arrayName = new dataType\[rows]\[columns];

```

- Example:
```

int\[]\[] matrix = new int\[3]\[3];

```

- **Explanation:**
  - `3 × 3` matrix → 3 rows and 3 columns.  
  - Total **cells/elements = 9**.  
  - Each cell can store a single value of the declared data type (here `int`).  

---

## 2. Reading/Input into a 2D Array

- **Method:** Enter values **row by row**.  
- For each row, fill all columns sequentially.  

**Representation on Paper:**

|       | Column 0 | Column 1 | Column 2 |
|-------|----------|----------|----------|
| Row 0 | ?        | ?        | ?        |
| Row 1 | ?        | ?        | ?        |
| Row 2 | ?        | ?        | ?        |

- User provides input for each cell.  
- After input, the matrix is fully populated.

---

## 3. Displaying a 2D Array

- Traverse the **rows** and **columns** using nested loops.  
- Print each element with proper formatting to represent the matrix structure.

**Example Layout after Input:**

|       | Column 0 | Column 1 | Column 2 |
|-------|----------|----------|----------|
| Row 0 | 5        | 8        | 2        |
| Row 1 | 1        | 7        | 4        |
| Row 2 | 6        | 0        | 9        |

- This is a **rectangular 2D array** (all rows have equal columns).  

---

## 4. Searching in a 2D Array

- To search for a value:
  1. Traverse **each row**.
  2. Traverse **each column** within the row.
  3. Compare the element with the **key value**.
  4. If match found → return **row and column index**.  

**Example:** Searching for `7` in the above matrix:

|       | Column 0 | Column 1 | Column 2 |
|-------|----------|----------|----------|
| Row 0 | 5        | 8        | 2        |
| Row 1 | 1        | 7 ✅     | 4        |
| Row 2 | 6        | 0        | 9        |

- Result: Key `7` found at index `(1,1)` (row 1, column 1).  

- If the element is not found, indicate **“element not present”**.  

---

## 5. Key Points to Remember

1. **2D array indexing** starts from 0 for both rows and columns.  
2. **Rows = matrix.length**, **Columns = matrix[0].length**.  
3. **Creation, reading, and searching** can be handled using **nested loops**.  
4. Searching in a 2D array is generally **O(rows × columns)** in complexity.  
5. 2D arrays can be **rectangular** or **jagged** (rows of different lengths).  

---

## 6. Use Cases

| Use Case                        | Explanation |
|---------------------------------|-------------|
| **Matrices in Math**             | Store values for addition, multiplication, or linear algebra operations. |
| **Games**                        | Tic-Tac-Toe, Chess boards (row × column representation). |
| **Seating Arrangement**          | Classrooms, cinemas, airplane seating charts. |
| **Image Representation**         | Each pixel value stored as matrix element `[row][column]`. |
| **Dynamic Programming Tables**   | Store results of subproblems for algorithms (e.g., Knapsack, LCS). |

---
