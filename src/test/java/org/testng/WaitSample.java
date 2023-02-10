package org.testng;

import java.time.Duration;

public class WaitSample {
	
	//long a;
	Duration d=Duration.ofMillis(0);
	//Duration plusMillis;
	
	private void sample(Duration duration) {
		
		long millis = duration.toMillis();
		Duration x = duration.ofMillis(millis);
		
		while (!d.equals(x)) {
			//d.
			System.out.println(d);			
			d = d.plusMillis(500);
			//a=d.toMillis();
		}

	}
	
	public static void main(String[] args) {
		
		WaitSample sample = new WaitSample();
		sample.sample(Duration.ofSeconds(100));
		
	}

}
