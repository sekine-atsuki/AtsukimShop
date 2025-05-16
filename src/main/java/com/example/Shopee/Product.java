package com.example.Shopee;

public class Product {
    private Long id;
    private String name;
    private String description;
    private int price;        // 東南アジア向けに通貨は後で拡張
    private String imageUrl;  // static フォルダに置く予定
    private String shopeeUrl; // Shopee 商品ページへのリンク


    //以下、getter/setterを全てのフィールドに対して定義
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getShopeeUrl() {
        return shopeeUrl;
    }

    public void setShopeeUrl(String shopeeUrl) {
        this.shopeeUrl = shopeeUrl;
    }
}