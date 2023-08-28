package com.kodnest.jumpStsatements.Break;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            if (i == 3) {
                System.out.println("Encountered 3, breaking the loop");
                break;
            }
            System.out.println("Iteration: " + i);
            // You can place any statements here, but they won't be executed after break;
        }
    }

}
