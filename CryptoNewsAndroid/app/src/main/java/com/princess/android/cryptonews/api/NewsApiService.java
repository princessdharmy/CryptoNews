package com.princess.android.cryptonews.api;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;


/**
 * Created by Princess on 2/22/2018.
 */

public interface NewsApiService {

    @GET("wp-json/wp/v2/posts")
    Observable<List<News>> getLatestNews();
}
