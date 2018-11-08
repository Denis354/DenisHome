package book;

import java.util.ArrayList;
import java.util.List;

public class booksArr {

	private  List < book > Biblioteka = new  ArrayList <> ();
		public booksArr () {
			
			Biblioteka.add(new book(0,"Алхимик","Пауло Коельо","АСТ",2008,224,106,"Твердый"));
			Biblioteka.add(new book(1,"Джава","Блинов","джавак",2006,800,100,"Твердый"));
			Biblioteka.add(new book(2,"Джава Джуниор","Блинов","джавак",2000,224,50,"Мягкий"));
			Biblioteka.add(new book(3,"С++","Шилд","джавак",1996,200,50,"Мягкий"));
			Biblioteka.add(new book(4,"Война","Попов","АСТ",1995,500,50,"Твердый"));
		
		}
		public  void printBook(int id){
	        System.out.println(Biblioteka.get(id));
		}
		 public void addbook(int id, String name, String autor, String publisher, 
					Integer yearOfRelease, Integer page, Integer cost,String coverType){
			
			Biblioteka.add(new book(id,name,autor,publisher,yearOfRelease,page,cost,coverType)); 
		 
		 }
		 public void findByAuthor(String author) {
		        for (int i = 0; i < Biblioteka.size(); i++) {
		            if(author.equalsIgnoreCase(Biblioteka.get(i).getAutor())) ;
		            {
		                System.out.println(Biblioteka.get(i));
		            }

		        }

		 }
		 } 

		 
