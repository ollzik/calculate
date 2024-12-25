import java.util.Scanner;
class Calculate {
    public static void calculate(String str) {
        int z = 0;
        for (int i = 0; i < str.length(); i++) {
            if (('а' <= str.charAt(i)) && 'п' >= str.charAt(i)) {
                z++;
                continue;
            } else if (('А' <= str.charAt(i)) && 'П' >= str.charAt(i)) {
                z++;
                continue;
            } else if (('a' <= str.charAt(i)) && 'm' >= str.charAt(i)) {
                z++;
                continue;
            } else if (('A' <= str.charAt(i)) && 'M' >= str.charAt(i)) {
                z++;
                continue;
            } else {
            }
            ;
        }
        System.out.println(z);
    }

    public static void calculate(int z[]) {
        long count = 0;
        for (int i = 0; i < z.length; i++) {
            if (z[i] % 2 == 0) {
                count += z[i];
            }
        }
        System.out.println(count);
    }

    public static void calculate(int l[][], String str) {
        char[][] y = new char[l.length][l[0].length];
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {
                y[i][j] = str.charAt(l[i][j]);
            }
        }
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {
                System.out.print(y[i][j]);
            }
        }
    }
}
