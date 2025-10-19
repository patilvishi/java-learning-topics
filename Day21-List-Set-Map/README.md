# 🚀 Java Daily Series — Day 21: Introduction to Collections Framework

## 🧩 Overview
The Java Collections Framework (JCF) is a unified API for managing groups of objects — replacing manual array handling with powerful, generic data structures.

## 🏗️ Hierarchy
```mermaid
flowchart TD
    A[Collection Interface] --> B[List]
    A --> C[Set]
    A --> D[Queue]
    E[Map Interface] --> F[HashMap]
    E --> G[TreeMap]
    E --> H[LinkedHashMap]
    B --> I[ArrayList]
    B --> J[LinkedList]
    C --> K[HashSet]
    C --> L[TreeSet]
    D --> M[PriorityQueue]
