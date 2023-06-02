package practice;

public class ArrayNum {

	public static void main(String[] args) {
		int[] score = {1, 40, 35, 78, 68, 95};
		int sum = 0;
		for(int i=0; i<score.length;i++) {
			System.out.println("score: "+score[i]);
			 sum += score[i];
		} 
		System.out.println("합계: "+sum);
		System.out.println("평균: "+ (sum/score.length));
		double[] sco = new double[10];
	
	}

}
