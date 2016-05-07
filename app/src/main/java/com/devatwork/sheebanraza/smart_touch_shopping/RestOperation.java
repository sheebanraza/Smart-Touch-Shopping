package com.devatwork.sheebanraza.smart_touch_shopping;

import android.os.AsyncTask;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Created by Sheeban Raza on 03-May-16.
 */
public class RestOperation extends AsyncTask<String, Void,String> {

    HttpClient httpClient = new DefaultHttpClient();
    String content, error;
    @Override
    protected String doInBackground(String... urls) {

        return null;
    }
}
