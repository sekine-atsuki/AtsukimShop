package com.example.Shopee;

public class Product {
    private Long id;
    private String name;
    private String description;
    private String shortDescription;
    private String imageFileName;
    private int price;        // 東南アジア向けに通貨は後で拡張
    private String shopeeUrl; // Shopee 商品ページへのリンク


    //以下、getter/setterを全てのフィールドに対して定義
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getShopeeUrl() {
        return shopeeUrl;
    }

    public void setShopeeUrl(String shopeeUrl) {
        this.shopeeUrl = shopeeUrl;
    }
}