/**
 * Day 2 - Why Java is Platform Independent
 *
 * Java is platform independent because:
 * 1. Source code (.java) is compiled into bytecode (.class).
 * 2. Bytecode is not platform-specific.
 * 3. JVM on any OS can interpret or JIT compile bytecode into native code.
 *
 * => "Write once, run anywhere"
 */
public class PlatformTest {
    public static void main(String[] args) {
        System.out.println("Running on OS: " + System.getProperty("os.name"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
    }
}
