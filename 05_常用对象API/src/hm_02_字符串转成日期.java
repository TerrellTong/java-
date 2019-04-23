import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class hm_02_字符串转成日期 {
    public static void main(String[] args) throws ParseException {
        String str = "2012-4-19";
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date date =dateFormat.parse(str);
        System.out.println(date);
    }
}
