#  Java Daily Series — Day 22: List Interface Deep Dive (ArrayList vs LinkedList)

##  Overview
A **List** is an ordered collection that allows duplicates and supports index-based access.  
The two main implementations are `ArrayList` (backed by a dynamic array) and `LinkedList` (backed by nodes).

## ️ Comparison
| Feature | ArrayList | LinkedList |
|----------|------------|-------------|
| Structure | Dynamic Array | Doubly Linked List |
| Access | O(1) | O(n) |
| Insert/Delete | O(n) | O(1) |
| Memory | Low | High |
| Use Case | Read-heavy | Frequent insertions/deletions |

##  Internal Diagram
```mermaid
flowchart LR
    subgraph ArrayList
    A1["[0] Alice"] --> A2["[1] Bob"] --> A3["[2] Charlie"]
    end

    subgraph LinkedList
    B1["Node(Alice)"] <---> B2["Node(Bob)"] <---> B3["Node(Charlie)"]
    end
