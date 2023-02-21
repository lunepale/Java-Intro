package section4;

public class Switch {
    public static void main(String[] args) {
        /*var a=25;
        switch (a) {
            case 1:{
                    System.out.println("1");
                    break;
                    }
            case 2: {
                System.out.println("2");
                break;}
            case 3: {
                System.out.println("3");
                break;}
                default: {
                    System.out.println("default");
                } */

            var month = 3;
        switch (month) {
            case 1:
            case 2:
            case 12:{
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5:{
                System.out.println("Spring");
                break;
            }
            case 6:
            case 7:
            case 8:{
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11:{
                System.out.println("Autumn");
                break;
            }
            default:{
                System.out.println("default");
            }
        }
        }
    }

