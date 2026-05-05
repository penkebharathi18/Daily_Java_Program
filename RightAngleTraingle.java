// File name: LoopPractice.java
class RightAngleTraingle {
    public static void main(String args[]) {
        int n = 5;

        for (int i = n; i >= 1; i--) {

            // spaces
            for (int k = n; k > i; k--) {
                System.out.print("  ");
            }

            // x pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }

            System.out.println();
        }
    }
}