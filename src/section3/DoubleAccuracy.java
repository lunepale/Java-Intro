package section3;

import java.math.BigDecimal;

public class DoubleAccuracy {
    public static void main(String[] args)
        { //точное округление
            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.1");
            BigDecimal c = a.subtract(b);
            System.out.println(c);
        }
    }

