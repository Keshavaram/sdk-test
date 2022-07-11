package blaash.gaming.mobile.sdk;

public class Product {
    public String productSKU;
    public String productDisplayName;
    public String productShortName;
    public String productURL;
    public String baseImageURL;
    public String productPrice;
    public String productCategoryNames;
    public String productCategory;
    public long portalProductID;

    public Product() {}

    protected Product(String productSKU, String productDisplayName, String productShortName,
                      String productURL, String baseImageURL, String productPrice,
                      String productCategoryNames, String productCategory, long portalProductID) {
        this.productSKU = productSKU;
        this.productDisplayName = productDisplayName;
        this.productShortName = productShortName;
        this.productURL = productURL;
        this.baseImageURL = baseImageURL;
        this.productPrice = productPrice;
        this.productCategoryNames = productCategoryNames;
        this.productCategory = productCategory;
        this.portalProductID = portalProductID;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public String getProductDisplayName() {
        return productDisplayName;
    }

    public void setProductDisplayName(String productDisplayName) {
        this.productDisplayName = productDisplayName;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public String getProductURL() {
        return productURL;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }

    public String getBaseImageURL() {
        return baseImageURL;
    }

    public void setBaseImageURL(String baseImageURL) {
        this.baseImageURL = baseImageURL;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategoryNames() {
        return productCategoryNames;
    }

    public void setProductCategoryNames(String productCategoryNames) {
        this.productCategoryNames = productCategoryNames;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPortalProductID() {
        return portalProductID;
    }

    public void setPortalProductID(long portalProductID) {
        this.portalProductID = portalProductID;
    }
}
