package YKtasks;

import java.util.Arrays;

/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */
public class task10 {
    public static void main(String[] args) {
        String[] arraySource = {"John", "Dan", "Ashe", "Carl", "Bill"};
       Arrays.sort(arraySource);



String[] arrayTarget = new String[arraySource.length+1];

        for (int i = 0; i < arrayTarget.length-1; i++) {
            arrayTarget[i] = arraySource[i];
        }
                arrayTarget[arrayTarget.length - 1] = "Stan";


for (String i : arrayTarget) {
    System.out.println(i);;
}
       // System.out.println(Arrays.toString(arrayTarget));
    }
}
