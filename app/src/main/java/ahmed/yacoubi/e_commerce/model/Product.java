package ahmed.yacoubi.e_commerce.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Product implements Serializable  {
    private String id;
    private String name;
    private String desc;
    private int amount;
    private double price;
    private String category;
    private Bitmap bitmap;
    private boolean isFavorite = false;
    private float rateAverage;
    private int numOfRate;
    private int count = 1;
    private String adminToken;

    public Product() {

    }

    public Product(String id, String name, String desc, int amount, double price, String category, boolean isFavorite, float rateAverage, int numOfRate) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.amount = amount;
        this.price = price;
        this.category = category;
        this.isFavorite = isFavorite;
        this.rateAverage = rateAverage;
        this.numOfRate = numOfRate;
    }

    public void setAdminToken(String adminToken) {
        this.adminToken = adminToken;
    }

    public Product(String id, String name, String desc, int amount, double price, String category, Bitmap bitmap, boolean isFavorite, float rateAverage, int numOfRate, int count, String adminToken) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.amount = amount;
        this.price = price;
        this.category = category;
        this.bitmap = bitmap;
        this.isFavorite = isFavorite;
        this.rateAverage = rateAverage;
        this.numOfRate = numOfRate;
        this.count = count;
        this.adminToken = adminToken;
    }

    public Product(String id, String name, String desc, int amount, double price, String category, boolean isFavorite, float rateAverage, int numOfRate, int count) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.amount = amount;
        this.price = price;
        this.category = category;
        this.isFavorite = isFavorite;
        this.rateAverage = rateAverage;
        this.numOfRate = numOfRate;
        this.count = count;
    }

    public String getAdminToken() {
        return adminToken;
    }



    public Product(String id, String name, String desc, int amount, double price, String category, Bitmap bitmap, boolean isFavorite, float rateAverage, int numOfRate, int count) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.amount = amount;
        this.price = price;
        this.category = category;
        this.bitmap = bitmap;
        this.isFavorite = isFavorite;
        this.rateAverage = rateAverage;
        this.numOfRate = numOfRate;
        this.count = count;
    }

    protected Product(Parcel in) {
        id = in.readString();
        name = in.readString();
        desc = in.readString();
        amount = in.readInt();
        price = in.readDouble();
        category = in.readString();
        bitmap = in.readParcelable(Bitmap.class.getClassLoader());
        isFavorite = in.readByte() != 0;
        rateAverage = in.readFloat();
        numOfRate = in.readInt();
        count = in.readInt();
    }



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getRateAverage() {
        return rateAverage;
    }

    public void setRateAverage(float rateAverage) {
        this.rateAverage = rateAverage;
    }

    public int getNumOfRate() {
        return numOfRate;
    }

    public void setNumOfRate(int numOfRate) {
        this.numOfRate = numOfRate;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
