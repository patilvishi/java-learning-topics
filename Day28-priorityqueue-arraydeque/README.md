# Day 28 – PriorityQueue & ArrayDeque

## 🧩 Overview
Today we explore two key Queue implementations:

1️⃣ **PriorityQueue** – elements processed based on priority  
2️⃣ **ArrayDeque** – a fast double-ended queue (Deque)  

---

## 🔥 1. PriorityQueue

### Min-Heap (default)
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(20);
pq.offer(10);
pq.offer(40);

---
### Output (sorted order):
```java
10 20 40

---
### Max-Heap
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

---

## 🔥 2. ArrayDeque (Deque)

### Add from both ends
```java
deque.addFirst("A");
deque.addLast("B");

---
### Stack behavior
```java
deque.push("X");
deque.pop();

---
### Queue behavior
```java
deque.offer("Z");
deque.poll();

---