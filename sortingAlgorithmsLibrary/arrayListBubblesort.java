package sortingAlgorithmsLibrary;

import java.util.ArrayList;

public class arrayListBubblesort {

	public arrayListBubblesort() {}

	public ArrayList<Integer> intBubblesort(ArrayList<Integer> x) {

		long start = System.nanoTime();

		ArrayList<Integer> tmp = x;

		int l = x.size();
		int help = 0;
		int runs = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 1; j < (l - i); j++) {
				if (tmp.get(j) < tmp.get(j - 1)) {
					help = tmp.get(j - 1);
					tmp.set(j - 1, tmp.get(j));
					tmp.set(j, help);
					runs++;
					System.out.println(runs + ". " + tmp+"\n");
				}
			}
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(x+"\n");

		x = tmp;
		return x;
	}

	public ArrayList<Double> doubleBubblesort(ArrayList<Double> x) {

		long start = System.nanoTime();

		ArrayList<Double> tmp = x;

		int l = x.size();
		double help = 0;
		int runs = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 1; j < (l - i); j++) {
				if (tmp.get(j) < tmp.get(j - 1)) {
					help = tmp.get(j - 1);
					tmp.set(j - 1, tmp.get(j));
					tmp.set(j, help);
					runs++;
					System.out.println(runs + ". " + tmp + "\n");
				}
			}
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print(x);

		x = tmp;
		return x;
	}

	public ArrayList<Float> floatBubblesort(ArrayList<Float> x) {

		long start = System.nanoTime();

		ArrayList<Float> tmp = x;

		int l = x.size();
		float help = 0;
		int runs = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 1; j < (l - i); j++) {
				if (tmp.get(j) < tmp.get(j - 1)) {
					help = tmp.get(j - 1);
					tmp.set(j - 1, tmp.get(j));
					tmp.set(j, help);
					runs++;
					System.out.println(runs + ". " + tmp + "\n");
				}
			}
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print(x);

		x = tmp;
		return x;
	}

	public ArrayList<Long> longBubblesort(ArrayList<Long> x) {

		long start = System.nanoTime();

		ArrayList<Long> tmp = x;

		int l = x.size();
		long help = 0;
		int runs = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 1; j < (l - i); j++) {
				if (tmp.get(j) < tmp.get(j - 1)) {
					help = tmp.get(j - 1);
					tmp.set(j - 1, tmp.get(j));
					tmp.set(j, help);
					runs++;
					System.out.println(runs + ". " + tmp + "\n");
				}
			}
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Longs in " + runs + " runs:");
		System.out.print(x);

		x = tmp;
		return x;
	}
}