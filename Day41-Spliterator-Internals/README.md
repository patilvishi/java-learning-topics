# Day 41 — Java Spliterator Internals

Spliterator is the backbone of Java Streams and Parallel Streams.

It controls:
- How data is split
- How data is traversed
- How parallelism is achieved

---

## What Is a Spliterator?

`Spliterator<T>` = SPLIT + ITERATOR

Introduced in Java 8 to support:

- Efficient traversal
- Parallel processing

---

## Key Methods

### trySplit()
Splits the data source into two parts.

```java
Spliterator<T> split = spliterator.trySplit();
```

---
## forEachRemaining()

Processes remaining elements.
---
## Characteristics

Spliterator describes data using flags:

| Characteristic | Meaning                 |
| -------------- | ----------------------- |
| ORDERED        | Defined encounter order |
| SORTED         | Sorted source           |
| SIZED          | Known size              |
| SUBSIZED       | Split parts also sized  |
| IMMUTABLE      | Source can't change     |
| CONCURRENT     | Can be modified safely  |
| NONNULL        | No null elements        |

---
## How Parallel Streams Use Spliterator

```mermaid
flowchart TD
    A[Collection Source]
    A --> B[Spliterator]
    B --> C[trySplit()]
    C --> D[Split Parts]
    D --> E[ForkJoin Threads]
```

---
## Why It Matters

- Determines stream performance 
- Controls splitting strategy 
- Enables efficient parallel execution 

---