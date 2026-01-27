# Day 42 Stream vs Collection

Streams and Collections often look similar but are designed
for completely different purposes.

---

## Core Difference

- **Collection** → stores data
- **Stream** → processes data

---

## Collection Characteristics

- Stores elements in memory
- Can be iterated multiple times
- Supports CRUD operations
- Eager evaluation

Examples:
- List
- Set
- Map

---

## Stream Characteristics

- No storage
- One-time use
- Lazy evaluation
- Functional style
- Supports parallelism

Examples:
- stream()
- parallelStream()

---

## Comparison Table

| Aspect | Collection | Stream |
|------|------------|--------|
| Purpose | Data storage | Data processing |
| Iteration | Multiple times | Only once |
| Evaluation | Eager | Lazy |
| Modification | Allowed | Not allowed |
| Parallelism | Manual | Built-in |
| API Style | Imperative | Functional |

---

## Performance Notes

- Collections are fast for access
- Streams are optimized for transformations
- Parallel streams depend on data source & spliterator

---

## Interview Tip

> *“Why can’t streams be reused?”*

Because streams represent **a computation pipeline**, not data.

---

