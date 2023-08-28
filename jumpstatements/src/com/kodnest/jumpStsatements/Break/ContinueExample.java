package com.kodnest.jumpStsatements.Break;

public class ContinueExample {
	 public static void main(String[] args) {
	        for (int i = 1; i <= 5; ++i) {
	            if (i == 2) {
	                System.out.println("Skipping 2 and continuing to the next iteration");
	                continue;
	            }
	            System.out.println("Iteration: " + i);
	            // You can place any statements here, but they won't be executed for the iteration where continue is encountered;
	        }
	    }

}
