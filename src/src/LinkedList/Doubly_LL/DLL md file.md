# Doubly Linked List (DLL) — Add & Remove Operations

## 1. What is a Doubly Linked List?

A **Doubly Linked List (DLL)** is a type of linked list where each node contains:

* `data` → stores the value.
* `next` → reference to the next node.
* `prev` → reference to the previous node.

This allows **bidirectional traversal** (forward and backward), unlike a singly linked list which allows traversal only in one direction.

### Structure of a Node

```
[ prev | data | next ]
```

### Visualization (add an image here)

👉 *Insert an image showing Node with `prev` and `next` pointers.*

---

## 2. Adding a Node at the **Front**

Steps:

1. Create a new node.
2. If DLL is empty → set `head = tail = newNode`.
3. Else:

    * Point `newNode.next = head`.
    * Set `head.prev = newNode`.
    * Update `head = newNode`.

### Visualization (add an image here)

👉 *Show nodes being linked at the **start**.*

---

## 3. Adding a Node at the **End**

Steps:

1. Create a new node.
2. If DLL is empty → set `head = tail = newNode`.
3. Else:

    * Point `tail.next = newNode`.
    * Set `newNode.prev = tail`.
    * Update `tail = newNode`.

### Visualization (add an image here)

👉 *Show nodes being linked at the **end**.*

---

## 4. Removing a Node from the **Front**

Steps:

1. If DLL is empty → print "Empty".
2. If size = 1:

    * Store value of `head`.
    * Set `head = tail = null`.
3. Else:

    * Store value of `head`.
    * Move `head = head.next`.
    * Set `head.prev = null`.

### Visualization (add an image here)

👉 *Show how the **first node** is removed and head moves forward.*

---

## 5. Removing a Node from the **End**

Steps:

1. If DLL is empty → print "Empty".
2. If size = 1:

    * Store value of `tail`.
    * Set `head = tail = null`.
3. Else:

    * Store value of `tail`.
    * Move `tail = tail.prev`.
    * Set `tail.next = null`.

### Visualization (add an image here)

👉 *Show how the **last node** is removed and tail moves backward.*

---

## 6. Example Execution

Suppose we perform:

```
addFirst(1)
addFirst(2)
addLast(3)
addLast(4)
```

DLL after additions:

```
2 <-> 1 <-> 3 <-> 4 <-> null
```

After `removeFirst()`:

```
1 <-> 3 <-> 4 <-> null
```

After `removeLast()`:

```
1 <-> 3 <-> null
```

---

## 7. Advantages of DLL

* Can be traversed in **both directions**.
* Easy to **insert/delete from both ends**.
* More flexible than singly linked list.

---

## 8. Drawbacks of DLL

* Requires **extra memory** (for `prev` pointer).
* Operations take **slightly more time** (two pointers to update).

# Doubly Linked List (DLL) — Reverse Operation

## 1. What is Reversing a Doubly Linked List?

Reversing a **Doubly Linked List (DLL)** means changing the direction of traversal so that:

* The **head becomes the tail**.
* The **tail becomes the head**.
* For every node:

    * The `next` pointer becomes the `prev`.
    * The `prev` pointer becomes the `next`.

---

## 2. Steps for Reversing a DLL

1. Start with `curr = head`, `prev = null`.
2. Traverse the list:

    * Store `next = curr.next`.
    * Swap the links:

        * `curr.next = prev`
        * `curr.prev = next`
    * Move `prev = curr`, `curr = next`.
3. After traversal, set `head = prev`.

---

## 3. Visualization (add an image here)

👉 *Insert an image showing how each node’s `prev` and `next` pointers are swapped.*

---

## 4. Example Execution

Suppose we have the DLL:

```
0 <-> 1 <-> 2 <-> 3 <-> null
```

* Iteration 1: Node `0` → links swapped, points backward.
* Iteration 2: Node `1` → points backward to `0`.
* Iteration 3: Node `2` → points backward to `1`.
* Iteration 4: Node `3` → becomes new head.

After reversal:

```
3 <-> 2 <-> 1 <-> 0 <-> null
```

---

## 5. Advantages of DLL Reverse

* Simple because both `next` and `prev` pointers exist.
* Does not require extra memory.
* Works in **O(n) time**.

---

## 6. Use Cases

* Implementing **undo/redo** features.
* Navigation systems (e.g., forward/backward in browser history).
* Reversing playlists or tasks dynamically.

---

---
