package List;

import java.util.ArrayList;
import java.util.LinkedList;
// contain duplicate elements.
//maintains insertion order.
// non synchronized.
//LinkedList class can be used as a list, stack or queue.
//null value is accepted
public class Linkedlist {
	
	public static void main(String[] args) {
		
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("sanjay");
		li.add("nandha");
		li.add("varun");
		li.add(null);
		
		for (String string : li) {
			System.out.println(string);
		}
		
		
		Book b1=new Book();
		b1.setName("life of earth");
		b1.setAuthor("sanjay");
		b1.setPrize(299);
		

		Book b2=new Book();
		b2.setName("life of sun");
		b2.setAuthor("fel");
		b2.setPrize(99);

		LinkedList<Book> books=new LinkedList<Book>();
		books.add(b1);
		books.add(b2);
		System.out.println("------------------------");
		for (Book book : books) {
			System.out.println(book.getName());
			System.out.println(book.getAuthor());
			System.out.println(book.getPrize());
			System.out.println("------------------------");
		}
		
	}

}
