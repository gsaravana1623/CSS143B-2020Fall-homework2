package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        super.rating();
        super.title();
    }

    public MovieAction(MovieAction anotherMovie) {
        super.anotherMovie();
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        numOfDaysPastDue = 2 * numOfDaysPastDue * lateFeePerDayInDollar;
    }
}
