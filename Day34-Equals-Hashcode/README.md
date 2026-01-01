# Day 34 — equals() & hashCode() Contract

The `equals()` and `hashCode()` methods define how Java objects
are compared and stored in hash-based collections.

---

## Why This Matters

If `equals()` and `hashCode()` are not implemented correctly:
- HashMap may lose entries
- HashSet may store duplicates
- Bugs become very hard to debug

---

## equals() Contract

1. **Reflexive** → x.equals(x) == true  
2. **Symmetric** → x.equals(y) == y.equals(x)  
3. **Transitive** → x.equals(y) && y.equals(z) ⇒ x.equals(z)  
4. **Consistent** → repeated calls give same result  
5. **Non-null** → x.equals(null) == false  

---

## hashCode() Contract

- If two objects are equal → **same hashCode**
- Unequal objects *may* have same hashCode (collision allowed)
- hashCode must remain consistent during object's lifetime

---

## Golden Rule

> If you override `equals()`, you **must** override `hashCode()`.

---

## Hash-Based Collections Impact

| Collection | Uses equals | Uses hashCode |
|------------|-------------|---------------|
| HashMap | ✅ | ✅ |
| HashSet | ✅ | ✅ |
| LinkedHashMap | ✅ | ✅ |
| TreeMap | ❌ | ❌ |

(TreeMap uses `compareTo()` / `Comparator`)

---
