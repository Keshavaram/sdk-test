package blaash.gaming.mobile.sdk;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.google.gson.Gson;

import java.security.GeneralSecurityException;
import java.util.Random;


public class TokenGeneration {
    private static final String TAG = "Events";
    private final String CLIENT_ID = BuildConfig.CLIENT_ID;
    private final String CLIENT_SECRET = BuildConfig.CLIENT_SECRET;
    private final String SALT = "abcd";
    private final Token token;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public TokenGeneration(Token token) {
        this.token = token;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getTokenToSend() {
        Gson gson = new Gson();
        String plainToken = gson.toJson(token);
        Log.e(TAG, "getTokenToSend: Generated json = " + plainToken);

        String[] characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        Random random = new Random();
        int charLen = characters.length;
        StringBuilder alphaNumeric = new StringBuilder();
        for (int i = 0; i < 180; i++) {
            alphaNumeric.append(characters[random.nextInt(charLen)]);
        }
        Crypto crypto = new Crypto(BuildConfig.CLIENT_SECRET);
        String a = crypto.encryptAsBase64(plainToken.getBytes());
        Log.e(TAG, "getTokenToSend: Cipher = " + a);
        return alphaNumeric + CLIENT_ID + a;
    }
}
