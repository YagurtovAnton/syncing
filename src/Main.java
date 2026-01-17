
void main() throws InterruptedException {
    Printer printer = new Printer();

    Thread t1 = new Thread(() -> printer.print("printer"));
    Thread t2 = new Thread(() -> printer.print("принтер"));

    t1.start();
    t2.start();

    t1.join();
    t2.join();
}