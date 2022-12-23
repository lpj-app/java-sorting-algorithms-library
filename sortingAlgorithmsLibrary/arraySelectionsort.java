package sortingAlgorithmsLibrary;

public class arraySelectionsort {

	public arraySelectionsort() {
	}

	public int[] intSelectionsort(int[] x) {

		long start = System.nanoTime();

		int[] tmp = x;

		int runs = 0;
		int length = tmp.length;

		for (int i = 0; i < length - 1; i++) {
			int y = i;
			int z = tmp[y];
			for (int j = i + 1; j < length; j++) {
				if (tmp[j] < z) {
					y = j;
					z = tmp[y];
				}
			}

			if (y != i) {
				tmp[y] = tmp[i];
				tmp[i] = z;
			}
			runs++;
			System.out.print(runs + ". ");
			System.out.print("[ ");
			for (int n = 0; n < tmp.length; n++) {
				System.out.print(tmp[n] + ", ");
			}
			System.out.println("]");
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print("[ ");
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + ", ");
		}
		System.out.println("]");

		x = tmp;
		return x;
	}

	public double[] doubleSelectionsort(double[] x) {

		long start = System.nanoTime();

		double[] tmp = x;

		int runs = 0;
		int length = tmp.length;

		for (int i = 0; i < length - 1; i++) {
			int y = i;
			int z = (int) tmp[y];
			for (int j = i + 1; j < length; j++) {
				if (tmp[j] < z) {
					y = j;
					z = (int) tmp[y];
				}
			}

			if (y != i) {
				tmp[y] = tmp[i];
				tmp[i] = z;
			}
			runs++;
			System.out.print(runs + ". ");
			System.out.print("[ ");
			for (int n = 0; n < tmp.length; n++) {
				System.out.print(tmp[n] + ", ");
			}
			System.out.println("]");
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print("[ ");
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + ", ");
		}
		System.out.println("]");

		x = tmp;
		return x;
	}

	public float[] floatSelectionsort(float[] x) {

		long start = System.nanoTime();

		float[] tmp = x;

		int runs = 0;
		int length = tmp.length;

		for (int i = 0; i < length - 1; i++) {
			int y = i;
			int z = (int) tmp[y];
			for (int j = i + 1; j < length; j++) {
				if (tmp[j] < z) {
					y = j;
					z = (int) tmp[y];
				}
			}

			if (y != i) {
				tmp[y] = tmp[i];
				tmp[i] = z;
			}
			runs++;
			System.out.print(runs + ". ");
			System.out.print("[ ");
			for (int n = 0; n < tmp.length; n++) {
				System.out.print(tmp[n] + ", ");
			}
			System.out.println("]");
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print("[ ");
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + ", ");
		}
		System.out.println("]");

		x = tmp;
		return x;
	}

	public long[] longSelectionsort(long[] x) {

		long start = System.nanoTime();

		long[] tmp = x;

		int runs = 0;
		int length = tmp.length;

		for (int i = 0; i < length - 1; i++) {
			int y = i;
			int z = (int) tmp[y];
			for (int j = i + 1; j < length; j++) {
				if (tmp[j] < z) {
					y = j;
					z = (int) tmp[y];
				}
			}

			if (y != i) {
				tmp[y] = tmp[i];
				tmp[i] = z;
			}
			runs++;
			System.out.print(runs + ". ");
			System.out.print("[ ");
			for (int n = 0; n < tmp.length; n++) {
				System.out.print(tmp[n] + ", ");
			}
			System.out.println("]");
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, " + (end - start) + " nanoseconds. \n");
		System.out.println("Sorted list of Longs in " + runs + " runs:");
		System.out.print("[ ");
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + ", ");
		}
		System.out.println("]");

		x = tmp;
		return x;
	}

}
