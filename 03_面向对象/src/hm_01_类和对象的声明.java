public class hm_01_类和对象的声明 {
    public static class Car{
        int num;
        String color;
        void run(){
            System.out.println(num+".."+color);
        }
    }
    public static void main(String[] args) {
        Car benchi = new Car();
        benchi.num=3;
        benchi.color="red";
        benchi.run();
    }
}
