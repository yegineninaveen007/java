package rightangle;
public class LeftAngleTriangle {
    public static void main(String[] args) {
        int rows = 5;  // number of rows

        for (int i = 1; i <= rows; i++) {
            // print spaces first
            for (int j = i; j < rows; j++) {
                System.out.print("  ");  // two spaces for alignment
            }
            // then print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}
