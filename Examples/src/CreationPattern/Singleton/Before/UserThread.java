package CreationPattern.Singleton.Before;

public class UserThread extends Thread {
    private int id;

    public UserThread(int id) {
        super(id+"");
    }

    public void print() {
        Printer printer = Printer.getPrinter();
        printer.print(Thread.currentThread().getName() + " print using " + printer.toString());
    }
}
