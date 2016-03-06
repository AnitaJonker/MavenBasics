/**
 * Created by student on 2016/03/06.
 */
public class Readers {
    public String getReaderRating(String book)
    {
        Reviews r = new Reviews();
        r.getReviewRate(book);
        return book;
    }
}
