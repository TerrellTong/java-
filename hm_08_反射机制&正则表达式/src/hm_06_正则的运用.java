import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hm_06_正则的运用 {
    public static void main(String[] args) {
        functionDemo_4();
    }

    //获取
    private static void functionDemo_4() {
        String str= "da jia hao,ming tian bu fang jia!";
        String reg= "\\b[a-z]{3}\\b";  //\b代表单词边界
        //1.将正则封装成对象
        Pattern p = Pattern.compile(reg);
        //2.通过正则对象获取匹配器对象
        Matcher m = p.matcher(str);
        //使用Matcher对象的方法对字符串进行操作
        //获取三个字母组成的单词，用find()方法
        System.out.println(str);
        while(m.find())
            System.out.println(m.group());

    }

    //替换
    private static void functionDemo_3() {
        String str = "zhangsanttttxiaoqiangmmmmmmmmmmzhaoliu";
        str=str.replaceAll("(.)\\1+","$1");
        System.out.println("第一次");
        System.out.println(str);
        String str1 = "15932641487";
        str1=str1.replaceAll("(1\\d{2})\\d{4}(\\d{4})","$1****$2");
        System.out.println("第二次");
        System.out.println(str1);
    }

    //切割
    private static void functionDemo_2() {
        String str = "zhangsanttttxiaoqiangmmmmmmmmmmzhaoliu";
        String str1 = "zhangsan       xiaoqiang            zhaoliu";
        String reg ="(.)\\1+"; //'+'表示一次或多次,按照tttt,/mmmmm分割
        String reg1 = " +";//按照" "来分割
        String [] arr = str.split(reg);
        System.out.println("第一次");
        for(String st : arr)
            System.out.println(st);
        String [] arr1 =str1.split(reg1);
        System.out.println("第二次");
        for(String st : arr1)
            System.out.println(st);

    }

    //匹配-匹配手机号是否正确
    private static void functionDemo_1() {
        //待检测手机号
        String tel1 = "15800021111";
        //正则表达式
        String reg = "1[358]{2}\\d{8}";
        //用mathces方法来判断
        boolean b = tel1.matches(reg);
        System.out.println(b);
    }
}
