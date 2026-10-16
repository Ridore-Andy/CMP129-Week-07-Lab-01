public class Member 
{
    private String name;
    private String membershipID;
    private int borrowedBooks;

    public Member(String name, String membershipID, int borrowedBooks)
    {
        this.name = name;
        this.membershipID = membershipID;
        this.borrowedBooks = borrowedBooks;
    }

    //get methods for name, membershipID, and borrowed books
    public String getName()
    {return name;}

    public String getMembershipID()
    {return membershipID;}

    public int getBorrowedBooks()
    {return borrowedBooks;}
    
}
