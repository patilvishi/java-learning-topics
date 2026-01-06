# Day 37 — Java Streams Internals & Lazy Evaluation

Java Streams are not data structures.
They are **pipelines of operations** executed lazily.

---

## Key Concepts

- Streams are **lazy**
- Intermediate operations do NOT execute immediately
- Terminal operation triggers execution
- Processing happens **element by element**
- Supports **short-circuiting**

---

## Stream Pipeline

Source → Intermediate Ops → Terminal Op

Example:
```java
list.stream()
    .filter(...)
    .map(...)
    .forEach(...);
```

---
## Lazy Evaluation

- Intermediate operations (filter, map) do nothing
- until a terminal operation (forEach, collect) is called.

---
## Element-by-Element Processing

- Streams do NOT process all elements at once.

Instead:
filter → map → terminal
filter → map → terminal

(one element at a time)

---
## Short-Circuiting Operations

- Operations like:
- findFirst()
- findAny()
- anyMatch()
- limit()

Stop processing early when result is found.

---
## Benefits

- Better performance
- Less memory usage
- Easy parallelization
- Clean functional style
---

