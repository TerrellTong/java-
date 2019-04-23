import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class hm_03_两个日期相差多少天 {
    public static void main(String[] args) throws ParseException {
        String str_1 = "2012-3-17";
        String str_2 = "2012-4-6";
        //获取日期格式对象
        DateFormat dateFormat = DateFormat.getDateInstance();
        //字符串转换成日期对象
        Date date1 =dateFormat.parse(str_1);
        Date date2 =dateFormat.parse(str_2);

        long long1 = date1.getTime();
        long long2 = date2.getTime();
        long time = Math.abs(long1-long2);
        System.out.println((int)(time/1000/60/60/24)); //将毫秒转换成天
    }
}
