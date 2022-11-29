import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int p = 0, n = 0, pr = 0, imp = 0;
        for (int i = 0; i < 5; i++) {
            double val = sc.nextDouble();
            if (val > 0) {
                p++;
                if (val % 2 == 0) {
                    pr++;
                } else {
                    imp++;
                }
            } else if (val == 0) {
                if (val % 2 == 0) {
                    pr++;
                } else {
                    imp++;
                }
            } else {
                n++;
                if (val % 2 == 0) {
                    pr++;
                } else {
                    imp++;
                }
            }
        }
        System.out.println(pr + " valor(es) par(es)");
        System.out.println(imp + " valor(es) impar(es)");
        System.out.println(p + " valor(es) positivo(s)");
        System.out.println(n + " valor(es) negativo(s)");
        sc.close();
    }
}
