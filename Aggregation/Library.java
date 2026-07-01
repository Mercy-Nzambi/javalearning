public class Library {
    String libraryName;
    int yearOpened;
    Book [] books;

    Library(String libraryName, int yearOpened, Book [] books){
        this.libraryName = libraryName;
        this.yearOpened = yearOpened;
        this.books = books;
    }

    void showDisplay(){
        System.out.println("LIBRARY DETAILS");
        System.out.println("Library name: " + libraryName);
        System.out.println("Opening year: " + yearOpened);
        System.out.println("Some of the books in the library include: ");

        for(Book book : books){
            System.out.println(book.showDisplay());
        }

    }
}
