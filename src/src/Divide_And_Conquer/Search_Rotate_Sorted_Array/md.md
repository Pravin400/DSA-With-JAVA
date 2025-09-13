# 1) Divide & Conquer (rotated-binary-search) — step-by-step idea

**High level:**
At each step examine the middle element. Because the array is a rotated sorted array, **one of the two halves (left or right) is guaranteed to be sorted**. Decide which half is sorted, check whether the target lies inside that sorted half, and then recurse (or iterate) into the half that could contain the target. This halves the search space each step → `O(log n)` time.

**Steps (abstract):**

1. If `si > ei` → target not present (base case).
2. Compute `mid = si + (ei - si) / 2`.
3. If `arr[mid] == target` → return `mid`.
4. Otherwise decide which half is sorted:

    * If `arr[si] <= arr[mid]` → **left half \[si..mid] is sorted**.

        * If `target` is between `arr[si]` and `arr[mid]` (inclusive) → search left half (`si..mid-1`).
        * Else → search right half (`mid+1..ei`).
    * Else → **right half \[mid..ei] is sorted**.

        * If `target` is between `arr[mid]` and `arr[ei]` (inclusive) → search right half (`mid+1..ei`).
        * Else → search left half (`si..mid-1`).

**Why this works:** the pivot splits the array into two sorted runs. If you can identify a sorted run and the target lies inside it, you can use ordinary binary reasoning inside that run; otherwise the target must be in the other run.

---

## Dry run on your example

Array `arr = [4,5,6,7,0,1,2]`, target `0`, `si = 0`, `ei = 6`.

1. Compute `mid`:

    * `mid = si + (ei - si)/2`
    * `mid = 0 + (6 - 0)/2`
    * `mid = 0 + 6/2`
    * `mid = 0 + 3`
    * `mid = 3`
    * `arr[mid] = arr[3] = 7`. Not equal to target.
2. Check which half is sorted:

    * `arr[si] = arr[0] = 4`, `arr[mid] = 7`. Since `4 <= 7`, **left half \[0..3] is sorted**.
    * Is `target (0)` ∈ `[arr[0] .. arr[3]]` i.e. `[4..7]`? No.
    * So we discard left half and search **right half**: new `si = mid + 1 = 4`, `ei = 6`.
3. New step:

    * `mid = 4 + (6 - 4)/2 = 4 + 2/2 = 4 + 1 = 5`
    * `arr[5] = 1`. Not equal to target.
    * Check sorted half: `arr[si] = arr[4] = 0`, `arr[mid] = 1` → `0 <= 1` so **left half \[4..5] is sorted**.
    * Is `target 0` in `[0..1]`? Yes → search left: new `si = 4`, `ei = mid - 1 = 4`.
4. New step:

    * `mid = 4 + (4 - 4)/2 = 4 + 0/2 = 4`
    * `arr[4] = 0` → found → return `4`.

**Number of mid checks:** 3 (comparisons at indices 3, 5, 4).
**Time complexity:** `O(log n)` (halves each time).
**Space (recursive):** `O(log n)` stack depth; iterative variant can be `O(1)`.

**Important correction (bug in your posted recursive else):**
In the branch where the **right half is sorted**, the correct condition to decide whether to search right is:

```
if (arr[mid] <= target && target <= arr[ei])  → search right
else → search left
```

Your version compared `arr[si] >= target` in that condition — that is incorrect because the right half bounds are `arr[mid]..arr[ei]`, not `arr[si]`. Using `arr[ei]` is the correct bound for the right-side check.

---

# 2) Iterative linear search (brute force) — step-by-step idea

**High level:** loop through the array from `si` to `ei` and compare each element with the target; return index when found, otherwise return `-1`.

**Steps (abstract):**

1. For `i` from `si` to `ei`:

    * If `arr[i] == target` → return `i`.
2. If loop ends → return `-1` (not found).

**Dry run on same example `arr=[4,5,6,7,0,1,2]`, target `0`:**

* `i=0` → `arr[0]=4` ≠ `0` (1st comparison)
* `i=1` → `arr[1]=5` ≠ `0` (2nd)
* `i=2` → `arr[2]=6` ≠ `0` (3rd)
* `i=3` → `arr[3]=7` ≠ `0` (4th)
* `i=4` → `arr[4]=0` == `0` → return `4` (5th comparison)

**Comparisons performed:** 5 in this example.
**Time complexity:** `O(n)` in general (worst-case you check every element).
**Space complexity:** `O(1)`.

---

# Compare the two approaches

| Aspect                  | Rotated binary search (divide & conquer)                                                                 | Iterative linear search                                                                |
| ----------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| Time                    | `O(log n)`                                                                                               | `O(n)`                                                                                 |
| Space                   | `O(log n)` recursive stack or `O(1)` if iterative                                                        | `O(1)`                                                                                 |
| Simplicity              | Moderate (need careful checks & bounds)                                                                  | Very simple                                                                            |
| Correctness requirement | Needs array to be rotated *sorted* (distinct elements make it simpler); duplicates need special handling | Works regardless of sorting                                                            |
| Best use                | Large arrays where speed matters                                                                         | Small arrays, one-off quick checks, or when array not sorted/duplicates cause problems |

**When to pick which**

* Use **rotated binary search** when you know the array is a rotated sorted array and performance matters (large `n`).
* Use **linear search** when `n` is small, or the array is not guaranteed sorted/rotated, or you need the simplest correct solution quickly.

---

# Edge cases & pitfalls to watch for

1. **Empty array** (`si > ei` from the start) → return `-1`.
2. **Single element** → check that element.
3. **Integer overflow in mid**: prefer `mid = si + (ei - si)/2` (you already use this — good!).
4. **Off-by-one errors**: be precise when using `mid-1` or `mid+1` in the next range.
5. **Duplicates in array:** the `arr[si] <= arr[mid]` test may not tell which half is sorted when many duplicates exist. In that situation you may need to skip duplicates (`si++` or `ei--`) which can degrade worst-case to `O(n)`.
6. **Wrong bounds in right-half check:** make sure you compare `target` with `arr[mid]` and `arr[ei]` (not `arr[si]`) when right side is the sorted half — this fixes the bug in your recursive branch.

---

# Quick rule-of-thumb summary

* **If rotated & sorted & distinct → use modified binary search** (fast `O(log n)`).
* **If unknown sort or duplicates or tiny array → linear scan** (simple and always correct).
* If you prefer no recursion, implement the rotated binary search **iteratively** (same logic, `while (low <= high)`), which gives `O(log n)` time and `O(1)` space.

---

If you want, I can now:

* Walk through the **corrected recursive logic** step-by-step for another example, **or**
* Describe the **iterative (non-recursive) O(log n) version** step-by-step (again, explanation only, no code), **or**
* Convert the corrected recursive algorithm to a short iterative algorithm (with code) if you'd like to run it.

Which of those would help you next?
