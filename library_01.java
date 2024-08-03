
class library
{
    String[] books;
    int no_of_books;
    library()
    {

        this.books=new String[100];
        this.no_of_books=0;
    }
    void add_books(String books)
    {

        this.books[no_of_books]=books;
        no_of_books++;
        System.out.println(books+ ", has been added");
    }
    void show_available_books()
    {
        System.out.println("available books are:");
        for(String books: this.books)
        {
            if(books==null)
            {
                continue;
            }
            System.out.println(books);
        }
    }
    void issue_books(String books)
    {
        for(int i=0;i<this.books.length;i++)
        {
            if(this.books[i]==(books))
            {
                System.out.println("the book has been issued:");
                this.books[i]=null;
                return;
            }
            // System.out.println(books);
        }
        System.out.println("this book doesn't exist");
    }
    void return_books(String books)
    {
        add_books(books);
    }
}

public class library_01 {
    public static void main(String[] args) {
        library central_Library=new library();
        central_Library.add_books("think and grow rich");
        central_Library.show_available_books();
        central_Library.issue_books("khan");
    }
}
