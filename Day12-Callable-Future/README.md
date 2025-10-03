# Day 12: Callable & Future

### Concepts
- `Callable<V>` is like `Runnable` but can **return a result** and **throw exceptions**.
- `Future<V>` represents the result of an asynchronous computation.
  - `future.get()` blocks until the result is ready.
  - `future.isDone()` checks completion status.

### Run
javac src/CallableFutureDemo.java
java -cp src CallableFutureDemo
