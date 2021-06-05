package com.example.listtype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class WebActivity extends AppCompatActivity implements View.OnClickListener {
EditText etsearch;
Button btngo;
WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        etsearch=(EditText)findViewById(R.id.etsearch);
        btngo=(Button)findViewById(R.id.btngo);
        wv1=(WebView)findViewById(R.id.wv1);
        btngo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btngo:String url = etsearch.getText().toString();

            wv1.getSettings().setJavaScriptEnabled(true);

            wv1.loadUrl(url);
            break;
        }
    }
    private static class MywebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}