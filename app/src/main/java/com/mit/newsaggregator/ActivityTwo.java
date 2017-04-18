package com.mit.newsaggregator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityTwo extends AppCompatActivity {
    WebView webView;
    void initViews(){
        webView=(WebView)findViewById(R.id.webview);

        Intent data=getIntent();
        String url=data.getStringExtra("keyUrl");
        String newspaper=data.getStringExtra("keyNewspaper");

        setTitle(newspaper);

        webView.getSettings().setJavaScriptEnabled(true);

        WebViewClient client=new WebViewClient();
        webView.setWebViewClient(client);

        webView.loadUrl(url);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newspaper);
        initViews();
    }
}
