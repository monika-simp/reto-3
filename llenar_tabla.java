import java.util.Scanner;

public class llenar_tabla {
    public static void main(String[] args) {

        int n;
        int m;
        int i;
        int j;
        Scanner sc = new Scanner(System.in);
        Scanner mo = new Scanner(System.in);
        System.out.println("digite un nuemro n");
        n = Integer.parseInt(mo.nextLine());
        System.out.println("digite un nuemro m");
        m = Integer.parseInt(mo.nextLine());
        double[][] tabla = new double[n][m];
        System.out.println("empezemos");


        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("ingre el dato en la posicion " + i + " " + j);
                tabla[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n;i++) {
            for (j = 0; j < n;j++) {
                System.out.println(tabla[i][j]);
            }
        }
    }
}
