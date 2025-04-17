public class Shape {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Right-angled triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nInverted right-angled triangle:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPyramid pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nInverted pyramid pattern:");
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
       System.out.println("\n IN Abc");
       for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
    int   a ="A";
            System.out.print(a+i);
            
        }
        System.out.println();
    }

    

}
