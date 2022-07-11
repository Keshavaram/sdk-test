package blaash.gaming.mobile.sdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Instant;
import java.util.List;

@RequiresApi(api = Build.VERSION_CODES.O)
public class CustomerOrder {
    public long orderId;
    public String orderGrandTotal;
    public String orderSubTotal;
    public String orderShippingAmount;
    public String orderDiscountAmount;
    public String orderTaxAmount;
    public String couponCodeUsed;
    public String storeName;
    public String storeCode;
    public String orderStatus;

    public  Address shippingAddress;
    public  Address billingAddress;

    public String orderCreatedAt;
    public List<Product> orderProductInformation;

    protected CustomerOrder(long orderId, String orderGrandTotal, String orderSubTotal, String orderShippingAmount,
                            String orderDiscountAmount, String orderTaxAmount, String couponCodeUsed, String storeName,
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
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.orderProductInformation = orderProductInformation;
        this.orderCreatedAt = Instant.now().toString();
    }
}
