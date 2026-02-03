# Day 43 - Functional Interfaces & Lambda Internals

Functional programming in Java is built on **functional interfaces**
and **lambda expressions**.

---

## What Is a Functional Interface?

A functional interface:
- Has exactly **one abstract method**
- Can have default & static methods
- Is the target of lambda expressions

Examples:
- Runnable
- Callable
- Comparator
- Predicate
- Function
- Consumer
- Supplier

---

##  @FunctionalInterface

```java
@FunctionalInterface
interface MyFunc {
    void run();
}

```

✔ Compiler enforces single abstract method
✔ Optional but recommended

---

## Common Functional Interfaces

| Interface     | Method   | Purpose           |
| ------------- | -------- | ----------------- |
| Predicate<T>  | test()   | Boolean condition |
| Function<T,R> | apply()  | Transform         |
| Consumer<T>   | accept() | Side effects      |
| Supplier<T>   | get()    | Provide value     |


---

## Lambda Internals (Important)

Lambdas are:

	❌ NOT anonymous inner classes
	✔ Implemented using invokedynamic
	✔ Lightweight
	✔ Stateless (unless capturing variables)
---
## Effectively Final Rule

```java
int x = 10;
Runnable r = () -> System.out.println(x);
// x must not change
```
Captured variables must be effectively final

---
## Performance Notes

	- Lambdas are faster than anonymous classes
	- No extra class files
	- Better memory footprint

---