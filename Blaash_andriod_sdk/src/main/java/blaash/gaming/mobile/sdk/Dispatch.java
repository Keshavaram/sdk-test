package blaash.gaming.mobile.sdk;

public class Dispatch implements OnHttpPostComplete {
    protected Dispatch(){}
    protected void dispatch(BlaashEvents dataToSend)
    {
        InitiateHttpPost initiateHttpPost = new InitiateHttpPost(dataToSend, this);
        initiateHttpPost.initiatePostRequest();
    }

    @Override
    public void notify(String s) {}
}
