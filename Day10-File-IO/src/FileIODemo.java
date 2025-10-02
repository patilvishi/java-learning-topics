import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileIODemo {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("demo");
        Files.createDirectories(dir);

        // Write text to a file
        Path file = dir.resolve("sample.txt");
        Files.writeString(file, "Hello NIO.2!\nLine 2");

        // Read the entire file as a String
        String content = Files.readString(file);
        System.out.println("File Content:\n" + content);

        // Read all lines into a List
        List<String> lines = Files.readAllLines(file);
        lines.forEach(l -> System.out.println("-> " + l));

        // Append text
        Files.writeString(file, "\nAppended line", StandardOpenOption.APPEND);

        // List files in the directory
        System.out.println("\nFiles in 'demo':");
        try (var stream = Files.list(dir)) {
            stream.forEach(System.out::println);
        }

        // Walk directory tree
        System.out.println("\nWalking directory tree:");
        Files.walk(dir).forEach(System.out::println);
    }
}
