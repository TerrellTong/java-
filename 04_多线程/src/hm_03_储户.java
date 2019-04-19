/*需求:储户，两个，每个都到银行存钱每次存100，共存三次*/
public class hm_03_储户 {
    public static void main(String[] args) {
        Cus c=new Cus();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
