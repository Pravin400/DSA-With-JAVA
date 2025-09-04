

# 📘 Strings in Java

## 🔹 What is a String?

* A **String** is a sequence of characters in Java (e.g., `"Hello"`, `"Java123"`, `"😊"`).
* In Java, **String is a class** from the package `java.lang`.
* Java provides special support for strings: you can use them like data types.
* Strings are **immutable** (cannot be changed after creation).

---

## 🔹 String Creation

### 1. **Using String Literals**

```java
String str1 = "Hello World";
```

* Stored in **String Constant Pool (SCP)** inside heap memory.
* If another string with the same value is created, Java **reuses** it.
* Memory efficient.

✅ Example:

```java
String a = "Java";
String b = "Java";
System.out.println(a == b);  // true (points to same SCP reference)
```

---

### 2. **Using `new` Keyword**

```java
String str2 = new String("Hello World");
```

* Creates a **new object** in **heap memory**, even if `"Hello World"` already exists in SCP.
* Not memory efficient (always creates a new copy).

❌ Example:

```java
String a = new String("Java");
String b = new String("Java");
System.out.println(a == b);  // false (different objects in heap)
```

---

## 🔹 Rules & Properties of Strings

1. **Immutability**

    * Once created, a String object **cannot be modified**.
    * Any operation like concatenation, replace, or substring creates a **new object**.

   ```java
   String s = "Hello";
   s.concat(" World");
   System.out.println(s);  // Hello (unchanged)
   ```

2. **Stored in SCP (for literals)**

    * All string literals are automatically stored in **String Constant Pool** for reuse.

3. **Equality Check**

    * `==` → checks **reference/address**.
    * `.equals()` → checks **content/value**.

   ```java
   String x = "Java";
   String y = new String("Java");

   System.out.println(x == y);       // false (different objects)
   System.out.println(x.equals(y));  // true (same content)
   ```

4. **Null vs Empty String**

    * `String str = null;` → No object, only reference.
    * `String str = "";` → Valid empty object, length = 0.

5. **Concatenation Rule**

    * You can use `+` operator to join strings.
    * If any operand is a String, result will be a String.

   ```java
   String a = "Hello";
   int b = 10;
   System.out.println(a + b);  // Hello10
   ```

6. **String Pool Behavior**

    * Reuses objects for literals.
    * `intern()` method can force a string from heap to SCP.

   ```java
   String a = new String("Java");
   String b = a.intern();
   String c = "Java";

   System.out.println(b == c);  // true (both in SCP)
   ```

7. **String as Final Class**

    * `String` class is **final**, so it cannot be extended.
    * Ensures security and immutability.

8. **Performance Rule**

    * If you need **many modifications**, use `StringBuilder` or `StringBuffer` instead of `String`.

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

        // 5. Null string
        String str5 = null;

        System.out.println(str1); // Hello
        System.out.println(str2); // Java
        System.out.println(str3); // World
        System.out.println(str4); // (blank)
        System.out.println(str5); // null
    }
}
```

---

## 🔹 Summary

* Strings are **objects**, not primitives.
* Two ways to create:

    1. **Literal** → stored in SCP, reused (memory efficient).
    2. **`new` keyword** → stored in heap, always creates new object.
* Strings are **immutable**.
* Use `equals()` for content comparison.
* Use `StringBuilder`/`StringBuffer` for heavy modifications.

---

👉 Next Recommended Topics:

* **String Immutability in depth** (why it was designed like this).
* **Common String Methods** (`length()`, `toUpperCase()`, `substring()`, etc.).

---