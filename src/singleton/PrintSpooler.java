package singleton;

public class PrintSpooler {
    private static final PrintSpooler spooler = new PrintSpooler();

    private static boolean initialized = false;
    private PrintSpooler() {}

    private void init() {

    }

    private static synchronized PrintSpooler getInstance() {
        if (!initialized) {
            spooler.init();
            initialized = true;
        }
        return spooler;
    }
}
