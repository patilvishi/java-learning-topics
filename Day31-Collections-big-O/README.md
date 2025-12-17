# Day 31 — Big-O & Performance of Java Collections

Understanding **time complexity** helps you choose the right collection
and avoid hidden performance bottlenecks.

---

## ⏱️ Big-O Overview

| Notation | Meaning |
|--------|---------|
| O(1) | Constant time |
| O(log n) | Logarithmic |
| O(n) | Linear |
| O(n log n) | Sorting |
| O(n²) | Nested loops |

---

## 📋 List Performance

| Operation | ArrayList | LinkedList |
|---------|-----------|------------|
| get(index) | O(1) | O(n) |
| add(end) | O(1)* | O(1) |
| add(middle) | O(n) | O(n) |
| remove(middle) | O(n) | O(n) |
| iteration | Fast | Slower |

\* amortized

---

## 🧮 Set Performance

| Set | add | remove | contains |
|----|-----|--------|----------|
| HashSet | O(1) | O(1) | O(1) |
| LinkedHashSet | O(1) | O(1) | O(1) |
| TreeSet | O(log n) | O(log n) | O(log n) |

---

## 🗺️ Map Performance

| Map | get | put | order |
|----|-----|-----|-------|
| HashMap | O(1) | O(1) | ❌ |
| LinkedHashMap | O(1) | O(1) | insertion |
| TreeMap | O(log n) | O(log n) | sorted |
| ConcurrentHashMap | O(1) | O(1) | ❌ |

---

## 🧠 Rules of Thumb

- Read-heavy → ArrayList
- Frequent lookups → HashMap
- Sorted data → TreeMap / TreeSet
- Concurrent access → ConcurrentHashMap
- Stack/Queue → ArrayDeque

---
