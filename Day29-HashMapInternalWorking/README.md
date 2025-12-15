# 🟢 Day 29 — HashMap Internal Working

HashMap is one of the most powerful and frequently used data structures in Java.  
This day focuses on **how HashMap works internally**.

---

## 🔹 Key Concepts Covered

✅ Hashing  
✅ Buckets  
✅ Collision Handling  
✅ Load Factor  
✅ Resizing  
✅ Treeification (Java 8+)

---

## 🔹 Internal Storage

HashMap internally uses:
Node<K, V>[] table
Each index is called a **bucket**.

---

## 🔹 How put() Works

1. Key → `hashCode()` generated  
2. Hash converted to index using:
index = (n - 1) & hash
3. If bucket empty → store node  
4. If collision → LinkedList / Tree (Red-Black Tree after threshold)

---

## 🔹 Collision Handling

Before Java 8:
Bucket → Linked List
After Java 8:
Bucket → Red-Black Tree (if > 8 nodes)

---

## 🔹 Load Factor & Resizing

Default:
Initial Capacity = 16
Load Factor = 0.75
Resize Threshold = 12
When size > threshold → Map resizes to double capacity.

---

## 🔹 Special Properties

| Feature | HashMap |
|----------|----------|
| Order Maintained | ❌ No |
| Null Keys | ✅ One |
| Thread Safety | ❌ No |
| Time Complexity | O(1) Avg |

---

## 🧩 Mermaid Diagram

```mermaid
flowchart TD
    A[Key] --> B[hashCode]
    B --> C[Hash Function]
    C --> D[Index Calculation]
    D --> E[Bucket]
    E -->|No Collision| F[Store Node]
    E -->|Collision| G[LinkedList]
    G -->|>8 Nodes| H[Red-Black Tree]
