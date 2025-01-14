import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Three {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        double mean = calcMean(numbers);
        System.out.println("Mean " + mean);

        double median = calcMedian(numbers);
        System.out.println("Median" + median);

        double standardDeviation = calcStandardDiv(numbers, mean);
        System.out.println("Standard Deviation" + standardDeviation);
    }

    public static double calcMean(int[] array){
        int sum = 0;
        for (int num: array){
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static double calcMedian(int[]  array){
        Arrays.sort(array);
        int length = array.length;

        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        }else {
            return array[length / 2];
        }
    }
    public static double calcStandardDiv(int[] array, double mean){
        double sum = 0;
        for (int num : array){
            sum += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sum / array.length);

    }
}