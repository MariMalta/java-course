package application;

import sun.awt.X11.XSystemTrayPeer;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the number of lines and columns of your matrix");

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        System.out.println("Type the elements of your matrix: ");

        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Type the number you want to verify: ");
        int x = sc.nextInt();
        System.out.println(x);

        for(int i=0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
