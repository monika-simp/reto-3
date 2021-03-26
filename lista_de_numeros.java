import java.util.Scanner;
public class lista_de_numeros {
    public static void main(String[] args) {
        String n;
        int i;
        int m;
        double su =0 , pro = 0, ma=-999999999, me=999999999;
        System.out.println("digite un entero separado por comas para calcular los datos");
        Scanner mo = new Scanner(System.in);
        n = mo.nextLine();
        n.split(",");
        String [] arreglom = n.split(",");
        m = arreglom.length;
        for (i = 0; i < m; i++) {
            su = su + Integer.parseInt(arreglom[i]);
            pro=su/m;
            if (Integer.parseInt(arreglom[i])>=ma) {
                ma = Integer.parseInt(arreglom[i]);

            }
            if (Integer.parseInt(arreglom[i]) <=me) {
                me = Integer.parseInt(arreglom[i]);
            }
        }
        System.out.println("la suma es " + su);
        System.out.println("el promedio es " + pro);
        System.out.println("el mayor es " + ma);
        System.out.println("el menos es " + me);
    }
}