public class LibraryTest 
{
    public static void main(String[] args) 
    {
        // Create a Library object
        // The Library constructor will ask the user to enter books
        Library library = new Library();
 
        // Display all Book objects stored in the library
        library.displayBooks();
 
        // Create a Member object
        Member member = new Member("Alice", "M001",1);
 
        // Pass the Member object to the Library
        // The Library will store this member
        library.registerMember(member);
 
        // Get the first Book object from the books array
        // Array position 0 represents the first book
        Book book = library.getBook(0);   
        


    }
    
}
