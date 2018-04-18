public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        synchronized(Main.class){
            System.out.println("中国");
        };

    }


}
