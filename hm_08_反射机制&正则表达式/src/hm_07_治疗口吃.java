public class hm_07_治疗口吃 {
    /*
    * 1，治疗口吃:我我...我我...我我我要...要要要要...要要要
    * 要..学学学学学...学学编编...编编编编.
    * .编..程程...程程...程程程
    * */
    public static void main(String[] args) {
      String str = "我我...我我...我我我要...要要要要...要要要要..学学学学学...学学" +
              "编编...编编编编..编..程程...程程...程程程";
      String reg = "(.)\\1+";
      //将.删除
        str = str.replaceAll("\\.","");
      //替换叠词
      str = str.replaceAll(reg,"$1");
        System.out.println(str);
    }
}
