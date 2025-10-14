#  Java Daily Series – Day 19  
## ExecutorService Shutdown & Best Practices 🔌

Learn how to **gracefully terminate** thread pools in Java using `ExecutorService`.

---

###  Concept
Proper shutdown ensures:
- All tasks finish cleanly
- Threads don’t leak
- App exits gracefully

---

###  Code Files
- `WorkerTask.java` – simple task simulation
- `ExecutorShutdownDemo.java` – demonstrates graceful & forced shutdown

---

###  Steps
1. Submit tasks to ExecutorService  
2. Call `shutdown()` to stop new submissions  
3. Use `awaitTermination()` to wait for existing tasks  
4. If not done → `shutdownNow()`  