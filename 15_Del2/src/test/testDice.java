package test;

import static org.junit.Assert.*;

import org.junit.Test;

import spil.Dice;

public class testDice {

	@Test
	public void test() {
		/*
		 * Uses mean values to determine if the dice throws values within some threshholds of the expected mean value.
		 */
		Dice d1 = new Dice();
		int n=100000;//define number of rolls
		boolean test=false; //initializes the boolean test value.
		double lowerThreshold=3.45;//define lower threshold for an acceptable mean
		double upperThreshold=3.55;//define upper threshold for an acceptable mean
		double sum=0.0;
		double mean=0.0;
		int[]arr=new int[n];
		for(int i=0;i<n;i++){//rolling n times
			d1.roll();
			arr[i]=d1.getValue();
		} 	
		for(double a : arr){ //summing the values
			sum+=a;
		}
		mean=sum/(double)arr.length;//calculating mean
		if(mean>lowerThreshold &&mean<upperThreshold){//true if mean is within the threshold boundaries
			test=true;
		}
		assertTrue(test);//asserts the boolean value of "test"
	}

}
