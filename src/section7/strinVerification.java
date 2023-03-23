package section7;

public class strinVerification {
    public static void main(String[] args) {
        String s ="hello world!";
        System.out.println(s.contains("w"));
        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.startsWith("hello"));
        System.out.println(s.endsWith("world!"));
        System.out.println(s.isEmpty());
    }
}
