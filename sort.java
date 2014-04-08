import java.util.ArrayList;

public class sort {
	
	public static void main(String[] args) {
		
		int[] list = {8,3,7,8,7,1,0,9,3,5,12,3,5,3,5,2,6,7,8,9};

		// printList(list);
		// isSorted(list);
		// int[] bubble = bubbleSort(list);
		// int[] selection = selectionSort(list);
		// int[] insertion = insertionSort(list);
		// printList(bubble);
		// isSorted(bubble);
		// printList(selection);
		// isSorted(selection);
		// printList(insertion);
		// isSorted(insertion);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(6);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(5);
		b.add(9);
		b.add(4);
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(8);
		c.add(4);
		c.add(7);
		c.add(2);
		c.add(5);
		c.add(3);
		c.add(9);
		c.add(6);

		printList(split(a));
		printList(merge(a, b));
		printList(mergeSort(c));

	}

	public static int[] selectionSort(int[] list) {

		int hold;
		int minValue;

		for (int i = 0; i<list.length ; i++) {
		 	
			minValue = list[i];

			int minPos = i;

			for (int j = i; j < list.length; j++) {
				if (list[j] < minValue) {
					minValue = list[j];
					minPos = j;
				}
			}
			hold = list[i];
			list[i] = minValue;
			list[minPos] = hold;
		}


		return list;

	}

	public static int[] insertionSort(int[] list) {

		int hold;
		
		for (int i=1; i<list.length; i++) {
			int numPos = i; 
 
			while (numPos != 0 && list[numPos]<list[numPos-1]) {
				hold = list[numPos];
				list[numPos] = list[numPos-1];
				list[numPos-1] = hold;
				numPos--;
			}

		}

		return list;

	}

	public static int[] bubbleSort(int[] list) {

		int hold;

		for (int i = 0; i<list.length; i++) {
			for (int j = 0; j<list.length - 1; j++) {
				if (list[j] > list[j+1]) {
					hold = list[j];
					list[j] = list[j+1];
					list[j+1] = hold;
				}
			}
		}
		return list;
	}

	public static ArrayList<Integer> split(ArrayList<Integer> a) {

		ArrayList<Integer> b = new ArrayList<Integer>();

		for (int i = a.size()/2; i<a.size(); i++) {
			b.add(a.get(i));
			a.remove(i);
			i--;
		}


		return b;
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {

		ArrayList<Integer> c = new ArrayList<Integer>();
		int countA = 0;
		int countB = 0;

		while (countA < a.size() && countB < b.size()) {
			if (a.get(countA) < b.get(countB)) {
				c.add(a.get(countA));
				countA++;
			} else {
				c.add(b.get(countB));
				countB++;
			}
		}

		while (countA < a.size()) {
			c.add(a.get(countA));
			countA++;
		}
		while (countB < b.size()) {
			c.add(b.get(countB));
			countB++;
		}

		return c;
	}

	public static ArrayList<Integer> mergeSort(ArrayList<Integer> a) {

		if(a.size() == 1) {
			return a;
		}

		return merge(mergeSort(split(a)), mergeSort(a));

		


	}

	public static void printList(ArrayList<Integer> a) {

		for (int i = 0; i<a.size(); i++) {
			System.out.print(a.get(i) + ", ");
		}
		System.out.println();


	}

	public static void printList(int[] s) {

		for (int a : s) {
			System.out.print(a+" ");
		}
		System.out.println();

	}

	public static boolean isSorted(int[] s) {

		for (int i = 0; i < s.length - 1; i++) {
			if (s[i] > s[i+1]) {
				System.out.println("Is not Sorted");
				return false;
			}
		}

		System.out.println("Is Sorted");
		return true;
	}

}