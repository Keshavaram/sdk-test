package blaash.gaming.mobile.sdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Instant;

@RequiresApi(api = Build.VERSION_CODES.O)
public class ProductReviewRequest {
    public String reviewedAt = Instant.now().toString();
    public String reviewText;
    public Product productInformation;

    protected ProductReviewRequest(String reviewText, Product productInformation) {
        this.reviewText = reviewText;
        this.productInformation = productInformation;
    }
}