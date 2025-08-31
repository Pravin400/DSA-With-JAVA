# 📘 2D Arrays in Java – Theory

A **2D array** is an **array of arrays**, commonly used to represent **tables, matrices, or grids**.  
Each element is accessed using **two indices**: `[row][column]`.

---

## 1. Definition
- Stores data in **rows and columns**.
- Each element accessed as `[row][column]`.
- Can be **rectangular** (all rows same size) or **jagged** (rows have different sizes).

---

## 2. Representation on Paper

### 2.0 Rectangular 2D Array
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240916191406/2d-array-in-c.webp" alt="2D Array" width="400"/>

### 2.1 Rectangular 2D Array
Example: 3×4 array (3 rows, 4 columns)

|       | Column 0 | Column 1 | Column 2 | Column 3 |
|-------|----------|----------|----------|----------|
| Row 0 | 5        | 8        | 2        | 9        |
| Row 1 | 1        | 7        | 4        | 3        |
| Row 2 | 6        | 0        | 8        | 2        |

- Element `[0][2]` = 2
- Element `[1][3]` = 3
- Element `[2][0]` = 6

---

### 2.2 Jagged 2D Array
Rows with different number of columns:

|       | Column 0 | Column 1 | Column 2 |
|-------|----------|----------|----------|
| Row 0 | 5        | 8        | 2        |
| Row 1 | 1        | 7        | –        |
| Row 2 | 6        | 0        | 8        |
| Row 3 | 9        | –        | –        |

- “–” represents **no element** in that cell.

---

## 3. Accessing Elements
- **Element at row i, column j** → `[i][j]`
- **Rows** → vertical index
- **Columns** → horizontal index

**Examples from rectangular array:**
- `[0][3]` = 9
- `[2][0]` = 6

---

## 4. Use Cases of 2D Arrays

| Use Case                           | Explanation |
|-----------------------------------|-------------|
| **Matrices in Math**               | Store numbers for addition, subtraction, multiplication. |
| **Game Boards**                    | Tic-Tac-Toe, Chess, Sudoku, each cell = `[row][column]`. |
| **Seating Arrangement**            | Classroom, cinema, airplane seats. |
| **Image Representation**           | Pixels stored as `[row][column]` values. |
| **Dynamic Programming Tables**     | Store subproblem results (e.g., LCS, Knapsack). |
| **Calendar or Schedule**           | Rows = weeks, Columns = days of week. |
| **Graph Representation**           | Adjacency matrix of graphs. |


---

## 5. Summary
- **2D Array = Table/Grid**
- **Rows × Columns** → `[row][column]`
- Types:
    - **Rectangular** → all rows same size
    - **Jagged** → rows with different sizes
- Widely used in **math, games, scheduling, images, and algorithms**.
