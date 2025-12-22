# 🟢 Day 32 — Immutability in Java Collections

Immutability ensures that once a collection is created,
its contents **cannot be modified**.

---

##  Why Immutability Matters

- ✅ Thread safety (no synchronization needed)
- ✅ Predictable behavior
- ✅ Safer APIs
- ✅ Easier debugging

---

##  Ways to Create Immutable Collections

### 1️ Using `Collections.unmodifiableXXX()`
```java
List<String> list = new ArrayList<>();
List<String> unmodifiable =
    Collections.unmodifiableList(list);
```
This is a read-only view, not true immutability.
Changes to the original list are reflected.

### 2 Java 9+ Factory Methods (True Immutability)
```java
List<String> list = List.of("A", "B");
Set<Integer> set = Set.of(1, 2);
Map<String, Integer> map = Map.of("X", 10);
```
✔ No modification allowed
✔ No nulls allowed
✔ Truly immutable