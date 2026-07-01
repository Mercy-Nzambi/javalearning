public class Main {
    public static void main(String [] args){

        Book book1 = new Book("Catcher in the Rye", 300);
        Book book2 = new Book("Kigogo", 123);
        Book book3 = new Book("A Doll's House", 214);

        Book [] books = {book1, book2, book3};

//        for(Book book : books){
//            System.out.println(book.showDisplay());
//        }

        Library library = new Library("McMillan Library", 1931, books);
        library.showDisplay();


    }
}
