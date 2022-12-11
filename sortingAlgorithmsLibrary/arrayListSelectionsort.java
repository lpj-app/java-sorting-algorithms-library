package sortingAlgorithmsLibrary;

import java.util.ArrayList;

public class arrayListSelectionsort {

	public arrayListSelectionsort() {}

	public ArrayList<Integer> intSelectionsort(ArrayList<Integer> x) {

		long start = System.nanoTime();

		ArrayList<Integer> tmp = x;

		int runs = 0;
		int length = tmp.size();

		for (int i = 0; i < length - 1; i++) {
			int y = i;
			int z = tmp.get(y);
			for (int j = i + 1; j < length; j++) {
				if (tmp.get(j) < z) {
					y = j;
					z = tmp.get(y);
				}
			}

			if (y != i) {
				tmp.set(y, tmp.get(i));
				tmp.set(i, z);
			}
			runs++;
			System.out.println(runs + ". " + tmp);
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(x);

		x = tmp;
		return x;
	}

	public ArrayList<Double> doubleSelectionsort(ArrayList<Double> x) {

		long start = System.nanoTime();

		ArrayList<Double> tmp = x;

		int runs = 0;
		int length = tmp.size();

		for (int i = 0; i < length - 1; i++) {
			int y = i;
			double z = tmp.get(y);
			for (int j = i + 1; j < length; j++) {
				if (tmp.get(j) < z) {
					y = j;
					z = tmp.get(y);
				}
			}

			if (y != i) {
				tmp.set(y, tmp.get(i));
				tmp.set(i, z);
			}
			runs++;
			System.out.println(runs + ". " + tmp);
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(x);

		x = tmp;

		return x;
	}

	public ArrayList<Float> floatSelectionsort(ArrayList<Float> x) {

		long start = System.nanoTime();

		ArrayList<Float> tmp = x;

		int runs = 0;
		int length = tmp.size();

		for (int i = 0; i < length - 1; i++) {
			int y = i;
			float z = tmp.get(y);
			for (int j = i + 1; j < length; j++) {
				if (tmp.get(j) < z) {
					y = j;
					z = tmp.get(y);
				}
			}

			if (y != i) {
				tmp.set(y, tmp.get(i));
				tmp.set(i, z);
			}
			runs++;
			System.out.println(runs + ". " + tmp);
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(x);

		x = tmp;

		return x;
	}

	public ArrayList<Long> longSelectionsort(ArrayList<Long> x) {

		long start = System.nanoTime();

		ArrayList<Long> tmp = x;

		int runs = 0;
		int length = tmp.size();

		for (int i = 0; i < length - 1; i++) {
			int y = i;
			long z = tmp.get(y);
			for (int j = i + 1; j < length; j++) {
				if (tmp.get(j) < z) {
					y = j;
					z = tmp.get(y);
				}
			}

			if (y != i) {
				tmp.set(y, tmp.get(i));
				tmp.set(i, z);
			}
			runs++;
			System.out.println(runs + ". " + tmp);
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(x);

		x = tmp;

		return x;
	}
}
