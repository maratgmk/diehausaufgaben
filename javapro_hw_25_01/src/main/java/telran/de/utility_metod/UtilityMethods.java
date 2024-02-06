package telran.de.utility_metod;
/*
уровень сложности: 1. Напишите утилитный класс, в котором реализованы методы получения среднего значения AVG,
максимального MAX и минимального значения MIN из следующих наборов данных:
пары целых чисел
пары дробных чисел
одного целого и одного дробного числа
массива целых чисел
массива дробных чисел
Используйте механизм перегрузки.
 */
public class UtilityMethods {
    private UtilityMethods() {
    }

    public static int getAverage(int num1, int num2) {
        return (num1+num2)/2;
    }
    public static float getAverage(float num1, float num2) {
        return (num1+num2)/2;
    }
    public static float getAverage(int num1, float num2) {
        return (num1+num2)/2;
    }


    public static int getMax(int num1, int num2) {
        int max = num1;
        if(num1 >= num2) max = num1;
        if(num1 < num2) max = num2;
        return max;
    }
    public static float getMax(float num1, float num2) {
        float max = num1;
        if(num1 >= num2) max = num1;
        if(num1 < num2) max = num2;
        return max;
    }
    public static float getMax(int num1, float num2) {
        float max = num1;
        if(num1 >= num2) max = num1;
        if(num1 < num2) max = num2;
        return max;
    }
    public static int getMin(int num1, int num2) {
        int min = num1;
        if(num1 <= num2) min = num1;
        if(num1 > num2) min = num2;
        return min;
    }
    public static float getMin(float num1, float num2) {
        float min = num1;
        if(num1 <= num2) min = num1;
        if(num1 > num2) min = num2;
        return min;
    }
    public static float getMin(int num1, float num2) {
        float min = num1;
        if(num1 <= num2) min = num1;
        if(num1 > num2) min = num2;
        return min;
    }
    public static int getAverage(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }
         return result = result / nums.length;
    }
    public static float getAverage(float[] nums){
        float result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }
        return result = result / nums.length;
    }


}
