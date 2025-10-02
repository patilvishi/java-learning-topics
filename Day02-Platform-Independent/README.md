# Day 2 - Why Java is Platform Independent

### 🔹 Explanation
Java achieves platform independence via **bytecode**:
- `.java` source code is compiled into `.class` bytecode.
- Bytecode is the same regardless of OS.
- JVM interprets/JIT-compiles bytecode into machine code for each platform.
- As long as a JVM exists on a platform, Java programs run without changes.

---

### 🔹 Steps to Run
```bash
javac PlatformTest.java   # Compile into bytecode
java PlatformTest         # Run using JVM
