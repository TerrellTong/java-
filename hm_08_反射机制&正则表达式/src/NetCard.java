public class NetCard implements PCI {
    public void run() {
        System.out.println("net open");
    }

    public void close() {
        System.out.println("net close");
    }
}
