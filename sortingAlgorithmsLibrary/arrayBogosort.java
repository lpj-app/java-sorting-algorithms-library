package sortingAlgorithmsLibrary;

public class arrayBogosort {
	
	public arrayBogosort() {}
	
	public void intBogosort(int[] i) {
		long start = System.nanoTime();
		int runs = 0;
		while(!intIsSorted(i)) {
			intShuffle(i);
			runs++;
			System.out.print("\n"+runs + ". ");
			System.out.print("[ ");
			for(int n = 0; n< i.length; n++) {
			  System.out.print(i[n]+", ");
			}
			System.out.println("]");
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print("[ ");
		for(int z= 0; z< i.length; z++) {
		  System.out.print(i[z]+", ");
		}
		System.out.println("]\n");
		
	}

	private void intShuffle(int[] i) {
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean intIsSorted(int[] i) {
		for(int x = 0; x < i.length - 1; ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}

	public void doubleBogosort(double[] i) {
		long start = System.nanoTime();
		int runs = 0;
		while(!doubleIsSorted(i)) {
			doubleShuffle(i);
			runs++;
			System.out.print("\n"+runs + ". ");
			System.out.print("[ ");
			for(int n = 0; n< i.length; n++) {
			  System.out.print(i[n]+", ");
			}
			System.out.println("]");
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print("[ ");
		for(int z= 0; z< i.length; z++) {
		  System.out.print(i[z]+", ");
		}
		System.out.println("]\n");
		
	}

	private void doubleShuffle(double[] i) {
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = (int) i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean doubleIsSorted(double[] i) {
		for(int x = 0; x < i.length - 1; ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}

	public void floatBogosort(float[] i) {
		long start = System.nanoTime();
		int runs = 0;
		while(!floatIsSorted(i)) {
			floatShuffle(i);
			runs++;
			System.out.print("\n"+runs + ". ");
			System.out.print("[ ");
			for(int n = 0; n< i.length; n++) {
			  System.out.print(i[n]+", ");
			}
			System.out.println("]");
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print("[ ");
		for(int z= 0; z< i.length; z++) {
		  System.out.print(i[z]+", ");
		}
		System.out.println("]\n");
		
	}

	private void floatShuffle(float[] i) {
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = (int) i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean floatIsSorted(float[] i) {
		for(int x = 0; x < i.length - 1; ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}
	
	public void longBogosort(long[] i) {
		long start = System.nanoTime();
		int runs = 0;
		while(!longIsSorted(i)) {
			longShuffle(i);
			runs++;
			System.out.print("\n"+runs + ". ");
			System.out.print("[ ");
			for(int n = 0; n< i.length; n++) {
			  System.out.print(i[n]+", ");
			}
			System.out.println("]");
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Longs in " + runs + " runs:");
		System.out.print("[ ");
		for(int z= 0; z< i.length; z++) {
		  System.out.print(i[z]+", ");
		}
		System.out.println("]\n");
		
	}

	private void longShuffle(long[] i) {
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = (int) i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}

	private boolean longIsSorted(long[] i) {
		for(int x = 0; x < i.length - 1; ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}
	
}
