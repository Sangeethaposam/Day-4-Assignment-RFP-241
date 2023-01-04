package com.bridzelabz.SnakeAndLadder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		 int diecount = 0;
	        String str = "";
	        int position = 0;


	        while (position < 100) {

	            int NumberOnDie = RandomNumber(1, 6);
	            int NextMove = RandomNumber(1, 3);

	            diecount++;
	            str += position + " -> ";

	            if (NextMove == 1) {

	            } else if (NextMove == 2) {
	                position += NumberOnDie;
	            } else {
	                position -= NumberOnDie;
	            }

	            if (position < 0) {
	                position = 0;
	            }

	            if (position > 100) {
	                position -= NumberOnDie;
	            }

	        }

	        System.out.println(diecount);
	        System.out.println(str + 100);


	    }

	    public static int RandomNumber(int Min, int Max) {
	        int r = Min + (int) (Math.random() * ((Max - Min) + 1));
	        return r;
	}

}
