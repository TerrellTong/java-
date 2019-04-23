import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hm_01_日期转成字符串 {
    public static void main(String[] args) {
        /*日期转成字符串*/
        Date date = new Date();
        String str = "";
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        str = dateFormat.format(date);
        System.out.println(str);

        dateFormat = DateFormat.getDateTimeInstance();
         str = dateFormat.format(date);
        System.out.println(str);

        dateFormat = new SimpleDateFormat("yyyy---MM----dd");
        str = dateFormat.format(date);
        System.out.println(str);

    }
}
