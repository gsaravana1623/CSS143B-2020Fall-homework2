package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework

        StoreMediaOperations[] s = new StoreMediaOperations[4];
        s[0] = new BookFiction("t1", "au1", "g1");
        s[1] = new BookRomance("t2", "au2");
        s[2] = new MovieAction("r1", "t1");
        s[3] = new MovieComedy("r2", "t2");
        for (StoreMediaOperations storeMediaOperations : s) {
            int fees = storeMediaOperations.calcLateFees(int dayMissed);
        }


    }

    @Override
    public boolean equals(Object obj) {
        // homework
        boolean book = true;

    }
}
