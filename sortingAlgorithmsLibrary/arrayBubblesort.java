package sortingAlgorithmsLibrary;

public class arrayBubblesort {

	public arrayBubblesort(){}
	
	public int[] intBubblesort(int[] x) {

		long start = System.nanoTime();

		int[] tmp = x;

		int l = x.length;
		int help = 0;
		int runs = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 1; j < (l - i); j++) {
				if (tmp[j] < tmp[j-1]) {
					help = tmp[j-1];
					tmp[j-1] = tmp[j];
					tmp[j] = help;
					runs++;
					System.out.print(runs + ". ");
					System.out.print("[ ");
					for(int n = 0; n< tmp.length; n++) {
					  System.out.print(tmp[n]+", ");
					}
					System.out.println("]");
				}
			}
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print("[ ");
		for(int i = 0; i< tmp.length; i++) {
		  System.out.print(tmp[i]+", ");
		}
		System.out.println("]");

		x = tmp;
		return x;
	}

	public Double[] doubleBubblesort(Double[] x) {

		long start = System.nanoTime();

		Double[] tmp = x;

		int l = x.length;
		double help = 0;
		int runs = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 1; j < (l - i); j++) {
				if (tmp[j] < tmp[j-1]) {
					help = tmp[j-1];
					tmp[j-1] = tmp[j];
					tmp[j] = help;
					runs++;
					System.out.print(runs + ". ");
					System.out.print("[ ");
					for(int n = 0; n< tmp.length; n++) {
					  System.out.print(tmp[n]+", ");
					}
					System.out.println("]");
				}
			}
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print("[ ");
		for(int i = 0; i< tmp.length; i++) {
		  System.out.print(tmp[i]+", ");
		}
		System.out.println("]");

		x = tmp;
		return x;
	}

	public Float[] floatBubblesort(Float[] x) {

		long start = System.nanoTime();

		Float[] tmp = x;

		int l = x.length;
		float help = 0;
		int runs = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 1; j < (l - i); j++) {
				if (tmp[j] < tmp[j-1]) {
					help = tmp[j-1];
					tmp[j-1] = tmp[j];
					tmp[j] = help;
					runs++;
					System.out.print(runs + ". ");
					System.out.print("[ ");
					for(int n = 0; n< tmp.length; n++) {
					  System.out.print(tmp[n]+", ");
					}
					System.out.println("]");
				}
			}
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print("[ ");
		for(int i = 0; i< tmp.length; i++) {
		  System.out.print(tmp[i]+", ");
		}
		System.out.println("]");
		x = tmp;
		return x;
	}

	public Long[] longBubblesort(Long[] x) {

		long start = System.nanoTime();

		Long[] tmp = x;

		int l = x.length;
		long help = 0;
		int runs = 0;

		for (int i = 0; i < l; i++) {
			for (int j = 1; j < (l - i); j++) {
				if (tmp[j] < tmp[j-1]) {
					help = tmp[j-1];
					tmp[j-1] = tmp[j];
					tmp[j] = help;
					runs++;
					System.out.print(runs + ". ");
					System.out.print("[ ");
					for(int n = 0; n< tmp.length; n++) {
					  System.out.print(tmp[n]+", ");
					}
					System.out.println("]");
				}
			}
		}

		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print("[ ");
		for(int i = 0; i< tmp.length; i++) {
		  System.out.print(tmp[i]+", ");
		}
		System.out.println("]");

		x = tmp;
		return x;
	}
	
}
