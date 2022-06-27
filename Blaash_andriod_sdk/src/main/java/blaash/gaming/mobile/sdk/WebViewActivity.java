package blaash.gaming.mobile.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Button;

public class WebViewActivity extends Activity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Bundle bundle = getIntent().getExtras();
        String token = bundle.getString("token");
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        String url = BuildConfig.UI_URL + "/?token=" + token + "&pid=78342";
        webView.loadUrl(url);
        Log.e("WebViewActivity", "onCreate: launching url = " + url);

        findViewById(R.id.button).setOnClickListener(v -> finish());
    }
}