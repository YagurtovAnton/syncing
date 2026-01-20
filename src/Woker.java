public class Woker implements Runnable {
    private volatile boolean shouldStop = false;
    public void stop() { this.shouldStop = true; }

    @Override
    public void run() {
        System.out.println("Начал выполнение.");
        while (!shouldStop) {
            System.out.println("Выполняю задачу...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("Завершаю работу корректно.");
    }
}
