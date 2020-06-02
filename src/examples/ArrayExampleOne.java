package examples;

public class ArrayExampleOne {
	final static int NUMBER = 1;
	
	public static void run() {
		System.out.println("Example " + NUMBER + " start");
		int[] integers = {50,-10,40,-30,20};
		int[] integersNegative;
		int[] integersPositive;
		
		int countPos = 0;
		int countNeg = 0;
		int indexPos = 0;
		int indexNeg = 0;
		
		for(int i : integers) {
			if( i > 0) {
				countPos++;
			}else{
				countNeg++;
			}
		}
		
		integersPositive = new int[countPos];
		integersNegative = new int[countNeg];
		
		for(int i = 0; i<integers.length; i++) {
			if( integers[i] > 0) {
				integersPositive[indexPos++] = integers[i];
			}else if( integers[i] < 0 ) {
				integersNegative[indexNeg++] = integers[i];
			}
		}
		
		
		System.out.printf("Positive: ");
		for(int i: integersPositive) {
			System.out.printf("%d ", i);
		}
		
		System.out.printf("\nNegative: ");
		for(int i: integersNegative) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		System.out.println("Example " + NUMBER + " end");
	}
}
