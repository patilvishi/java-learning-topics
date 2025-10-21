# Day 24 – Map Interface (HashMap, LinkedHashMap, TreeMap)

The **Map** interface in Java is used to store key-value pairs.  
It ensures **unique keys** — each key maps to exactly one value.

---

## Main Implementations

| Implementation | Ordering | Allows null keys | Thread-safe |
|----------------|-----------|------------------|--------------|
| `HashMap` | No | Yes (1 key) | No |
| `LinkedHashMap` | Insertion order | Yes | No |
| `TreeMap` | Sorted order | No | No |

---

##  Example
```java
Map<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.put("B", 2);
map.put("C", 3);
System.out.println(map);
