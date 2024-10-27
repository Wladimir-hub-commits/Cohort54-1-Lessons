package hwk_09;

/**
 * Author Waldemar Ilz
 *{code data} 15.10.2024
 */

/*
Task 1
Написать метод, принимающий массив целых чисел и распечатывающий
массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Copy
Перегрузить метод, если в него приходит индекс, то часть массива
 слева до этого индекса распечатывается в обычном порядке,
 а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Copy
Еще одна перегрузка: метод принимает массив и булевый флаг.
 Если флаг == true -> печатает массив в обратном порядке
 Если флаг == false -> печатает массив в прямом порядке
 */

public class Task_01 {
    public static void main(String[] args) {

       int[] array ={1,4,3,6,7,};
        printReverseArray(array,2);

        System.out.println("\nprintReverseArray(array);");
        printReverseArray(array);

        System.out.println("\nprintReverseArray(array, true):");
        printReverseArray(array);

        System.out.println("\nprintReverseArray(array, false):");
        printReverseArray(array);


    }//Methods area

    public static void  printReverseArray(int[] array, boolean flug){
        if (flug){
           printReverseArray(array);
        }else{
            printReverseArray(array,array.length - 1);

        }
    }

    public static void printReverseArray(int[] array){
        // Перебрать все индексы от большего к меньшему и вывести элементы
        for (int i = array.length - 1; i >= 0; i--){
            printReverseArray(array,0);
        }

    }

    public static void printReverseArray(int[] array, int index){
        System.out.println("[");
        // Печатаю все элементы под индексами от 0 до index прямой последовательности
        for (int i =0; i < index; i++) {
            System.out.println(array[i] + ", ");
        }
        // 2,3,4 -> 4,3,2
        // Печатаю все элементы под индексами от array.length - 1 до index (вкл) в обратном порядке
        for (int i = array.length - 1; i >= index ; i--  ){
                System.out.println(array[i] + (i !=index ?", " : "]\n"));


        }
    }

} //End class
