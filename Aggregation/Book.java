public class Book {
    String bookName;
    int numberOfPages;

    Book(String bookName, int numberOfPages){
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
    }

    String showDisplay(){
        return bookName + " (" + numberOfPages + " pages)";
    }
}
