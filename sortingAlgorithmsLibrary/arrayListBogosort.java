package sortingAlgorithmsLibrary;

import java.util.ArrayList;

public class arrayListBogosort {
	
	public arrayListBogosort() {}
	
	public void intBogosort(ArrayList<Integer> i) {
		long start = System.nanoTime();
		int runs = 0;
		while(!intIsSorted(i)) {
			intShuffle(i);
			runs++;
			System.out.println(runs + ". " + i+"\n");
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Integers in " + runs + " runs:");
		System.out.print(i+"\n");
		
	}

	private void intShuffle(ArrayList<Integer> i) {
		for(int x = 0; x < i.size(); ++x) {
			int index1 = (int) (Math.random() * i.size()),
				index2 = (int) (Math.random() * i.size());
			int a = i.get(index1);
			i.set(index1, i.get(index2));
			i.set(index2, a);
		}
	}

	private boolean intIsSorted(ArrayList<Integer> i) {
		for(int x = 0; x < i.size() - 1; ++x) {
			if(i.get(x) > i.get(x+1)) {
				return false;
			}
		}
		return true;
	}
	
	public void doubleBogosort(ArrayList<Double> i) {
		long start = System.nanoTime();
		int runs = 0;
		while(!doubleIsSorted(i)) {
			doubleShuffle(i);
			runs++;
			System.out.println(runs + ". " + i+"\n");
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Doubles in " + runs + " runs:");
		System.out.print(i+"\n");
		
	}

	private void doubleShuffle(ArrayList<Double> i) {
		for(int x = 0; x < i.size(); ++x) {
			int index1 = (int) (Math.random() * i.size()),
				index2 = (int) (Math.random() * i.size());
			Double a = i.get(index1);
			i.set(index1, i.get(index2));
			i.set(index2, a);
		}
	}

	private boolean doubleIsSorted(ArrayList<Double> i) {
		for(int x = 0; x < i.size() - 1; ++x) {
			if(i.get(x) > i.get(x+1)) {
				return false;
			}
		}
		return true;
	}
	
	public void floatBogosort(ArrayList<Float> i) {
		long start = System.nanoTime();
		int runs = 0;
		while(!floatIsSorted(i)) {
			floatShuffle(i);
			runs++;
			System.out.println(runs + ". " + i+"\n");
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Floats in " + runs + " runs:");
		System.out.print(i+"\n");
		
	}

	private void floatShuffle(ArrayList<Float> i) {
		for(int x = 0; x < i.size(); ++x) {
			int index1 = (int) (Math.random() * i.size()),
				index2 = (int) (Math.random() * i.size());
			Float a = i.get(index1);
			i.set(index1, i.get(index2));
			i.set(index2, a);
		}
	}

	private boolean floatIsSorted(ArrayList<Float> i) {
		for(int x = 0; x < i.size() - 1; ++x) {
			if(i.get(x) > i.get(x+1)) {
				return false;
			}
		}
		return true;
	}
	
	public void longBogosort(ArrayList<Long> i) {
		long start = System.nanoTime();
		int runs = 0;
		while(!longIsSorted(i)) {
			longShuffle(i);
			runs++;
			System.out.println(runs + ". " + i+"\n");
		}
		long end = System.nanoTime();
		System.out.println("\nSorting process lasted: " + (end - start) / 1000000000 + " seconds, "
				+ (end - start) / 1000000 + " milliseconds, "+ (end - start)+" nanoseconds. \n");
		System.out.println("Sorted list of Longs in " + runs + " runs:");
		System.out.print(i+"\n");
		
	}

	private void longShuffle(ArrayList<Long> i) {
		for(int x = 0; x < i.size(); ++x) {
			int index1 = (int) (Math.random() * i.size()),
				index2 = (int) (Math.random() * i.size());
			long a = i.get(index1);
			i.set(index1, i.get(index2));
			i.set(index2, a);
		}
	}

	private boolean longIsSorted(ArrayList<Long> i) {
		for(int x = 0; x < i.size() - 1; ++x) {
			if(i.get(x) > i.get(x+1)) {
				return false;
			}
		}
		return true;
	}
}
