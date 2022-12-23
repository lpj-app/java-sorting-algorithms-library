package sortingAlgorithmsLibrary;

import java.util.ArrayList;

public class arrayListQuicksort {
	
	public arrayListQuicksort() {}
	
	int runs = 0;
	
	public ArrayList<Integer> intQuickSort(ArrayList<Integer> i) {
		
		long start = System.nanoTime();

		ArrayList<Integer> tmp = i;
		intSort(tmp, 0, tmp.size() - 1);
		
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(i+"\n");
		
		i = tmp;
		return i;
	}
	
	public void intSwap(ArrayList<Integer> arr, int i, int j) {
		int k = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, k);
	}
	
	public void intSort(ArrayList<Integer> arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		int pivot = arr.get(highIndex);

		int leftPointer = intPartition(arr, lowIndex, highIndex, pivot);

		intSwap(arr, leftPointer, highIndex);

		intSort(arr, lowIndex, leftPointer - 1);
		intSort(arr, leftPointer + 1, highIndex);
	}

	private int intPartition(ArrayList<Integer> arr, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr.get(leftPointer) <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr.get(rightPointer) >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			intSwap(arr, leftPointer, rightPointer);
			
			runs++;
			System.out.println(runs + ". " + arr+"\n");
		}
		return leftPointer;
	}

	public ArrayList<Double> doubleQuickSort(ArrayList<Double> i) {
		
		long start = System.nanoTime();

		ArrayList<Double> tmp = i;
		doubleSort(tmp, 0, tmp.size() - 1);
		
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print(i+"\n");
		
		i = tmp;
		return i;
	}
	
	public void doubleSwap(ArrayList<Double> arr, int i, int j) {
		double k = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, k);
	}
	
	public void doubleSort(ArrayList<Double> arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		double pivot = arr.get(highIndex);

		int leftPointer = doublePartition(arr, lowIndex, highIndex, pivot);

		doubleSwap(arr, leftPointer, highIndex);

		doubleSort(arr, lowIndex, leftPointer - 1);
		doubleSort(arr, leftPointer + 1, highIndex);
	}

	private int doublePartition(ArrayList<Double> arr, int lowIndex, int highIndex, double pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr.get(leftPointer) <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr.get(rightPointer) >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			doubleSwap(arr, leftPointer, rightPointer);
			
			runs++;
			System.out.println(runs + ". " + arr+"\n");
		}
		return leftPointer;
	}

	public ArrayList<Float> floatQuickSort(ArrayList<Float> i) {
		
		long start = System.nanoTime();

		ArrayList<Float> tmp = i;
		floatSort(tmp, 0, tmp.size() - 1);
		
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print(i+"\n");
		
		i = tmp;
		return i;
	}
	
	public void floatSwap(ArrayList<Float> arr, int i, int j) {
		float k = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, k);
	}
	
	public void floatSort(ArrayList<Float> arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		float pivot = arr.get(highIndex);

		int leftPointer = floatPartition(arr, lowIndex, highIndex, pivot);

		floatSwap(arr, leftPointer, highIndex);

		floatSort(arr, lowIndex, leftPointer - 1);
		floatSort(arr, leftPointer + 1, highIndex);
	}

	private int floatPartition(ArrayList<Float> arr, int lowIndex, int highIndex, float pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr.get(leftPointer) <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr.get(rightPointer) >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			floatSwap(arr, leftPointer, rightPointer);
			
			runs++;
			System.out.println(runs + ". " + arr+"\n");
		}
		return leftPointer;
	}
	
	public ArrayList<Long> longQuickSort(ArrayList<Long> i) {
		
		long start = System.nanoTime();

		ArrayList<Long> tmp = i;
		longSort(tmp, 0, tmp.size() - 1);
		
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Longs in " + runs + " runs:");
		System.out.print(i+"\n");
		
		i = tmp;
		return i;
	}
	
	public void longSwap(ArrayList<Long> arr, int i, int j) {
		long k = arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j, k);
	}
	
	public void longSort(ArrayList<Long> arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		long pivot = arr.get(highIndex);

		int leftPointer = longPartition(arr, lowIndex, highIndex, pivot);

		longSwap(arr, leftPointer, highIndex);

		longSort(arr, lowIndex, leftPointer - 1);
		longSort(arr, leftPointer + 1, highIndex);
	}

	private int longPartition(ArrayList<Long> arr, int lowIndex, int highIndex, long pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (arr.get(leftPointer) <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (arr.get(rightPointer) >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			longSwap(arr, leftPointer, rightPointer);
			
			runs++;
			System.out.println(runs + ". " + arr+"\n");
		}
		return leftPointer;
	}
}
