package main;

import java.util.List;
import java.util.Scanner;

import model.Book;
import model.Issue;
import model.Student;
import service.BookService;
import service.BookServiceImpl;
import service.IssueService;
import service.IssueServiceImpl;
import service.StudentService;
import service.StudentServiceImpl;

public class Main {
	public static void main(String[] args) {
		int choice = 0;
		boolean adminLogin = false;
		Scanner sc = new Scanner(System.in);
		StudentService studentService = new StudentServiceImpl();
		BookService bookService = new BookServiceImpl();
		IssueService issueService = new IssueServiceImpl();
		while(choice != 1) {
			System.out.println("1. Exit");
			System.out.println("2. Student Login");
			System.out.println("3. Admin Login");
			System.out.println("4. List all the student");
			System.out.println("5. List all the books");
			System.out.println("6. Search book by author");
			System.out.println("7. Issue book");
			choice = sc.nextInt();
			switch(choice) {
			case 1: return;
			case 2: break;
			case 3: 
				System.out.println("Enter the password:");
				String pass = sc.next();
				if(pass.equals("hello123")){
					adminLogin = true;
				}else{
					adminLogin = false;
				}
				break;
			case 4:
				if(!adminLogin) {
					System.out.println("Enter as admin first");
					break;
				}
				List<Student> list = studentService.findAll();
				System.out.println(list);
				break;
			case 5:
				List<Book> listb = bookService.findAll();
				System.out.println(listb); break;
			case 6:
				System.out.println("Enter Author:");
				sc.next();
				String author = sc.nextLine();
//				List<Book> lista = bookService.findByAuthor(author);
//				System.out.println(lista);break;
				//if(sc.hasNext())sc.hasNextLine();
				bookService.findByAuthor(author).forEach(System.out :: println);break;
			case 7:
				if(!adminLogin) {
					System.out.println("Enter as admin first");
					break;
				}
				System.out.println("Enter bid: ");
				int bid = sc.nextInt();
				System.out.println("Enter sid: ");
				int sid = sc.nextInt();
				issueService.add(bid, sid);
				List<Issue> listi = issueService.findAll();
				System.out.println(listi);
			}
			System.out.println("Bye Bye");
		}
		sc.close();
	}
}
