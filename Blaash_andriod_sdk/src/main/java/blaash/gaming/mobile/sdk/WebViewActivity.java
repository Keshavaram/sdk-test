package blaash.gaming.mobile.sdk;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class WebViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.codechef.com");

        Button back = findViewById(R.id.button);
        back.setOnClickListener(v -> finish());
    }
}