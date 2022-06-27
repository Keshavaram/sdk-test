package blaash.gaming.mobile.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class BlaashSDK {

    private String portal_CustomerId;
    private String emailId;
    private String primaryPhoneNumber;
    private  String facebookId;
    private String first_name;
    private String last_name;
    private String store_domain;

  public void initialize(String portal_CustomerId, String emailId, String facebookId, String primaryPhoneNumber,
                           String loggedIn_Customer_first_name, String loggedIn_Customer_last_name,String store_domain) {

        this.portal_CustomerId= portal_CustomerId;
        this.emailId = emailId;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.first_name = loggedIn_Customer_first_name;
        this.last_name = loggedIn_Customer_last_name;
        this.facebookId = facebookId;
        this.store_domain = store_domain;
    }

    private BlaashEvents InitialiseBlaashEvents()
    {
        BlaashEvents blaashEvents;
        blaashEvents = new BlaashEvents(portal_CustomerId,emailId,facebookId,primaryPhoneNumber,first_name,last_name);
        blaashEvents.setEventInfo(new ArrayList<>());
        return blaashEvents;
    }

    private void prepareEventAndSend(Event_information eventData)
    {
        try
        {
            BlaashEvents customerEventToSend = InitialiseBlaashEvents();
            List<Event_information> customer_events = new ArrayList<>();
            customer_events.add(eventData);
            customerEventToSend.setEventInfo(customer_events);

            Dispatch messageDispatcher = new Dispatch();
            messageDispatcher.dispatch(customerEventToSend);
        }
        catch (Exception ignored) {}
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void launch(Context currentContext) {
      try
      {
          App_customer app_customer = new App_customer(portal_CustomerId,emailId,facebookId);
          TokenGeneration tokenGeneration = new TokenGeneration(app_customer);
          String genToken = tokenGeneration.getTokenToSend();
          Intent i = new Intent(currentContext,WebViewActivity.class);
          i.putExtra("token",genToken);
          currentContext.startActivity(i);
      } catch (Exception e)
      {
          Toast.makeText(currentContext, "Something went wrong, please try later.", Toast.LENGTH_SHORT).show();
      }

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void notifyCartChanges(boolean isCartAdded,Product productAddedToCart,float cartGrossTotal,int quantityAdded)
    {
        try
        {
            Event_information cartInformation = EventProcessor.eventDataFormatter(isCartAdded ? Constants.ADD_TO_CART : Constants.REMOVE_FROM_CART,productAddedToCart,cartGrossTotal,quantityAdded);
            prepareEventAndSend(cartInformation);
        } catch (Exception ignored) {}
    }

    public void notifySignUp(Customer customer)
    {
        try
        {
            Event_information customer_eventData = EventProcessor.eventDataFormatter(customer);
            prepareEventAndSend(customer_eventData);
        }
        catch (Exception ignored) {}
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void notifyReview(String reviewText, Product productBeingReviewed)
    {
        try
        {
            Event_information customer_eventData = EventProcessor.eventDataFormatter(reviewText,productBeingReviewed);
            prepareEventAndSend(customer_eventData);
        }
        catch (Exception ignored) {}
    }

    public void notifyWishListChanges(Product product)
    {
        try
        {
            Event_information customer_eventData = EventProcessor.eventDataFormatter(product);
            prepareEventAndSend(customer_eventData);
        }
        catch (Exception ignored) {}
    }

    public void notifySearch(String searchText)
    {
        try
        {
            Event_information customer_eventData = EventProcessor.eventDataFormatter(searchText);
            prepareEventAndSend(customer_eventData);
        }
        catch (Exception ignored) {}
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void notifyProductView(Product product)
    {
        try
        {
            Event_information customer_eventData = EventProcessor.eventDataFormatterForProductView(product);
            prepareEventAndSend(customer_eventData);
        }
        catch (Exception ignored) {}
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void notifyCustomerOrder(OrderDetails orderDetails, AddressDetails addressDetails, List<Product> orderProductInformation)
    {
        try
        {
            Event_information customer_eventData = EventProcessor.eventDataFormatter(orderDetails,addressDetails,orderProductInformation);
            prepareEventAndSend(customer_eventData);
        }
        catch (Exception ignored) {}
    }
}
