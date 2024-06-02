import java.util.ArrayList;
import java.util.List;

public class BookManager implements BookOperations {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
        initializeBooks();
    }

    private void initializeBooks() {
        books.add(new Book("Korowód", "Małecki Jakub", "1111", 2024));
        books.add(new Book("Niebo", "Krasowska Maria", "2222", 2024));
        books.add(new Book("Fala", "Krasowska Maria", "3333", 2023));
        books.add(new Book("Venom", "Aleksandra Kondraciuk", "4444", 2023));
        books.add(new Book("Efekt morza", "Bonda Katarzyna", "5555", 2024));
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public void updateBook(Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(updatedBook.getIsbn())) {
                books.set(i, updatedBook);
                return;
            }
        }
    }

    @Override
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
