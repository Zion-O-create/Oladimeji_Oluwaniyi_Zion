import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number of index " + i+": ");
            array[i] = input.nextInt();
        }
        for (int num : array){
            System.out.println(num);
        }


    }
}