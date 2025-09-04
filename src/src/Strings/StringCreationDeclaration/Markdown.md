# 📘 Strings in Java

## 🔹 What is a String?

* A **String** is a sequence of characters in Java (e.g., `"Hello"`, `"Java123"`, `"😊"`).
* In Java, **String is a class**, not a primitive data type.
* Java treats Strings in a special way, so they behave like data types.

---

## 🔹 String Creation

### 1. **Using String Literals**

```java
String str1 = "Hello World";
```

* Stored in **String Constant Pool (SCP)**.
* If another string with the same value is created, Java **reuses** it (memory efficient).

Example:

```java
String a = "Java";
String b = "Java";
System.out.println(a == b);  // true (same reference from SCP)
```

---

### 2. **Using new Keyword**

```java
String str2 = new String("Hello World");
```

* Creates a **new object** in **heap memory**, even if `"Hello World"` already exists in SCP.
* Not memory efficient.

Example:

```java
String a = new String("Java");
String b = new String("Java");
System.out.println(a == b);  // false (different objects in heap)
```

---

## 🔹 Difference Between Both

| Way                       | Memory Location            | Reusability                 |
| ------------------------- | -------------------------- | --------------------------- |
| String Literal (`"Java"`) | String Constant Pool (SCP) | Reused (saves memory)       |
| `new String("Java")`      | Heap memory                | Always creates a new object |

---

## 🔹 String Declaration Examples

```java
public class StringExample {
    public static void main(String[] args) {
        // 1. Declaration without initialization
        String str1;
        str1 = "Hello";

        // 2. Declaration with initialization
        String str2 = "Java";

        // 3. Using new keyword
        String str3 = new String("World");

        // 4. Empty string
        String str4 = "";

        // 5. Null string (reference only, no object)
        String str5 = null;

        // Printing
        System.out.println(str1); // Hello
        System.out.println(str2); // Java
        System.out.println(str3); // World
        System.out.println(str4); // (blank)
        System.out.println(str5); // null
    }
}
```

---

## ✅ Summary

* Strings are **objects**, not primitive types.
* Two main ways of creation: **String Literals** and **new Keyword**.
* Literals go into **String Constant Pool** → memory efficient.
* `new` always creates a **new object** in heap.

---

👉 Next steps: Learn about

* **String Immutability** (why Strings cannot be changed after creation).
* **Common String Methods** (`length()`, `concat()`, `equals()`, etc.).

---

Would you like me to extend this `.md` file with **String immutability** and **basic methods** also, so you’ll have a complete reference?
