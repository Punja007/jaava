public class patterns {
    public static void Hollow_rectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void Rotated_half_pyramid(int row) {
        for (int i = 1; i <= row; i++) {
            int j = 1;
            for (j = 1; j <= (row - i); j++) {
                System.out.print(" ");
            }
            while (j > (row - i) && j <= row) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

    public static void Rotated_half_pyramid_integers(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row + 1 - i); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyd(int row) {
        int counter = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void tri01(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i || j > (2 * n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        for (int i = n; i > 0; i--) // only change the cond for outer loop to invert any shape
        {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i || j > (2 * n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= n - i + 1 || j > (2 * n - i + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void empty_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j > n - i + 1 && j <= (2 * n - i + 1)) {
                    if (j == n + 2 - i || j == (2 * n) + 1 - i) {
                        System.out.print("*");
                    } else if (i == 1 || i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j >= (n + 1 - i) && j <= (n - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j >= (n + 1 - i) && j <= (n - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void empty_diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j == (n + 1 - i) || j == (n - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j == (n + 1 - i) || j == (n - 1 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow_rectangle(4, 5);
        Rotated_half_pyramid(4);
        Rotated_half_pyramid_integers(5);
        floyd(5);
        tri01(5);
        butterfly(4);
        rhombus(6);
        empty_rhombus(7);
        diamond(4);
        empty_diamond(4);
    }
}
