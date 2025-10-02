# Day 4 Java Garbage Collection: Minor vs Major GC

This example forces frequent allocations so you can watch the JVM
perform **Minor** and **Major** garbage collections.

## Run with GC logs
```bash
javac src/GCExample.java
java -Xmx64m -verbose:gc -cp src GCExample
