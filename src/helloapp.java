public class helloapp {
    public static void main(String[] args) {
        System.out.println("Hello World");
        if (args.length >= 1 && args[0] != null && !args[0].trim().isEmpty()) {
            System.out.println("Hello " + args[0].trim());
        } else {
            System.out.println("Hello World");
        }
    }
}