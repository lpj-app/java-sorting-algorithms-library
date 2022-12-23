package sortingAlgorithmsLibrary;

public class arrayQuicksort {

	arrayQuicksort() {}

	int runs = 0;
	
	public int[] intQuickSort(int[] i) {
		
		long start = System.nanoTime();

		int[] tmp = i;
		intSort(tmp, 0, tmp.length - 1);
		
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print("[ ");
		for(int z= 0; z< i.length; z++) {
		  System.out.print(i[z]+", ");
		}
		System.out.println("]\n");
		
		i = tmp;
		return i;
	}
	
	public void intSwap(int[] arr, int i, int j) {
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
	
	public void intSort(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		int pivot = arr[highIndex];

		int leftPointer = intPartition(arr, lowIndex, highIndex, pivot);

		intSwap(arr, leftPointer, highIndex);

		intSort(arr, lowIndex, leftPointer - 1);
		intSort(arr, leftPointer + 1, highIndex);
	}

	private int intPartition(int[] arr, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			intSwap(arr, leftPointer, rightPointer);
			
			runs++;
			System.out.print("\n"+runs + ". ");
			System.out.print("[ ");
			for(int n = 0; n< arr.length; n++) {
			  System.out.print(arr[n]+", ");
			}
			System.out.println("]");
		}
		return leftPointer;
	}

	public double[] doubleQuickSort(double[] i) {
		
		long start = System.nanoTime();

		double[] tmp = i;
		doubleSort(tmp, 0, tmp.length - 1);
		
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print("[ ");
		for(int z= 0; z< i.length; z++) {
		  System.out.print(i[z]+", ");
		}
		System.out.println("]\n");
		
		i = tmp;
		return i;
	}
	
	public void doubleSwap(double[] arr, int i, int j) {
		double k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
	
	public void doubleSort(double[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		double pivot = arr[highIndex];

		int leftPointer = doublePartition(arr, lowIndex, highIndex, pivot);

		doubleSwap(arr, leftPointer, highIndex);

		doubleSort(arr, lowIndex, leftPointer - 1);
		doubleSort(arr, leftPointer + 1, highIndex);
	}

	private int doublePartition(double[] arr, int lowIndex, int highIndex, double pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			doubleSwap(arr, leftPointer, rightPointer);
			
			runs++;
			System.out.print("\n"+runs + ". ");
			System.out.print("[ ");
			for(int n = 0; n< arr.length; n++) {
			  System.out.print(arr[n]+", ");
			}
			System.out.println("]");
		}
		return leftPointer;
	}

	public float[] floatQuickSort(float[] i) {
		
		long start = System.nanoTime();

		float[] tmp = i;
		floatSort(tmp, 0, tmp.length - 1);
		
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print("[ ");
		for(int z= 0; z< i.length; z++) {
		  System.out.print(i[z]+", ");
		}
		System.out.println("]\n");
		
		i = tmp;
		return i;
	}
	
	public void floatSwap(float[] arr, int i, int j) {
		float k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
	
	public void floatSort(float[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		float pivot = arr[highIndex];

		int leftPointer = (int) floatPartition(arr, lowIndex, highIndex, pivot);

		floatSwap(arr, leftPointer, highIndex);

		floatSort(arr, lowIndex, leftPointer - 1);
		floatSort(arr, leftPointer + 1, highIndex);
	}

	private float floatPartition(float[] arr, int lowIndex, int highIndex, float pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			floatSwap(arr, leftPointer, rightPointer);
			
			runs++;
			System.out.print("\n"+runs + ". ");
			System.out.print("[ ");
			for(int n = 0; n< arr.length; n++) {
			  System.out.print(arr[n]+", ");
			}
			System.out.println("]");
		}
		return leftPointer;
	}
	
	public long[] longQuickSort(long[] i) {
		
		long start = System.nanoTime();

		long[] tmp = i;
		longSort(tmp, 0, tmp.length - 1);
		
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Longs in " + runs + " runs:");
		System.out.print("[ ");
		for(int z= 0; z< i.length; z++) {
		  System.out.print(i[z]+", ");
		}
		System.out.println("]\n");
		
		i = tmp;
		return i;
	}
	
	public void longSwap(long[] arr, int i, int j) {
		long k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
	
	public void longSort(long[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		long pivot = arr[highIndex];

		int leftPointer = (int) longPartition(arr, lowIndex, highIndex, pivot);

		longSwap(arr, leftPointer, highIndex);

		longSort(arr, lowIndex, leftPointer - 1);
		longSort(arr, leftPointer + 1, highIndex);
	}

	private long longPartition(long[] arr, int lowIndex, int highIndex, long pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			longSwap(arr, leftPointer, rightPointer);
			
			runs++;
			System.out.print("\n"+runs + ". ");
			System.out.print("[ ");
			for(int n = 0; n< arr.length; n++) {
			  System.out.print(arr[n]+", ");
			}
			System.out.println("]");
		}
		return leftPointer;
	}
	
}
