package blaash.gaming.mobile.sdk;

public class OrderDetails {
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

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderGrandTotal() {
        return orderGrandTotal;
    }

    public void setOrderGrandTotal(String orderGrandTotal) {
        this.orderGrandTotal = orderGrandTotal;
    }

    public String getOrderSubTotal() {
        return orderSubTotal;
    }

    public void setOrderSubTotal(String orderSubTotal) {
        this.orderSubTotal = orderSubTotal;
    }

    public String getOrderShippingAmount() {
        return orderShippingAmount;
    }

    public void setOrderShippingAmount(String orderShippingAmount) {
        this.orderShippingAmount = orderShippingAmount;
    }

    public String getOrderDiscountAmount() {
        return orderDiscountAmount;
    }

    public void setOrderDiscountAmount(String orderDiscountAmount) {
        this.orderDiscountAmount = orderDiscountAmount;
    }

    public String getOrderTaxAmount() {
        return orderTaxAmount;
    }

    public void setOrderTaxAmount(String orderTaxAmount) {
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
