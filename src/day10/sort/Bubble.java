package day10.sort;

import java.util.Arrays;


/**
 * packageName    : day10.sort
 * fileName       : Bubble
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class Bubble {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
