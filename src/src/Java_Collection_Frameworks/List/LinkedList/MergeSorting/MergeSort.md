Linked List Sorting(MergeSort)
---

### 📄 1. What the Code Does

This program sorts a **singly linked list** using the **Merge Sort algorithm**.
Merge Sort is a classic **Divide & Conquer** algorithm:

1. **Divide** the list into two halves until sublists have one node.
2. **Conquer** by recursively sorting each half.
3. **Combine** the sorted halves into a single sorted list.

---

### 🧩 2. Important Methods

| Method                          | Purpose                                                             |
| ------------------------------- | ------------------------------------------------------------------- |
| `addNode(int data)`             | Adds a new node to the end of the linked list.                      |
| `getMid(Node head)`             | Finds the middle node of the current list using slow/fast pointers. |
| `merge(Node head1, Node head2)` | Merges two sorted linked lists into one sorted list.                |
| `mergeSort(Node head)`          | Recursively divides and merges the list (the core of merge sort).   |
| `printList()`                   | Prints the linked list in `a -> b -> … -> Null` format.             |

---

### 🔑 3. High-Level Flow

1. **Create an unsorted list** using `addNode()`.
2. Call `mergeSort(head)`:

    * Find the middle (`getMid`).
    * Split into left and right halves.
    * Sort each half recursively.
    * Merge the two sorted halves (`merge`).
3. Print the sorted list.

---

## 🐞 4. Debugging Walkthrough (Example Run)

Input List:

```
5 -> 1 -> 8 -> 2 -> 4 -> 6 -> 7 -> 3 -> Null
```

### Step 1 – Initial Call

```
mergeSort(head = 5)
```

* `getMid` finds middle at **2** (slow pointer stops at 2).
* Split into:

    * Left: `5 -> 1 -> 8 -> 2`
    * Right: `4 -> 6 -> 7 -> 3`

---

### Step 2 – Left Half: `5 -> 1 -> 8 -> 2`

`mergeSort(5)`

* Mid = **1 → 8** (slow stops at 1 → 8).
* Split:

    * Left: `5 -> 1`
    * Right: `8 -> 2`

`mergeSort(5 -> 1)`:

* Mid = 5.
* Split: `5` and `1`.
* Merge: `1 -> 5`.

`mergeSort(8 -> 2)`:

* Mid = 8.
* Split: `8` and `2`.
* Merge: `2 -> 8`.

Merge these halves:
`1 -> 5` and `2 -> 8`
Result: **`1 -> 2 -> 5 -> 8`**

---

### Step 3 – Right Half: `4 -> 6 -> 7 -> 3`

`mergeSort(4)`

* Mid = **6**.
* Split:

    * Left: `4 -> 6`
    * Right: `7 -> 3`

`mergeSort(4 -> 6)`:

* Mid = 4.
* Split: `4` and `6`.
* Merge: `4 -> 6`.

`mergeSort(7 -> 3)`:

* Mid = 7.
* Split: `7` and `3`.
* Merge: `3 -> 7`.

Merge these halves:
`4 -> 6` and `3 -> 7`
Result: **`3 -> 4 -> 6 -> 7`**

---

### Step 4 – Final Merge

Merge `1 -> 2 -> 5 -> 8` with `3 -> 4 -> 6 -> 7`:

* Compare 1 & 3 → pick 1
* Compare 2 & 3 → pick 2
* Compare 5 & 3 → pick 3
* Compare 5 & 4 → pick 4
* Compare 5 & 6 → pick 5
* Compare 8 & 6 → pick 6
* Compare 8 & 7 → pick 7
* Add remaining 8

Result:

```
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> Null
```

---

## 📝 5. Key Points

* **Time Complexity**: `O(n log n)` – each split is O(log n) and merging is O(n).
* **Space Complexity**: `O(log n)` recursion stack (no extra arrays required).
* Uses **slow/fast pointer** technique to find mid without needing list length.

---


# Merge Sort on Linked List

## Overview
This program sorts a singly linked list using the Merge Sort algorithm.

---

## Algorithm Steps
1. **Divide** the list into two halves using slow/fast pointers.
2. **Sort** each half recursively.
3. **Merge** the two sorted halves.

---

## Key Methods
- `addNode(int data)`
- `getMid(Node head)`
- `merge(Node head1, Node head2)`
- `mergeSort(Node head)`
- `printList()`

---

## Example Trace
Initial list:
```

5 -> 1 -> 8 -> 2 -> 4 -> 6 -> 7 -> 3 -> Null

```
1. Split into `5->1->8->2` and `4->6->7->3`
2. Sort left → `1->2->5->8`
3. Sort right → `3->4->6->7`
4. Merge → `1->2->3->4->5->6->7->8`

---

## Debugging Walkthrough
*(Insert your flowchart or step diagram here)*

---

## Complexity
* **Time**: O(n log n)
* **Space**: O(log n) recursion stack
```