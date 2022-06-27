package blaash.gaming.mobile.sdk;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import blaash.gaming.mobile.sdk.Token;
import blaash.gaming.mobile.sdk.TokenGeneration;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//*********************************************************************Token**************************************************************
        TokenGeneration events = new TokenGeneration(new Token("abcd","xyz","DC101","tenant1CustomerSocial@gmail.com","abcd@fb.com"));

        String token = events.getTokenToSend();
        Log.e(TAG, "onCreate: Token = " + token);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(v ->
        {
            Intent i = new Intent(this,WebViewActivity.class);
            i.putExtra("token",token);
            startActivity(i);
        });
// *********************************************************************Token**************************************************************
    }
}