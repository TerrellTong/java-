
/*毕老师用电脑上课，电脑蓝屏，冒烟*/

public class hm_07_异常应用 {
    public static void main(String[] args) {
        Teacher t= new Teacher("毕老师");
        try {
            t.prelect();
        }
        catch (MaoYan e)
        {
            System.out.println(".....");
        }
    }
}
