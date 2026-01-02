# Day 35 — Object Class Essentials

Every Java class implicitly extends `java.lang.Object`.
Understanding its core methods is fundamental.

---

## Core Object Methods

### 1️ toString()
- Returns string representation of object
- Used heavily in logging & debugging

### 2️ compareTo() (Comparable)
- Defines natural ordering
- Used by TreeSet, TreeMap, Collections.sort()

### 3️ clone()
- Creates object copy
- Default → shallow copy
- Requires `Cloneable` marker interface

### 4️ getClass()
- Returns runtime class metadata
- Used in reflection and debugging

---

## clone() Caveats
- Shallow copy by default
- Error-prone
- Prefer:
  - Copy constructors
  - Factory methods

---

## Comparison Summary

| Method | Purpose | Common Use |
|------|--------|-----------|
| toString | Readable output | Logs, debugging |
| compareTo | Sorting | TreeMap, TreeSet |
| clone | Copy object | Rarely recommended |
| getClass | Runtime info | Reflection |

---

## Next → Day 36: Java Optional — Avoiding NullPointerException
