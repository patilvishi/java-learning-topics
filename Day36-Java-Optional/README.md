# Day 36 — Java Optional

`Optional` is a container object introduced in Java 8 to represent
a value that may or may not be present.

---

## Why Optional?

- ❌ Avoids NullPointerException
- ✅ Makes absence explicit
- ✅ Encourages functional style
- ✅ Improves API readability

---

##  Creating Optional

```java
Optional.of(value);        // value must not be null
Optional.ofNullable(value); // value can be null
Optional.empty();          // empty optional

```
---
## Common Methods

| Method        | Description                |
| ------------- | -------------------------- |
| isPresent()   | Checks if value exists     |
| ifPresent()   | Executes action if present |
| orElse()      | Default value              |
| orElseGet()   | Lazy default               |
| orElseThrow() | Throws exception           |
| map()         | Transform value            |
| filter()      | Conditional presence       |

---

## Anti-Patterns

	❌ Using Optional.get() without checking
	❌ Using Optional for fields
	❌ Using Optional in serialization

---
## Best Practices

	Use Optional as return type
	Avoid using it for method parameters
	Combine with streams and lambdas
---

