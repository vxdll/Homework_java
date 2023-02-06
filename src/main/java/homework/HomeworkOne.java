package homework;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkOne {
    public static void main(String[] args) {
        task_1(); // Задача №1
        task_2(); // Задача №2
        task_3(); // Задача №3
    }

    // Задание 1: Задать одномерный массив и найти в нем минимальный и максимальный элементы
    private static void task_1() {
        int [] arr = new int [] {28, 87, 11, 0, 56, 2, -19, 285, -1};
        int maximumElement = arr[0];
        int minimumElement = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (maximumElement < arr[i]) maximumElement = arr[i];
            if (minimumElement > arr[i]) minimumElement = arr[i];
        }
        System.out.printf("Максимальный элемент массива: %s%n", maximumElement);
        System.out.printf("Минимальный элемент массива: %s%n", minimumElement);
    }

    /*   Задание 2: Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    private static void task_2() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите год для проверки: ");
        int year = scan.nextInt();
        if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)){
            boolean isTrue = true;
            System.out.println(isTrue);
        } else {
            boolean isTrue = false;
            System.out.println(isTrue);
        }
    }

    /* Задание 3: Дан массив nums = [3,2,2,3] и число val = 3.
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.*/
    private static void task_3() {
        Random random = new Random();
        int [] nums = new int [] {3,3,3,2,1,3,2,1,1,1,2,3,1};
        int val = 3;
        int left = 0;
        int right = nums.length - 1;
      /*  for (int i = 0; i < nums.length; i++) { // Если необходимо рандомизировать массив
            nums[i] = random.nextInt(1,3);
        }*/
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        while (right > left){
            if ((nums[left] == val) && (nums[right] != val)){
                int x = nums[left];
                nums[left] = nums[right];
                nums[right] = x;
                left++;
                right--;
            } else if (nums[left] != val) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Преобразованный массив: " + Arrays.toString(nums));
    }
}
