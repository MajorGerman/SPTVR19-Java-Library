package sptvr19.java.library;

import entity.Reader;
import entity.Book;
import java.util.Scanner;
import java.util.Arrays;

class App {
    Book[] books = new Book[1000];
    Reader[] readers = new Reader[1000];
    public void run() {
        System.out.println("~~~~~~~~  Library ~~~~~~~~~~");
        System.out.println("~~~~~~ by Georg Laabe ~~~~~~");
        
        boolean work = true;
        int book_count = 0;
        int reader_count = 0;
        
        while (work) {
            System.out.println("\n1. Add a new book");
            System.out.println("2. Check the books list");
            System.out.println("3. Add a new user");
            System.out.println("4. Check the readers list");
            System.out.println("5. Give a book to user");
            System.out.println("6. Return a book");
            System.out.println("7. Exit");

            System.out.print("\n> Choose function: ");

            Scanner scan = new Scanner(System.in);
            int function = scan.nextInt();      
             
            switch(function) {
                default:
                    System.out.println("\nThere is no function like that!");
                    break;
                case 1:
                    System.out.print("\nInput the name: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    System.out.print("Input the author: ");
                    String aut = scan.nextLine();
                    System.out.print("Input the publishing year: ");
                    int year = scan.nextInt();
                    Book book = new Book(name, aut, year);
                    books[book_count] = book;
                    book_count++;
                    System.out.println("\nBook was successfully added!");
                    System.out.println("\n----------------------------");
                    break;
                case 2:
                    System.out.println("");
                    for (int i = 0; i < books.length; i++) {                     
                        if (books[i] != null) {
                            System.out.println(books[i].toString());
                        }
                    }
                    System.out.println("\nAmount of books in library: " + book_count);
                    System.out.println("\n----------------------------");
                    break;
                case 3:
                    System.out.print("\nInput the name: ");
                    scan.nextLine();
                    name = scan.nextLine();
                    System.out.print("Input the surname: ");
                    String surname = scan.nextLine();
                    System.out.print("Input the phone number: ");
                    String phone = scan.nextLine();
                    Reader reader = new Reader(name, surname, phone);
                    readers[reader_count] = reader;
                    reader_count++;
                    System.out.println("\nUser was successfully added!");
                    System.out.println("\n----------------------------");                  
                    break;
                case 4:
                    System.out.println("");
                    for (int i = 0; i < readers.length; i++) {                     
                        if (readers[i] != null) {
                            System.out.println(readers[i].toString());
                        }
                    }
                    System.out.println("\nAmount of registrated readers: " + reader_count);
                    System.out.println("\n----------------------------");
                    break; 
                case 5:
                    break; 
                case 6:
                    break; 
                case 7:
                    work = false;
                    break;
                    
            }
        }
    }
}
