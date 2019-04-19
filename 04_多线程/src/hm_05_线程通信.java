public class hm_05_线程通信 {
    public static void main(String[] args) {
        Resouce r =new Resouce();
        Input in =new Input(r);
        Output out = new Output(r);
        Thread t1 =new Thread(in);
        Thread t2 =new Thread(out);
        t1.start();
        t2.start();
    }
}
