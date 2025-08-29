
# 🟢 Java Inbuilt Sorting Methods 

Java provides powerful **inbuilt sorting methods** in `java.util.Arrays` (for arrays) and `java.util.Collections` (for lists/collections). These are optimized and widely used in real-world applications.

---

## 📌 1. `Arrays.sort()`

The `Arrays.sort()` method is used for **sorting arrays** of primitives and objects.

### ✅ For Primitive Arrays

```java
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        
        Arrays.sort(numbers);   // Sort in ascending order
        
        System.out.println(Arrays.toString(numbers)); 
        // Output: [1, 2, 3, 5, 8]
    }
}
```

🔹 Uses **Dual-Pivot QuickSort** for primitives (efficient and fast).

---

### ✅ For Object Arrays

```java
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob"};
        
        Arrays.sort(names);   // Sort alphabetically
        
        System.out.println(Arrays.toString(names));
        // Output: [Alice, Bob, John]
    }
}
```

🔹 Uses **Timsort** for objects (stable sort).

---

### ✅ With Custom Comparator

```java
import java.util.Arrays;
import java.util.Comparator;

public class SortExample {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob"};
        
        // Sort in descending order
        Arrays.sort(names, Comparator.reverseOrder());
        
        System.out.println(Arrays.toString(names));
        // Output: [John, Bob, Alice]
    }
}
```

---

## 📌 2. `Collections.sort()`

Used for **sorting Lists (e.g., ArrayList, LinkedList)**.

```java
import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        
        Collections.sort(numbers);   // Ascending order
        
        System.out.println(numbers);
        // Output: [1, 2, 3, 5, 8]
    }
}
```

### ✅ With Custom Comparator

```java
import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        
        // Descending order
        Collections.sort(names, Collections.reverseOrder());
        
        System.out.println(names);
        // Output: [John, Bob, Alice]
    }
}
```

🔹 Internally, `Collections.sort()` calls `List.sort()` (Java 8+), which uses **Timsort**.

---

## 📌 3. `List.sort()`

Since **Java 8**, lists have a `sort()` method.

```java
import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob"));
        
        names.sort(Comparator.naturalOrder()); // Ascending
        System.out.println(names);  // [Alice, Bob, John]
        
        names.sort(Comparator.reverseOrder()); // Descending
        System.out.println(names);  // [John, Bob, Alice]
    }
}
```

---

## 📌 4. `Arrays.parallelSort()`

Introduced in **Java 8**, uses **multithreading** to speed up sorting on large arrays.

```java
import java.util.Arrays;

public class ParallelSortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        
        Arrays.parallelSort(numbers);   // Parallel sort
        
        System.out.println(Arrays.toString(numbers));
        // Output: [1, 2, 3, 5, 8]
    }
}
```

🔹 Useful for **very large arrays**, but overhead for small arrays.

---

## 📌 5. Sorting with `Stream.sorted()`

In **Java 8+**, you can sort using Streams.

```java
import java.util.*;
import java.util.stream.Collectors;

public class StreamSortExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        
        // Ascending order
        List<String> asc = names.stream()
                                .sorted()
                                .collect(Collectors.toList());
        System.out.println(asc);  // [Alice, Bob, John]
        
        // Descending order
        List<String> desc = names.stream()
                                 .sorted(Comparator.reverseOrder())
                                 .collect(Collectors.toList());
        System.out.println(desc); // [John, Bob, Alice]
    }
}
```

---

# 🟢 Summary Table

| Method                  | Works On | Sorting Order | Algorithm Used                            |
| ----------------------- | -------- | ------------- | ----------------------------------------- |
| `Arrays.sort()`         | Arrays   | Asc / Desc    | QuickSort (primitives), Timsort (objects) |
| `Collections.sort()`    | Lists    | Asc / Desc    | Timsort                                   |
| `List.sort()`           | Lists    | Asc / Desc    | Timsort                                   |
| `Arrays.parallelSort()` | Arrays   | Asc / Desc    | Parallelized Merge Sort                   |
| `Stream.sorted()`       | Streams  | Asc / Desc    | Timsort                                   |

---

# 🔑 Key Takeaways

* Use `Arrays.sort()` for arrays.
* Use `Collections.sort()` or `List.sort()` for lists.
* Use `Arrays.parallelSort()` for **huge datasets** (multithreading).
* Use `Stream.sorted()` for **functional style sorting**.

---