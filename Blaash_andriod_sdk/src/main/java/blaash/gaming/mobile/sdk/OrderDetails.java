package blaash.gaming.mobile.sdk;

public class OrderDetails {
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

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public float getOrderGrandTotal() {
        return orderGrandTotal;
    }

    public void setOrderGrandTotal(float orderGrandTotal) {
        this.orderGrandTotal = orderGrandTotal;
    }

    public float getOrderSubTotal() {
        return orderSubTotal;
    }

    public void setOrderSubTotal(float orderSubTotal) {
        this.orderSubTotal = orderSubTotal;
    }

    public float getOrderShippingAmount() {
        return orderShippingAmount;
    }

    public void setOrderShippingAmount(float orderShippingAmount) {
        this.orderShippingAmount = orderShippingAmount;
    }

    public float getOrderDiscountAmount() {
        return orderDiscountAmount;
    }

    public void setOrderDiscountAmount(float orderDiscountAmount) {
        this.orderDiscountAmount = orderDiscountAmount;
    }

    public float getOrderTaxAmount() {
        return orderTaxAmount;
    }

    public void setOrderTaxAmount(float orderTaxAmount) {
        this.orderTaxAmount = orderTaxAmount;
    }

    public String getCouponCodeUsed() {
        return couponCodeUsed;
    }

    public void setCouponCodeUsed(String couponCodeUsed) {
        this.couponCodeUsed = couponCodeUsed;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
