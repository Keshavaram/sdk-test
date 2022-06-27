package blaash.gaming.mobile.sdk;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.List;

public class EventProcessor {
    private static JsonObject returnJsonObject(Object obj)
    {
        GsonBuilder builder = new GsonBuilder();
        builder.serializeNulls();
        Gson gson = builder.setPrettyPrinting().create();
        String jsonString = gson.toJson(obj);

        return (JsonObject) JsonParser.parseString(jsonString);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected static Event_information eventDataFormatter(String event_name, Product productAddedToCart,float cartGrossTotal,int quantityAdded)
    {
        AddToCart addToCart = new AddToCart(cartGrossTotal,quantityAdded,productAddedToCart);
        return new Event_information(event_name,returnJsonObject(addToCart));
    }

    protected static Event_information eventDataFormatter(Customer customer)
    {
        return new Event_information(Constants.SIGN_UP,returnJsonObject(customer));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected static Event_information eventDataFormatter(String reviewText, Product productBeingReviewed)
    {
        ProductReviewRequest reviewRequest = new ProductReviewRequest(reviewText,productBeingReviewed);
        return new Event_information(Constants.REVIEW,returnJsonObject(reviewRequest));
    }

    protected static Event_information eventDataFormatter(Product product)
    {
        return new Event_information(Constants.WISH_LIST,returnJsonObject(product));
    }

    protected static Event_information eventDataFormatter(String searchText)
    {
        ProductSearchRequest searchRequest = new ProductSearchRequest(searchText);
        return new Event_information(Constants.SEARCH,returnJsonObject(searchRequest));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected static Event_information eventDataFormatterForProductView(Product product)
    {
        ProductViewRequest productViewRequest = new ProductViewRequest(product);
        return new Event_information(Constants.PRODUCT_VIEW,returnJsonObject(productViewRequest));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    protected static Event_information eventDataFormatter(OrderDetails orderDetails, AddressDetails addressDetails, List<Product> orderProductInformation)
    {
        CustomerOrder customerOrder = new CustomerOrder(orderDetails.orderId, orderDetails.orderGrandTotal, orderDetails.orderSubTotal, orderDetails.orderShippingAmount,
                orderDetails.orderDiscountAmount, orderDetails.orderTaxAmount, orderDetails.getCouponCodeUsed(), orderDetails.getStoreName(), orderDetails.getStoreCode(),
                orderDetails.getOrderStatus(), addressDetails.getShippingAddress(), addressDetails.getBillingAddress(), orderProductInformation);
        return new Event_information(Constants.CREATE_ORDER,returnJsonObject(customerOrder));
    }
}
