import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hm_09_网页爬虫 {
    /*
    * 爬邮箱地址
    * */
    public static void main(String[] args) throws IOException {


        List<String> list = getMailsByWeb();

        for (String mail : list) {
            System.out.println(mail);
        }
    }

    public static List<String> getMailsByWeb() throws IOException {

        //1,读取源文件。
//				BufferedReader bufr = new BufferedReader(new FileReader("c:\\mail.html"));

        URL url = new URL("https://www.baidu.com/s?wd=4399&rsv_spt=1&rsv_iqid=0xe87f5c1d00001dbd&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&rqlang=cn&tn=baiduhome_pg&rsv_enter=1&oq=%25E7%2599%25BE%25E5%25BA%25A6%25E8%25B4%25B4%25E5%2590%25A7&rsv_t=adcc%2Ft2BO%2B0h4HGx6okhK9xiL5axXKgfSce8EA1M7orIKH%2FEHyRfyY99xXHffsSReu2a&inputT=1010&rsv_pq=e2e16a320000356f&rsv_sug3=16&rsv_sug1=13&rsv_sug7=100&rsv_sug2=0&rsv_sug4=1010");

        BufferedReader bufIn = new BufferedReader(new InputStreamReader(url.openStream()));

        //2,对读取的数据进行规则的匹配。从中获取符合规则的数据. \w代表一个[a-zA-Z_0-9]
      //  String mail_regex = "\\w+@\\w+(\\.\\w+)+";//邮箱
        String mail_regex="[a-zA-z]+://[^\\s]*";

        List<String> list = new ArrayList<String>();


        Pattern p = Pattern.compile(mail_regex);

        String line = null;

        while ((line = bufIn.readLine()) != null) {

            Matcher m = p.matcher(line);
            while (m.find()) {
                //3,将符合规则的数据存储到集合中。
                list.add(m.group());
            }

        }
        return list;
    }

    public static List<String> getMails() throws IOException {

        //1,读取源文件。
        BufferedReader bufr = new BufferedReader(new FileReader("c:\\mail.html"));

        //2,对读取的数据进行规则的匹配。从中获取符合规则的数据.
        String mail_regex = "\\w+@\\w+(\\.\\w+)+";

        List<String> list = new ArrayList<String>();


        Pattern p = Pattern.compile(mail_regex);

        String line = null;

        while ((line = bufr.readLine()) != null) {

            Matcher m = p.matcher(line);
            while (m.find()) {
                //3,将符合规则的数据存储到集合中。
                list.add(m.group());
            }

        }
        return list;

    }
}
