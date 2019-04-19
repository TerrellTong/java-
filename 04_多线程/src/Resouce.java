public class Resouce {
    private String name;
    private String sex;
    private boolean flag=false;
    public synchronized void set(String name,String sex)
    {
        if(flag)
            try {
                this.wait();
            }
            catch (InterruptedException e)
            {}
        this.name=name;
        this.sex=sex;
        flag=true;  //当Resource的标志位为false就要写数据，写完数据了然后把标志位改为true(表示Resource里面存放了数据)
        this.notify(); //唤醒
    }
    public synchronized void out()
    {
        if(!flag) //如果是false就进行等待
            try {
                this.wait();
            }
            catch (InterruptedException e)
            {}
        System.out.println(name+"..."+sex);
            flag=false; //当Resource的标志位为true就要读数据，读完数据了然后把标志位改为false
            notify(); //唤醒
    }
}
