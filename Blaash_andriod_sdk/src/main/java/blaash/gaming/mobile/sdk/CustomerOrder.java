package blaash.gaming.mobile.sdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Instant;
import java.util.List;

@RequiresApi(api = Build.VERSION_CODES.O)
public class CustomerOrder {
    public long orderId;
    public float orderGrandTotal;
    public float orderSubTotal;
    public float orderShippingAmount;
    public float orderDiscountAmount;
    public float orderTaxAmount;
    public String couponCodeUsed;
    public String storeName;
    public String storeCode;
    public String orderStatus;

    public  Address ShippingAddress;
    public  Address BillingAddress;

    public String orderCreatedAt;
    public List<Product> orderProductInformation;

    protected CustomerOrder(long orderId, float orderGrandTotal, float orderSubTotal, float orderShippingAmount,
                            float orderDiscountAmount, float orderTaxAmount, String couponCodeUsed, String storeName,
                            String storeCode, String orderStatus, Address shippingAddress, Address billingAddress,
                            List<Product> orderProductInformation) {
        this.orderId = orderId;
        this.orderGrandTotal = orderGrandTotal;
        this.orderSubTotal = orderSubTotal;
        this.orderShippingAmount = orderShippingAmount;
        this.orderDiscountAmount = orderDiscountAmount;
        this.orderTaxAmount = orderTaxAmount;
        this.couponCodeUsed = couponCodeUsed;
        this.storeName = storeName;
        this.storeCode = storeCode;
        this.orderStatus = orderStatus;
        this.ShippingAddress = shippingAddress;
        this.BillingAddress = billingAddress;
        this.orderProductInformation = orderProductInformation;
        this.orderCreatedAt = Instant.now().toString();
    }
}
