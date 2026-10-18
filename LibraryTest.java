public class LibraryTest 
{
    public static void main(String[] args) 
    {
        // Create a Library object
        // The Library constructor will ask the user to enter books
        Library library = new Library();
 
 
        // Create a Member object
        Member mem1 = new Member("Bob", "123A",5);
        Member mem2 = new Member("Jimmy", "123B",3);

 
        // Pass the Member object to the Library
        // The Library will store this member
        library.registerMember(mem1);
        library.registerMember(mem2);

        library.displayBooks();
        library.displayMembers();
 
        // Get the first Book object from the books array
        // Array position 0 represents the first book
        //Book book = library.getBook(0);   
        


    }
    
}
