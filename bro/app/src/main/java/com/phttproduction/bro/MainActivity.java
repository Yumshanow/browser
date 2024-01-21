package com.phttproduction.bro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText searchtext;
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = (WebView) findViewById(R.id.WebView);
        WebSettings ws = web.getSettings();
        searchtext = findViewById(R.id.searchText);
        ws.setJavaScriptEnabled(true);
        web.loadUrl("https://www.google.com/");
        web.setWebViewClient(new WebViewClient());



    }


    public void Clicka(View view) {
        web.loadUrl("https://www.google.ru/search?q=" + searchtext.getText().toString() + "&newwindow=1&sca_esv");
    }
    @Override
    public void onBackPressed() {
        if (web.canGoBack())
            web.goBack();
        else
            super.onBackPressed();
    }

}