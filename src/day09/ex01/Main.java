package day09.ex01;

import day09.ex01.library.LibraryView;

/**
 * packageName    : day09.ex01
 * fileName       : Main
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class Main {
	public static void main(String[] args) {
		Controller ctr = Controller.getObj();
		ctr.start();
	}
}
