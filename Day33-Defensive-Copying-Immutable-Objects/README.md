# Day 33 — Defensive Copying & Immutable Objects

Defensive copying is a technique to protect immutable objects
from external modification—especially when dealing with mutable fields.

---

## What Is Defensive Copying?

It means **creating a copy** of a mutable object instead of storing
or returning the original reference.

---

## Why Is It Needed?

- Java classes like `Date`, `List`, `Map` are mutable
- Exposing internal references breaks immutability
- Defensive copying protects internal state

---

## Immutable Object Rules

1. Class must be `final`
2. Fields must be `private` and `final`
3. No setters
4. Defensive copy mutable fields
5. Return copies from getters

---

## Example

```java
this.date = new Date(inputDate.getTime()); // constructor copy
return new Date(this.date.getTime());      // getter copy
