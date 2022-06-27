package blaash.gaming.mobile.sdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Instant;

public class AddToCart {
    private float cartGrossTotal;
    private int quantityAdded;
    private Product productInformation;
    private String cartUpdatedOn;

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected AddToCart(float cartGrossTotal, int quantityAdded, Product productInformation) {
        this.cartGrossTotal = cartGrossTotal;
        this.quantityAdded = quantityAdded;
        this.productInformation = productInformation;
        this.cartUpdatedOn = Instant.now().toString();
    }
}
