import com.parent.Books;

/**
 * Created by student on 2016/03/06.
 */
public class Reviews {

    public void getReview(String bookName)
    {
        Books b = new Books();
        String book = b.getBook(bookName);
        System.out.println("Review for" + bookName);
    }

    public void getReviewRate(String bookName)
    {
        System.out.println("This book has an average of" + bookName);
    }

    public String getReviewerName(String name)
    {
        return name;
    }
}
