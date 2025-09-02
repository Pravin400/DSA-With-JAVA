# 🌀 Spiral Matrix Traversal in Java

## 📘 Theory

A **Spiral Matrix Traversal** means printing the elements of a 2D array in a **spiral order**, moving layer by layer:

1. Traverse the **top row** (left → right).  
2. Traverse the **right column** (top → bottom).  
3. Traverse the **bottom row** (right → left).  
4. Traverse the **left column** (bottom → top).  
5. Move inward (shrink the boundaries) and repeat until all elements are covered.

This method is useful in **matrix problems, printing patterns, and data visualization**.

---

## 📊 Example Matrix

Matrix of size 4×4:

```
1   2   3   4
5   6   7   8
9   10  11  12
13  14  15  16
```

Output in Spiral Order:

```
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
```




