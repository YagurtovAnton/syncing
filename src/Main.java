
void main(){
/*throws InterruptedException {

Printer printer = new Printer();

Thread t1 = new Thread(() -> printer.print("printer"));
Thread t2 = new Thread(() -> printer.print("принтер"));

t1.start();
t2.start();

t1.join();
t2.join();

*/
    Woker workerTask = new Woker();
    Thread thread = new Thread(workerTask);
    thread.start();

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("Остановка");
    workerTask.stop();

    try {
        thread.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("Программа успешно завершена.");
}