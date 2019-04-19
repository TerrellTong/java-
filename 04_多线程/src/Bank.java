public class Bank {
    private int sum;
    public synchronized void add(int num)
    {
        sum = sum+num;
        System.out.println("sum="+sum);
    }
}
