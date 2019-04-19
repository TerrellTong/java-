public class Upan implements USB { //实现规则
    @Override
    public void open() {
        System.out.println("Upan打开");
    }
    @Override
    public void close() {
        System.out.println("Upan关闭");
    }
}
