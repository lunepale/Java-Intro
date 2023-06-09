package YKtasks;

import java.util.Arrays;

/*
Создать массив array из 10 целых чисел
C помощью цикла записать в массив числа от 1 до 10
Вывести в консоль все записанные в него числа в таком виде - [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
public class task9 {
    public static void main(String[] args) {
int [] array = new int[10];
        System.out.println("ниже будет массив до заполнения циклом");
        System.out.println(Arrays.toString(array));
for (int i = 0; i < array.length; i++) {
    array[i]=i+1;

}System.out.println("ниже будет массив после заполнения циклом");
        System.out.println(Arrays.toString(array));

    }
}
