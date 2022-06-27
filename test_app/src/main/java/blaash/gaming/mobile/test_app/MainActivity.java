package blaash.gaming.mobile.test_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import blaash.gaming.mobile.sdk.Address;
import blaash.gaming.mobile.sdk.AddressDetails;
import blaash.gaming.mobile.sdk.BlaashSDK;
import blaash.gaming.mobile.sdk.BuildConfig;
import blaash.gaming.mobile.sdk.Crypto;
import blaash.gaming.mobile.sdk.Customer;
import blaash.gaming.mobile.sdk.OrderDetails;
import blaash.gaming.mobile.sdk.Product;
import blaash.gaming.mobile.sdk.Token;
import blaash.gaming.mobile.sdk.TokenGeneration;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Token token = new Token("abc","abc","1234","abc@gmail.com","abc");
        TokenGeneration tokenGeneration = new TokenGeneration(token);


        BlaashSDK sdk = new BlaashSDK();
        sdk.initialize("11223344","keshavaram@gmail.com",null,
                "9988776655","Keshavaram", "J");
        Customer customer = new Customer();
        customer.setFirst_name("M3_Mohit3");
        customer.setLast_name("Roy");
        customer.setEmailId("mohit_test1@gmail.com");
        customer.setCustomerCreatedStoreName("Default Store View");
        customer.setCustomerReferralCode("eRFKO637917451499472108AfaSk");
        Product product = new Product();
        product.setPortalProductID(6755341828211L);
        product.setProductCategory("Clothing");
        product.setProductCategoryNames("Clothing");
        product.setProductPrice("0.00");
        product.setBaseImageURL("https://cdn.shopify.com/s/files/1/0561/4203/7107/products/woman-outside-brownstone_925x_4effe232-f1a7-4015-bbef-cc8108ec7447.jpg?v=1644415145");
        product.setProductURL("https://blaash-store.myshopify.com/products/longsleeve-cotton-top");
        product.setProductShortName("Long Sleeve Cotton Top");
        product.setProductDisplayName("Long Sleeve Cotton Top");

        OrderDetails orderDetails = new OrderDetails();
        AddressDetails addressDetails = new AddressDetails();
        List<Product> products = new ArrayList<>(); products.add(product);

        orderDetails.setOrderId(1234);

        sdk.notifyCustomerOrder(orderDetails,addressDetails,products);
//        sdk.notifyCustomerOrder();

    }
}