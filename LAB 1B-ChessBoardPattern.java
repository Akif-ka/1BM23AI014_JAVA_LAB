public class ChessBoardPattern {
    public static void main(String[] args) {
        int rows = 8; 
        int cols = 8; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("B ");
                } else {
                    System.out.print("W  ");
                }
            }
            System.out.println(); 
        }
    }
}
