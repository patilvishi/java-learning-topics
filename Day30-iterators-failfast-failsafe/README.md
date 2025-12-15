# Day 30 — Fail-Fast vs Fail-Safe Iterators (Java)

This day explains iterator behavior under concurrent modifications.

## Demos
- `FailFastDemo.java` — shows `ConcurrentModificationException` with `ArrayList`.
- `FailSafeDemo.java` — shows `CopyOnWriteArrayList` safe iteration (snapshot).
- `ConcurrentMapIteratorDemo.java` — shows weakly-consistent iterators for `ConcurrentHashMap`.

## Key Ideas
- **Fail-Fast** (e.g., `ArrayList`, `HashMap` iterators):
  - Detect structural modification during iteration and throw `ConcurrentModificationException`.
  - Useful to detect bugs early.
  - Not safe for concurrent modification without explicit synchronization.
- **Fail-Safe / Snapshot** (e.g., `CopyOnWriteArrayList`):
  - Iterators operate on a snapshot of the collection.
  - Modifications do not affect the iterator and do not throw exceptions.
  - Great for read-heavy scenarios; writes are expensive (copy-on-write).
- **Weakly-Consistent** (e.g., `ConcurrentHashMap`):
  - Iterators reflect some of the updates made after iterator creation.
  - Do not throw `ConcurrentModificationException`.
  - Designed for concurrent environments—good balance between consistency and performance.

## When to use what?
- Single-threaded or synchronized iteration → standard collections.
- Many readers, few writers → `CopyOnWriteArrayList`.
- Highly concurrent read/write → `ConcurrentHashMap` and other `java.util.concurrent` collections.

## Run
Compile & run from `src/`:
```bash
javac *.java
java FailFastDemo
java FailSafeDemo
java ConcurrentMapIteratorDemo
```

## Diagram
```mermaid
flowchart LR
  A[Iterator created] --> B{Collection Type}
  B -->|ArrayList / HashMap| C[Fail-Fast -> ConcurrentModificationException]
  B -->|CopyOnWriteArrayList| D[Fail-Safe -> Snapshot; No exception]
  B -->|ConcurrentHashMap| E[Weakly-Consistent -> No exception; may reflect updates]