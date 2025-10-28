# 🚀 Day 25 – ConcurrentHashMap & NavigableMap

## 🧩 Overview
In Day 25, we explore two advanced Map types:

- **ConcurrentHashMap** → Thread-safe, highly performant concurrent map.
- **NavigableMap** → Extends TreeMap to provide navigation methods (floor, ceiling, higher, lower).

---

## ⚙️ ConcurrentHashMap
A thread-safe map that allows concurrent read and write operations without locking the entire map.

### ✅ Example:
```java
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
map.put("A", 1);
map.put("B", 2);
System.out.println(map);
