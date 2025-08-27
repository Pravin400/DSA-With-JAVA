# 🔄 Bubble Sort

## 📝 Idea
- Compare **adjacent elements** in the array.  
- If they are in the wrong order, **swap** them.  
- Keep repeating passes until the array is sorted.  
- In each pass, the **largest element "bubbles up"** to the end of the array (like bubbles rising in water 💧).  

---

## 🔄 Dry Run Example

Array: `[5, 3, 8, 4, 2]`

**Pass 1:**
- (5,3) → swap → `[3, 5, 8, 4, 2]`  
- (5,8) → no swap → `[3, 5, 8, 4, 2]`  
- (8,4) → swap → `[3, 5, 4, 8, 2]`  
- (8,2) → swap → `[3, 5, 4, 2, 8]`  
👉 Largest element `8` is placed correctly.  

**Pass 2:**
- (3,5) → no swap  
- (5,4) → swap → `[3, 4, 5, 2, 8]`  
- (5,2) → swap → `[3, 4, 2, 5, 8]`  
👉 Next largest `5` is placed correctly.  

**Pass 3:**
- (3,4) → no swap  
- (4,2) → swap → `[3, 2, 4, 5, 8]`  

**Pass 4:**
- (3,2) → swap → `[2, 3, 4, 5, 8]`  
👉 Array is now sorted ✅  

---

## ⏱ Complexity
- **Worst Case:** O(n²) (when array is reversed)  
- **Average Case:** O(n²)  
- **Best Case (already sorted & with optimization):** O(n)  
- **Space Complexity:** O(1) (in-place sorting)  

---

## 📌 Key Point
- Bubble Sort is simple to understand, but inefficient for large datasets.  
- It is mainly used for **learning purposes** rather than real-world applications.  
```


***

✅ This Markdown has:

- Clean **idea explanation**
- One **dry run** (step-by-step)
- **Time \& space complexity**
- A short **key summary**

Would you like me to now create a **matching style note for Selection Sort** next (so your notes remain uniform)?

