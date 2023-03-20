package section5;

public class tablicaUmn {
    public static void main(String[] args) {
        var to = 9;

        for (int i = 1; i <= to; i++) {
            for (int j=1; j <= to; j++) {
                var i1 = i * j;
                System.out.print((i1 == 1 ? "" : i1) + "\t");
}
            System.out.println();
        }



    }
}
