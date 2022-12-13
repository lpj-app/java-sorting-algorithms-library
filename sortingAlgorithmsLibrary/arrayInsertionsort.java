package InsertionSort;

public class arrayInsertionsort {

	arrayInsertionsort() {}

	public int[] intInsertionsort(int[] x) {

		long start = System.nanoTime();

		int[] tmp = x;

		int runs = 0;
		
		for (int i = 1; i < tmp.length; i++) {
			int help = tmp[i];
			int j = i;
			while (j > 0 && help < tmp[j - 1]) {
				tmp[j] = tmp[j - 1];
				j--;
			}
			tmp[j] = help;
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

	public double[] doubleInsertionsort(double[] x) {
		long start = System.nanoTime();

		double[] tmp = x;

		int runs = 0;
		
		for (int i = 1; i < tmp.length; i++) {
			double help = tmp[i];
			int j = i;
			while (j > 0 && help < tmp[j - 1]) {
				tmp[j] = tmp[j - 1];
				j--;
			}
			tmp[j] = help;
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

	public float[] floatInsertionsort(float[] x) {
		long start = System.nanoTime();

		float[] tmp = x;

		int runs = 0;
		
		for (int i = 1; i < tmp.length; i++) {
			float help = tmp[i];
			int j = i;
			while (j > 0 && help < tmp[j - 1]) {
				tmp[j] = tmp[j - 1];
				j--;
			}
			tmp[j] = help;
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

	public long[] longInsertionsort(long[] x) {
		long start = System.nanoTime();

		long[] tmp = x;

		int runs = 0;
		
		for (int i = 1; i < tmp.length; i++) {
			long help = tmp[i];
			int j = i;
			while (j > 0 && help < tmp[j - 1]) {
				tmp[j] = tmp[j - 1];
				j--;
			}
			tmp[j] = help;
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
