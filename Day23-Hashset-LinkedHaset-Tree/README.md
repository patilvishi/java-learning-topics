# Java Daily Series — Day 23: Set Interface Deep Dive

##  Overview
A **Set** is a collection that **contains unique elements only**.  
It comes in three main flavors — `HashSet`, `LinkedHashSet`, and `TreeSet`.

##  Hierarchy
```mermaid
flowchart TD
    A[Set Interface] --> B[HashSet]
    A --> C[LinkedHashSet]
    A --> D[TreeSet]

##  Comparison
	
| Feature     | HashSet   | LinkedHashSet   | TreeSet     |
| ----------- | --------- | --------------- | ----------- |
| Order       | Unordered | Insertion Order | Sorted      |
| Structure   | HashMap   | LinkedHashMap   | TreeMap     |
| Performance | O(1)      | O(1)            | O(log n)    |
| Nulls       | 1 allowed | 1 allowed       | Not allowed |
