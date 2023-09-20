package MovieV1;

public class MovieTester {
    public static void main(String[] args) {
        Movie lionKing = new Movie(new Title("Lion King"),new Ranking(8));
        Movie happyFeet = new Movie(new Title("Happy Feet"),new Ranking(10));

        System.out.println(lionKing.compareTo(happyFeet));

    }
}
