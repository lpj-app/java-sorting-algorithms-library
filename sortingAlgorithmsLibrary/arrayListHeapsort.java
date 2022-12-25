package sortingAlgorithmsLibrary;

import java.util.ArrayList;

public class arrayListHeapsort {
	public arrayListHeapsort() {}
	
	public void intHeapsort(ArrayList<Integer> x) {

		long start = System.nanoTime();
		int runs = 0;
		int N = x.size();

		for (int i = N / 2 - 1; i >= 0; i--) {
			intHeap(x, N, i);
			runs++;
			System.out.println("\n"+runs + ". " + x+"\n");
		}
		for (int i = N - 1; i > 0; i--) {
			int temp = x.get(0);
			x.set(0, x.get(i));
			x.set(i, temp);

			intHeap(x, i, 0);
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(x+"\n");
	}

	private void intHeap(ArrayList<Integer> x, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < N && x.get(l) > x.get(largest))
			largest = l;

		if (r < N && x.get(r) > x.get(largest))
			largest = r;

		if (largest != i) {
			int swap = x.get(i);
			x.set(i, x.get(largest));
			x.set(largest, swap);

			intHeap(x, N, largest);
		}
	}
	
	public void doubleHeapsort(ArrayList<Double> x) {

		long start = System.nanoTime();
		int runs = 0;
		int N = x.size();

		for (int i = N / 2 - 1; i >= 0; i--) {
			doubleHeap(x, N, i);
			runs++;
			System.out.println("\n"+runs + ". " + x+"\n");
		}
		for (int i = N - 1; i > 0; i--) {
			double temp = x.get(0);
			x.set(0, x.get(i));
			x.set(i, temp);

			doubleHeap(x, i, 0);
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print(x+"\n");
	}

	private void doubleHeap(ArrayList<Double> x, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < N && x.get(l) > x.get(largest))
			largest = l;

		if (r < N && x.get(r) > x.get(largest))
			largest = r;

		if (largest != i) {
			double swap = x.get(i);
			x.set(i, x.get(largest));
			x.set(largest, swap);

			doubleHeap(x, N, largest);
		}
	}

	public void floatHeapsort(ArrayList<Float> x) {

		long start = System.nanoTime();
		int runs = 0;
		int N = x.size();

		for (int i = N / 2 - 1; i >= 0; i--) {
			floatHeap(x, N, i);
			runs++;
			System.out.println("\n"+runs + ". " + x+"\n");
		}
		for (int i = N - 1; i > 0; i--) {
			float temp = x.get(0);
			x.set(0, x.get(i));
			x.set(i, temp);

			floatHeap(x, i, 0);
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print(x+"\n");
	}

	private void floatHeap(ArrayList<Float> x, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < N && x.get(l) > x.get(largest))
			largest = l;

		if (r < N && x.get(r) > x.get(largest))
			largest = r;

		if (largest != i) {
			float swap = x.get(i);
			x.set(i, x.get(largest));
			x.set(largest, swap);

			floatHeap(x, N, largest);
		}
	}

	public void longHeapsort(ArrayList<Long> x) {

		long start = System.nanoTime();
		int runs = 0;
		int N = x.size();

		for (int i = N / 2 - 1; i >= 0; i--) {
			longHeap(x, N, i);
			runs++;
			System.out.println("\n"+runs + ". " + x+"\n");
		}
		for (int i = N - 1; i > 0; i--) {
			long temp = x.get(0);
			x.set(0, x.get(i));
			x.set(i, temp);

			longHeap(x, i, 0);
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Longs in " + runs + " runs:");
		System.out.print(x+"\n");
	}

	private void longHeap(ArrayList<Long> x, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < N && x.get(l) > x.get(largest))
			largest = l;

		if (r < N && x.get(r) > x.get(largest))
			largest = r;

		if (largest != i) {
			long swap = x.get(i);
			x.set(i, x.get(largest));
			x.set(largest, swap);

			longHeap(x, N, largest);
		}
	}

}
