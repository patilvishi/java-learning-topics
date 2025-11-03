# Day 26 – Collections Utility Class (Sorting & Searching)

## Overview
`java.util.Collections` provides **static helper methods** to manipulate collections easily.

It helps perform:
- ✅ Sorting
- 🔍 Searching
- 🔄 Reversing
- 🔀 Shuffling
- 🧵 Thread Safety Wrappers

---

##  Key Methods

| Method | Description |
|--------|--------------|
| `sort(List<T> list)` | Sorts list in natural order |
| `sort(List<T>, Comparator<? super T>)` | Sorts using custom comparator |
| `binarySearch(List<? super T>, T key)` | Searches for element (must be sorted) |
| `reverse(List<?>)` | Reverses order |
| `shuffle(List<?>)` | Randomly reorders elements |
| `min(Collection<?>)` | Returns smallest element |
| `max(Collection<?>)` | Returns largest element |
| `synchronizedList(List<T>)` | Thread-safe wrapper |

---
