package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        this.rating();
        this.title();
        // homework



    }

    public Movie(Movie anotherMovie) {
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
        boolean movie = true;
    }
}
