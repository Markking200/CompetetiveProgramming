package CodeForces;

import java.util.Scanner;

public class ProtectSheep {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char Feld[][] = new char[R][C];
        boolean yes = false;

        for (int i = 0; i < R; i++) {
            String input = sc.next();
            for (int j = 0; j < C; j++) {
                char inputCh = input.charAt(j);
                Feld[i][j] = inputCh;
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (Feld[i][j] == '.') {
                    Feld[i][j] = 'D';
                    yes = true;
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (Feld[i][j] == '.') {

                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (Feld[i][j] == 'S') {

                    if (i != R - 1 && j != 0) {
                        if (Feld[i + 1][j] == 'W' || Feld[i][j - 1] == 'W') {
                            yes = false;
                        }
                    }

                    if (i != R - 1 && j != C - 1) {
                        if (Feld[i + 1][j] == 'W' || Feld[i][j + 1] == 'W') {
                            yes = false;
                        }
                    }

                    if (i != 0 && j != C - 1) {
                        if (Feld[i][j + 1] == 'W' || Feld[i - 1][j] == 'W') {
                            yes = false;
                        }
                    }

                    if (i != 0 && j != 0) {
                        if (Feld[i][j - 1] == 'W' || Feld[i - 1][j] == 'W') {
                            yes = false;
                        }
                    }
                } 
            }
        }
        if (R == 1 && C == 1) {
            yes = true;
        }

        if (yes == true) {
            System.out.println("YES");
            for (int i = 0; i < R; i++) {
                sc.close();
                String output = String.valueOf(Feld[i]);
                System.out.println(output);
            }
        } else {
            System.out.println("NO");
        }
    }

}
