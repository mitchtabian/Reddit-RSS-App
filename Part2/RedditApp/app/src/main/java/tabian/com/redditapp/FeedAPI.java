package tabian.com.redditapp;

import retrofit2.Call;
import retrofit2.http.GET;
import tabian.com.redditapp.model.Feed;

/**
 * Created by User on 4/18/2017.
 */

public interface FeedAPI {

    String BASE_URL = "https://www.reddit.com/r/";

    @GET("earthporn/.rss")
    Call<Feed> getFeed();
}
