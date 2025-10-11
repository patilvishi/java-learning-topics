# Day 17: ThreadPool Executors Deep Dive

### Topics Covered
- ExecutorService basics
- FixedThreadPool
- CachedThreadPool
- ScheduledThreadPool
- Shutdown lifecycle

### Commands
javac src/*.java
java -cp src FixedThreadPoolExample

### Summary
- Avoid creating threads manually — use thread pools.
- Choose pool type based on your workload.
- Always call `shutdown()` after submitting tasks.
