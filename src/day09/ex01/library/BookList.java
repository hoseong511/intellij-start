package day09.ex01.library;

/**
 * packageName    : day09.ex01
 * fileName       : BookList
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class BookList {
	Book[] bookList;

	public BookList() {
		bookList = new Book[0];
	}

	public void push(Book book) {
		Book[] tmp = new Book[bookList.length + 1];
		for (int i = 0; i <bookList.length; i++) {
			tmp[i] = bookList[i];
		}
		tmp[tmp.length - 1] = book;
		bookList = tmp;
	}

	public void remove(Book book) {
		Book[] tmp = new Book[bookList.length - 1];
		for (int i = 0, j = 0; i < bookList.length; i++) {
			if (bookList[i] == book) {
				continue ;
			}
			tmp[j] = bookList[i];
			j++;
		}
		bookList = tmp;
	}

	public Book[] getBookList() {
		return bookList;
	}
}
