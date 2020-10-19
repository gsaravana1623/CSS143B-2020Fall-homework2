package Problem3;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        super.rating();
        super.title();

    }

    public MovieComedy(MovieComedy anotherMovie) {
        super.anotherMovie();
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        numOfDaysPastDue = numOfDaysPastDue * lateFeePerDayInDollar;
    }
}
