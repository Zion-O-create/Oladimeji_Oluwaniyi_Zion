//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class One {
    public static void main(String[] args) {
        //1 a and b
        for (int i = 1; i <= 5; i++) {
            System.out.println("++++====++++");
        }

        //space between question 1a and b
        System.out.println();
        System.out.println();


//nested loop
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 12; column++) {
                if (column > 3 && column < 8) {
                    System.out.print("=");
                }else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}