import java.util.ArrayList;

public class sort {
	
	public static void main(String[] args) {
		
		int[] list = {8,3,7,8,7,1,0,9,3,5,12,3,5,3,5,2,6,7,8,9};

		printList(list);
		isSorted(list);
		int[] bubble = bubbleSort(list);
		int[] selection = selectionSort(list);
		int[] insertion = insertionSort(list);
		printList(bubble);
		isSorted(bubble);
		printList(selection);
		isSorted(selection);
		printList(insertion);
		isSorted(insertion);

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


	public static void printList(int[] s) {

		for (int a : s) {
			System.out.print(a+", ");
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