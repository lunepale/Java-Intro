package YKtasks;
/*
Написать программу которая будет выводить цифры от 1 до 10 используя цикл while
Когда цифра будет равна 2 или 6 или 10 - вывести сообщение ("[число] - some cool text")
 */
public class task7 {
    public static void main(String[] args) {
       int i = 1;
        while(i <=10) {
            if (i==2 || i==6 || i==10) {
                System.out.println(i+" - some cool text");
}else
            System.out.println(i);
            i++;
        }

    }

}
