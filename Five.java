import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Five {
    public static void main(String[] args) {

        int[][] array = new int[10][10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                System.out.print("Enter nunber of index [" +i+ "] ["+ j +"]: ");
                 array[i][j] = input.nextInt();
            }
        }
        for (int[] row : array){
            for (int value: row){
                System.out.print(value + ", ");
            }
            System.out.println();
        }
    }
}