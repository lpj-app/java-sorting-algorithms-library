package InsertionSort;

import java.util.ArrayList;

public class arrayListInsertionsort {

	arrayListInsertionsort(){}
	
	public ArrayList<Integer> intInsertionsort(ArrayList<Integer> x) {

		long start = System.nanoTime();

		ArrayList<Integer> tmp = x;

		int runs = 0;

		for (int i = 1; i < tmp.size(); i++) {
			int help = tmp.get(i);
			int j = i;
			while (j > 0 && help < tmp.get(j-1)) {
				tmp.set(j, tmp.get(j-1));
				j--;
			}
			tmp.set(j, help);
			runs++;
			System.out.println(runs + ". " + tmp+"\n");
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(x);

		x = tmp;
		return x;
	}

	public ArrayList<Double> doubleInsertionsort(ArrayList<Double> x) {

		long start = System.nanoTime();

		ArrayList<Double> tmp = x;

		int runs = 0;

		for (int i = 1; i < tmp.size(); i++) {
			double help = tmp.get(i);
			int j = i;
			while (j > 0 && help < tmp.get(j-1)) {
				tmp.set(j, tmp.get(j-1));
				j--;
			}
			tmp.set(j, help);
			runs++;
			System.out.println(runs + ". " + tmp+"\n");
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print(x);

		x = tmp;
		return x;
	}

	public ArrayList<Float> floatInsertionsort(ArrayList<Float> x) {

		long start = System.nanoTime();

		ArrayList<Float> tmp = x;

		int runs = 0;

		for (int i = 1; i < tmp.size(); i++) {
			float help = tmp.get(i);
			int j = i;
			while (j > 0 && help < tmp.get(j-1)) {
				tmp.set(j, tmp.get(j-1));
				j--;
			}
			tmp.set(j, help);
			runs++;
			System.out.println(runs + ". " + tmp+"\n");
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print(x);

		x = tmp;
		return x;
	}

	public ArrayList<Long> longInsertionsort(ArrayList<Long> x) {

		long start = System.nanoTime();

		ArrayList<Long> tmp = x;

		int runs = 0;

		for (int i = 1; i < tmp.size(); i++) {
			long help = tmp.get(i);
			int j = i;
			while (j > 0 && help < tmp.get(j-1)) {
				tmp.set(j, tmp.get(j-1));
				j--;
			}
			tmp.set(j, help);
			runs++;
			System.out.println(runs + ". " + tmp+"\n");
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
