import java.util.Scanner;
public class Library 
{
    private Book[] book;
    private Member[] member;
    private int bookCount;
    private int memberCount;

    public Library()
    {
        Scanner keyboard = new Scanner(System.in);

        // Ask the user how many members books to add
        System.out.println("How many members do you want to register?");
        int memSize = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many books do you want to add?");
        int bookSize = keyboard.nextInt();
        keyboard.nextLine();
    
        //array that can hold the number of books entered
        book = new Book[bookSize];
        bookCount = bookSize;
        //array for members that holds number entered
        member = new Member[memSize];
        memberCount = memSize;

        //for loop to enter information for members
        for (int i=0; i<member.length; i++) 
        {
            System.out.println("\nEnter information for member " + (i + 1)); 
            System.out.print("Name: ");
            String name = keyboard.nextLine();
 
            System.out.print("Membership Id: ");
            String membershipID = keyboard.nextLine();
 
            System.out.print("Borrowed Books: ");
            int borrowedBooks = keyboard.nextInt();
            keyboard.nextLine();
 
            //create and store the member object in the current array position
            member[i] = new Member(name, membershipID, borrowedBooks);
            System.out.println("\nMember Registered");
        }
 
        System.out.println("\n---------------------");

        //for loop to enter information for each book
        for (int i=0; i<book.length; i++) 
        {
            System.out.println("\nEnter information for Book " + (i + 1)); 
            System.out.print("Title: ");
            String title = keyboard.nextLine();
 
            System.out.print("Author: ");
            String author = keyboard.nextLine();
 
            System.out.print("ISBN: ");
            String ISBN = keyboard.nextLine();
 
            //create and store the book object in the current array position
            book[i] = new Book(title, author, ISBN);
        }
    }
 
    //displays for books and members
    public void displayBooks()
    {
        System.out.println("\n--Library Books--");
 
        //goes through book objects in the array
        for (int i=0; i<bookCount; i++) 
        {
            //uses getters to display
            System.out.println("\nBook "+(i+1));
            System.out.println("Title: "+book[i].getTitle());
            System.out.println("Author: "+book[i].getAuthor());
            System.out.println("ISBN: "+book[i].getISBN());
        }
    }
    
    public void displayMembers()
    {
        System.out.println("\n--Library Members--");

        //goes through member objects in the array
        for (int i=0; i<memberCount; i++) 
        {
            //uses getters to display
            System.out.println("\nMember "+(i+1));
            System.out.println("Name: "+member[i].getName());
            System.out.println("MemberID: "+member[i].getMembershipID());
            System.out.println("Borrowed Books: "+member[i].getBorrowedBooks());
        }
    }
}
