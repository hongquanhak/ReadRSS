package com.dut.hongquan.readrss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NewsActivity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        webview = (WebView) findViewById(R.id.webviewTinTuc);

        Intent intent = getIntent();
        String link = ((Intent) intent).getStringExtra("linkTinTuc");

        webview.loadUrl(link);

        webview.setWebViewClient(new WebViewClient());
    }
}
