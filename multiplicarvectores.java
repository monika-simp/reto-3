import java.util.Scanner;
public class multiplicarvectores {
    public static void main(String[] args) {
        int n , r=0;
        System.out.println("digite el tamaño de los vectores a operar");
        Scanner mo = new Scanner(System.in);
        n = Integer.parseInt(mo.nextLine());
        int [] vectora = new int[n];
        int [] vectorb = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("digite un componente del vector a");
            vectora[j] = mo.nextInt();
            System.out.println("digite un componente del vector b");
            vectorb[j] = mo.nextInt();
            r = r + (vectora[j]*vectorb[j]);
        }

        System.out.println("el resultado es " + r);
    }

}