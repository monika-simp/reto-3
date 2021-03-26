import java.util.Scanner;

public class productocruz {
    public static void main(String[] args) {
        int i= 0 , j =0  ,k =0;
        Scanner mo = new Scanner(System.in);
        int[] vectora = new int[3];
        int[] vectorb = new int[3];
        for (int m = 0; m < 3; m++) {
            System.out.println("digite un componente del vector u");
            vectora[m] = mo.nextInt();
            System.out.println("digite un componente del vector v");
            vectorb[m] = mo.nextInt();
        }
        i = (vectora[1]*vectorb[2]);
        i = i-(vectora[2]*vectorb[1]);
        j = (vectora[0]*vectorb[2]);
        j = j-(vectora[2]*vectorb[0]);
        k = ((vectora[0]*vectorb[1]));
        k = k - (vectora[1]*vectorb[0]);

        System.out.println("i es igual a " + i + " j es igual a  " + -j + " k es igual a " + k);
    }
}

