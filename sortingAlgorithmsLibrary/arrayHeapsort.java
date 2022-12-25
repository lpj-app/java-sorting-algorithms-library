package sortingAlgorithmsLibrary;

public class arrayHeapsort {
	public arrayHeapsort() {
	}

	public void intHeapsort(int[] x) {

		long start = System.nanoTime();
		int runs = 0;
		int N = x.length;

		for (int i = N / 2 - 1; i >= 0; i--) {
			intHeap(x, N, i);
			runs++;
			System.out.print("\n" + runs + ". ");
			System.out.print("[ ");
			for (int n = 0; n < x.length; n++) {
				System.out.print(x[n] + ", ");
			}
			System.out.println("]");
		}
		for (int i = N - 1; i > 0; i--) {
			int temp = x[0];
			x[0] = x[i];
			x[i] = temp;

			intHeap(x, i, 0);
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print("[ ");
		for (int z = 0; z < x.length; z++) {
			System.out.print(x[z] + ", ");
		}
		System.out.println("]\n");
	}

	private void intHeap(int[] x, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < N && x[l] > x[largest])
			largest = l;

		if (r < N && x[r] > x[largest])
			largest = r;

		if (largest != i) {
			int swap = x[i];
			x[i] = x[largest];
			x[largest] = swap;

			intHeap(x, N, largest);
		}
	}

	public void doubleHeapsort(double[] x) {

		long start = System.nanoTime();
		int runs = 0;
		int N = x.length;

		for (int i = N / 2 - 1; i >= 0; i--) {
			doubleHeap(x, N, i);
			runs++;
			System.out.print("\n" + runs + ". ");
			System.out.print("[ ");
			for (int n = 0; n < x.length; n++) {
				System.out.print(x[n] + ", ");
			}
			System.out.println("]");
		}
		for (int i = N - 1; i > 0; i--) {
			double temp = x[0];
			x[0] = x[i];
			x[i] = temp;

			doubleHeap(x, i, 0);
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print("[ ");
		for (int z = 0; z < x.length; z++) {
			System.out.print(x[z] + ", ");
		}
		System.out.println("]\n");
	}

	private void doubleHeap(double[] x, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		// If left child is larger than root
		if (l < N && x[l] > x[largest])
			largest = l;

		if (r < N && x[r] > x[largest])
			largest = r;

		if (largest != i) {
			double swap = x[i];
			x[i] = x[largest];
			x[largest] = swap;

			doubleHeap(x, N, largest);
		}
	}

	public void floatHeapsort(float[] x) {

		long start = System.nanoTime();
		int runs = 0;
		int N = x.length;

		for (int i = N / 2 - 1; i >= 0; i--) {
			floatHeap(x, N, i);
			runs++;
			System.out.print("\n" + runs + ". ");
			System.out.print("[ ");
			for (int n = 0; n < x.length; n++) {
				System.out.print(x[n] + ", ");
			}
			System.out.println("]");
		}
		for (int i = N - 1; i > 0; i--) {
			float temp = x[0];
			x[0] = x[i];
			x[i] = temp;

			floatHeap(x, i, 0);
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print("[ ");
		for (int z = 0; z < x.length; z++) {
			System.out.print(x[z] + ", ");
		}
		System.out.println("]\n");
	}

	private void floatHeap(float[] x, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		// If left child is larger than root
		if (l < N && x[l] > x[largest])
			largest = l;

		if (r < N && x[r] > x[largest])
			largest = r;

		if (largest != i) {
			float swap = x[i];
			x[i] = x[largest];
			x[largest] = swap;

			floatHeap(x, N, largest);
		}
	}

	public void longHeapsort(long[] x) {

		long start = System.nanoTime();
		int runs = 0;
		int N = x.length;

		for (int i = N / 2 - 1; i >= 0; i--) {
			longHeap(x, N, i);
			runs++;
			System.out.print("\n" + runs + ". ");
			System.out.print("[ ");
			for (int n = 0; n < x.length; n++) {
				System.out.print(x[n] + ", ");
			}
			System.out.println("]");
		}
		for (int i = N - 1; i > 0; i--) {
			long temp = x[0];
			x[0] = x[i];
			x[i] = temp;

			longHeap(x, i, 0);
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Longs in " + runs + " runs:");
		System.out.print("[ ");
		for (int z = 0; z < x.length; z++) {
			System.out.print(x[z] + ", ");
		}
		System.out.println("]\n");
	}

	private void longHeap(long[] x, int N, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		// If left child is larger than root
		if (l < N && x[l] > x[largest])
			largest = l;

		if (r < N && x[r] > x[largest])
			largest = r;

		if (largest != i) {
			long swap = x[i];
			x[i] = x[largest];
			x[largest] = swap;

			longHeap(x, N, largest);
		}
	}

}
