//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Two {
    public static void main(String[] args) {
        //Question2
//a
        for (int row = 0; row < 6; row++) {
            if (row < 3) {
                System.out.print("****=======");

            }else {
                System.out.print("===========");
            }
            System.out.println();
        }

        //space btw answer for  a and b
        System.out.println();
        System.out.println();



//b
        for (int row = 0; row < 6; row++) {
            for (int column = 0; column < 12; column++) {
                if (row < 3 && column < 4) {
                    System.out.print("*");

                }else {
                    System.out.print("=");
                }

            }

            System.out.println();
        }
    }
}