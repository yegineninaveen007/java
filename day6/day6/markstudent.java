package day6;

public class markstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {10, 25, 20, 65, 30, 50, 65};

        int currentSum = scores[0];
        int highestScore = scores[0];
        int y=0;
        for (int i = 1; i < scores.length; i++) {
            currentSum = Math.max(scores[i], currentSum + scores[i]);

            highestScore = Math.max(highestScore, currentSum);
        }
        System.out.println("index "+y);
        System.out.println("Highest Score = " + highestScore);
	}

}
