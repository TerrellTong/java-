public class Ticket implements Runnable {
    private int num = 200;
    private Object obj = new Object();
    public void run()
    {

            while (num > 0) {
                synchronized (obj) {
                    if(num>0)//如果此行注释，会导致当num=1时4个线程都进来了，然后就会出现访问出错
                    {
                        System.out.println(Thread.currentThread().getName() + "...sale..." + num--);
                    }
                }
            }

        }
    }

