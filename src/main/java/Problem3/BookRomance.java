package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // homework
        // tip: use the 'super' keyword
        super.title();
        super.author();
    }

    public BookRomance(BookRomance anotherBook) {
        super.anotherBook();

    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {

        numOfDaysPastDue x lateFeePerDayInDollar;
    }
}
