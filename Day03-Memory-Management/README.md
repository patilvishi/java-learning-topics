# Day 03 Java Memory Management: Stack vs Heap & Garbage Collection

This project demonstrates how Java stores:
- **Primitives & references** on the **Stack**
- **Objects** on the **Heap**

## Key Points
- Each thread gets its own Stack.
- Heap is shared across threads.
- Garbage Collector frees unreachable Heap objects.

### Run
```bash
javac src/MemoryDemo.java
java -cp src MemoryDemo
