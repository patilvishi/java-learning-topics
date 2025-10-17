# Java Daily Series – Day 20  
## ForkJoinPool & Work-Stealing Algorithm ⚡

Efficient parallelism using divide-and-conquer tasks in Java.

---

###  Concept
The ForkJoinPool divides large tasks into smaller sub-tasks, runs them in parallel, and merges results using the **work-stealing algorithm**.

---

###  Code Files
- `SumTask.java` – Implements RecursiveTask for summation
- `ForkJoinDemo.java` – Demonstrates ForkJoinPool invocation