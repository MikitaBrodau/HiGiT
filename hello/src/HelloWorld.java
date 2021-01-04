public class HelloWorld {
    public static String sayHello(String s){
        return "Hello, " + s + "\nNice to meet you!";
    }

    public static void main(String[] args) {
        System.out.println(HelloWorld.sayHello("name"));
    }
}
