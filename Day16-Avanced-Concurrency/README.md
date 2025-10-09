# Day 16: Advanced Concurrency Utilities

## Covered
- Semaphore → control access to resources
- CountDownLatch → wait for threads to finish
- CyclicBarrier → synchronize threads at checkpoints

## Run
javac src/*.java
java -cp src SemaphoreExample

## Summary
Semaphores limit concurrent threads.
CountDownLatch waits for all threads.
CyclicBarrier synchronizes tasks at a common point.
