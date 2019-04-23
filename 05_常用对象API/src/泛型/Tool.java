package 泛型;

/*泛型类*/
public class Tool<Q> {
    private Q q;
    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }
    /*泛型方法*/
    public <w>void show(w q)
    {
        System.out.println("show:"+q.toString());
    }

    public void print(Q str)
    {
        System.out.println("print:"+str.toString());
    }




}
