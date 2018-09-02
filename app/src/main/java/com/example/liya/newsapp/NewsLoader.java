package com.example.liya.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private static final String LOG_TAG = NewsLoader.class.getName();

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {


        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<News> news = null;
        try {
            URL url = QueryUtils.createUrl();
            String jsonResponse = QueryUtils.makeHttpRequest(url);
            news = QueryUtils.parseJson(jsonResponse);
        } catch (IOException e) {
            Log.e("Queryutils", "Error Loader LoadInBackground: ", e);
        }
        return news;
    }
}
