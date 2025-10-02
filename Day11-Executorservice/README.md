# Day 11: Java Concurrency with ExecutorService

### Key Concepts
- `ExecutorService` decouples task submission from thread creation.
- Use `Executors.newFixedThreadPool`, `newCachedThreadPool`, or `newSingleThreadExecutor` based on workload.
- Always call `shutdown()` and optionally `awaitTermination()`.

### Run
javac src/ExecutorDemo.java
java -cp src ExecutorDemo
