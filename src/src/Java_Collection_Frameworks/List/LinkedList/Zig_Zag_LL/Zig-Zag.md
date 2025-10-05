# Zig-Zag Linked List

## 📌 Problem Statement
We are given a **singly linked list**.  
The task is to rearrange it in **zig-zag order** such that:
- The **first half** of the linked list remains in the original order.
- The **second half** is **reversed**.
- Both halves are then **merged alternately**.

---

## 🖼 Example
### Input:
```

1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> Null

```

### Output:
```

1 -> 8 -> 2 -> 7 -> 3 -> 6 -> 4 -> 5 -> Null

```

---

## 🚀 Step-by-Step Technique

### **Step 1: Find the Middle Node**
- We use the **slow-fast pointer technique**:
  - `slow` moves **1 step** at a time.
  - `fast` moves **2 steps** at a time.
- When `fast` reaches the end, `slow` will be at the **middle**.
  
This divides the list into **two halves**:
```

Left Half:  1 -> 2 -> 3 -> 4
Right Half: 5 -> 6 -> 7 -> 8

```

---

### **Step 2: Reverse the Second Half**
- The right half is reversed in place.
- After reversal:
```

Left Half:   1 -> 2 -> 3 -> 4
Right Half:  8 -> 7 -> 6 -> 5

```

---

### **Step 3: Merge in Zig-Zag Fashion**
- Now we merge nodes alternately:
  1. Take one node from **left**.
  2. Take one node from **right**.
  3. Repeat until one half is finished.

Merging process:
```

Left(1) + Right(8) → 1 -> 8
Left(2) + Right(7) → 1 -> 8 -> 2 -> 7
Left(3) + Right(6) → 1 -> 8 -> 2 -> 7 -> 3 -> 6
Left(4) + Right(5) → 1 -> 8 -> 2 -> 7 -> 3 -> 6 -> 4 -> 5

```

---

## ⏱ Complexity Analysis
- **Finding Middle**: `O(n/2)`
- **Reversing Half**: `O(n/2)`
- **Merging**: `O(n)`
- **Total Time Complexity**: `O(n)`
- **Space Complexity**: `O(1)` (in-place)

---

## 🎯 Final Output
For the input:
```

1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> Null

```

The output will be:
```

1 -> 8 -> 2 -> 7 -> 3 -> 6 -> 4 -> 5 -> Null

```

---

## 💡 Key Insight
The zig-zag transformation works because:
- The **slow-fast pointer** splits the list efficiently into two halves.
- **Reversing the second half** ensures the largest values come first from the right side.
- **Alternate merging** interleaves small (left half) and large (right half) values, producing the zig-zag pattern.
