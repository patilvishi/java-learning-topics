# Day 44 — Method References & Constructor References

Method references are shorthand for lambda expressions.

Instead of:
x -> System.out.println(x)
You can write:
System.out::println


---

# Types of Method References

### 1️.Static Method Reference

ClassName::staticMethod


Example:
Integer::parseInt


---

### 2️.Instance Method of Particular Object

object::instanceMethod

Example:
System.out::println


---

### 3️.Instance Method of Arbitrary Object

ClassName::instanceMethod


Example:
String::toUpperCase

---

### 4️.Constructor Reference

ClassName::new

Example:
ArrayList::new


---

# Lambda vs Method Reference

| Lambda | Method Reference |
|------|----------------|
| `(x) -> System.out.println(x)` | `System.out::println` |
| `(s) -> s.toUpperCase()` | `String::toUpperCase` |

---

# Best Practices

Use method references when:
- Lambda simply calls an existing method
- It improves readability

---