#  Java Daily Series – Day 18  
## ScheduledThreadPoolExecutor – Delayed & Periodic Task Scheduling 

Welcome to **Day 18** of the #JavaDailySeries!  
In this lesson, we explore the **ScheduledThreadPoolExecutor**, a powerful tool for scheduling delayed and periodic tasks in Java.

---

## Concept Overview

The `ScheduledThreadPoolExecutor` is an advanced thread pool designed for **time-based task execution**.

It extends `ThreadPoolExecutor` and implements `ScheduledExecutorService`.

Think of it as:
>  “Run this after 10 seconds, or repeat this every 5 seconds.”

It’s perfect for:
- Scheduling recurring background jobs  
- Running periodic health checks  
- Automating cache cleanup or reporting tasks  

---

##  Key Methods

| Method | Description |
|--------|--------------|
| `schedule(Runnable command, long delay, TimeUnit unit)` | Executes once after a delay |
| `scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)` | Executes periodically at a fixed rate |
| `scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)` | Executes periodically with a fixed delay between tasks |

---

