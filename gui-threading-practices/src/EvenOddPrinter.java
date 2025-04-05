public class EvenOddPrinter {
    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        });
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        });
        evenThread.start();
        oddThread.start();
    }
}
