public class Printer {
    public synchronized void print(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}