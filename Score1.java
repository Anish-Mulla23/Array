public class Score1 {
      private static final int[] Score = {85, 92, 78, 90, 88};

    public static void main(String[] args) {
        
        int min = Score[0];
        int max = Score[0];

        for (int i = 1; i < Score.length; i++) {
            if (Score[i] > max) {
                max = Score[i];
            }
            if (Score[i] < min) {
                min = Score[i];
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
