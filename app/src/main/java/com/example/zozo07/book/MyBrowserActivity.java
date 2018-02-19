package com.example.zozo07.book;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Zozo07 on 2016.04.19..
 */
public class MyBrowserActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser);

        Uri url = getIntent().getData();
        WebView webView = (WebView) findViewById(R.id.webWiew01);
        //emiatt tudja a program magától hogy mivel nyissa meg a weboldalt.
        webView.setWebViewClient(new Callback());
        webView.loadUrl(url.toString());
    }

    private class Callback extends WebViewClient {
        @Override
        //emaitt betöltődik az oldal.
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }

}
