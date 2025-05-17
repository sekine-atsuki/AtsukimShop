package com.example.Shopee;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ProductRepository {

    private final Map<Long, Product> store = new ConcurrentHashMap<>();

    public ProductRepository() {
        // ダミーデータ 1 件だけ登録
        Product p = new Product();
        p.setId(1L);
        p.setName("京都宇治抹茶（50g）");
        p.setShortDescription("石臼挽き、香り豊かな宇治産100%");
        p.setPrice(1200);
        p.setImageUrl("/img/ujima.jpg");
        p.setShopeeUrl("https://shopee....");
        store.put(1L, p);
    }

    //商品名の一覧リストを作成して返す
    public List<Product> findAll() {
        return List.copyOf(store.values());
    }

    //idから商品を探してProductオブジェクトを返す
    public Product findById(Long id) {
        return store.get(id);
    }
}