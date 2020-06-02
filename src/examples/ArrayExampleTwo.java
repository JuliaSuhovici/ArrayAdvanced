package examples;

import java.util.Random;

public class ArrayExampleTwo {
final static int NUMBER = 2;
	
	public static void run() {
		System.out.println("Example " + NUMBER + " start");
		
		float[] temperaturesWeek = {-0.5f, 1.5f, 0.0f, 5.0f, -5.5f, 10.0f, -5.0f};
		String[] daysOfWeek = {"MO", "TU", "WE","TH", "FR", "SA", "SU"};
		
		System.out.println("Temperatures:");
		for( int i=0; i<temperaturesWeek.length; i++) {
			System.out.printf("%s %6.1fC\n", daysOfWeek[i], temperaturesWeek[i]);
		}
		
		//------MIN------//
		float min = temperaturesWeek[0];
		int minIndex = 0;
		for( int i=0; i<temperaturesWeek.length; i++) {
			if(min > temperaturesWeek[i]) {
				min = temperaturesWeek[i];
				minIndex = i;
			}
		}
		
		//------MAX------//
		float max = temperaturesWeek[0];
		int maxIndex = 0;
		for( int i=0; i<temperaturesWeek.length; i++) {
			if(max < temperaturesWeek[i]) {
				max = temperaturesWeek[i];
				maxIndex = i;
			}
		}
		
		//------AVG------//
		float avg = 0;
		float sum = 0;
		for( float tw : temperaturesWeek) {
			sum += tw;
		}
		avg = sum/temperaturesWeek.length;
		
		System.out.printf("Minimal temperature: %s\t %6.1fC\t\n", daysOfWeek[minIndex], min);
		System.out.printf("Maximal temperature: %s\t %6.1fC\t\n", daysOfWeek[maxIndex], max);
		System.out.printf("Average temperature: \t%7.1fC\n", avg);
		System.out.println();
		
		//------RANDOM------///
		float[] randomTemperatures = new float[7];
		Random  random = new Random();
		
		for( int i=0; i<randomTemperatures.length; i++) {
			randomTemperatures[i] = -10 + random.nextFloat()*(20+10);
		}
		
		System.out.println("Random temperatures:");
		for( int i=0; i<temperaturesWeek.length; i++) {
			System.out.printf("%s %6.1fC\n", daysOfWeek[i], randomTemperatures[i]);
		}
		
				
		System.out.println("Example " + NUMBER + " end");
	}
}

