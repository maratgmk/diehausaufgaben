package telran.de.utility_metod;

public class SampleUtilityMethods {
    public static void main(String[] args) {
      // int num1 = 3;
        int num2 =8;
        float num1 = 3.8f;
     // float num2 = 5.3f;
        int[] ints = new int[] {34,56,2,67,89,38};
        float[] floats = new float[] {3.4f,5.6f,2.0f,6.7f,8.9f,3.8f};

        System.out.println(UtilityMethods.getAverage(num1, num2));
        System.out.println(UtilityMethods.getMax(num1, num2));
        System.out.println(UtilityMethods.getMin(num1, num2));
        System.out.println(UtilityMethods.getAverage(floats));
    }
}
