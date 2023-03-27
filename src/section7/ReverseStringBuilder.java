package section7;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s="hello world!";

        StringBuilder builder = new StringBuilder();
        for(int i = s.length()-1; i >=0; i--)
        builder.append(s.charAt(i));

        System.out.println(builder.toString());

    }
}
