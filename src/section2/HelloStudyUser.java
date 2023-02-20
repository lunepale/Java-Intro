package section2;

public class HelloStudyUser {
    public static void main(String[] args) {
        var name = System.getProperty("user.name");
        System.out.println("Hello, " + name);
    }
}
