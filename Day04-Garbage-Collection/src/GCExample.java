public class GCExample {

    static class BigObject {
        private byte[] memory = new byte[5 * 1024 * 1024]; // 5 MB
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting GC Demo...");

        for (int i = 0; i < 10; i++) {
            new BigObject(); // Objects quickly become unreachable
            if (i % 2 == 0) System.gc(); // request GC to show logs
            Thread.sleep(500);
        }

        System.out.println("Demo Complete");
    }
}
