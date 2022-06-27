package blaash.gaming.mobile.sdk;

import android.util.Log;

public class Dispatch implements OnHttpPostComplete {
    private static final String TAG = "Dispatch";
    protected Dispatch(){}
    protected void dispatch(BlaashEvents dataToSend)
    {
        InitiateHttpPost initiateHttpPost = new InitiateHttpPost(dataToSend, this);
        initiateHttpPost.initiatePostRequest();
    }

    @Override
    public void notify(String s) {
        Log.d(TAG, "notify: " + s);
    }
}
