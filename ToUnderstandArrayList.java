package List;

import java.util.ArrayList;

public class ToUnderstandArrayList{
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("sanjay");
		list.add("Varun");
		list.add("Nandha");
		list.add("felciya");
		
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("-----------------------");
		list.remove(0);//remove the first element
		
		for (String string : list) {
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
		
		ArrayList<Book> books=new ArrayList<Book>();
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
