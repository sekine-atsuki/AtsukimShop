package com.example.Shopee;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ProductRepository {

    private final Map<Long, Product> store = new ConcurrentHashMap<>();

    public ProductRepository() {
        // 宇治抹茶
        Product matcha = new Product();
        matcha.setId(1L);
        matcha.setName("Kyoto Uji Matcha (50g)");
        matcha.setShortDescription("Stone-ground, aromatic, 100% Uji-grown");
        matcha.setPrice(1200);
        matcha.setImageFileName("matcha.jpg");
        matcha.setShopeeUrl("https://shopee....");
        store.put(1L, matcha);

        // 日本茶
        Product tea = new Product();
        tea.setId(2L);
        tea.setName("Japan Tea (100g)");
        tea.setShortDescription("Premium Japanese tea leaves, fresh and aromatic");
        tea.setPrice(900);
        tea.setImageFileName("tea.png");
        tea.setShopeeUrl("https://shopee....");
        store.put(2L, tea);

        // 納豆
        Product natto = new Product();
        natto.setId(3L);
        natto.setName("Premium Natto Fermented Soybeans");
        natto.setShortDescription("Rich in probiotics, made from Japanese soybeans");
        natto.setPrice(850);
        natto.setImageFileName("natto.jpg");
        natto.setShopeeUrl("https://shopee.com/product2");
        store.put(3L, natto);

        // 梅干し
        Product umeboshi = new Product();
        umeboshi.setId(4L);
        umeboshi.setName("Traditional Umeboshi Plums");
        umeboshi.setShortDescription("Salt-pickled plums, natural digestive aid");
        umeboshi.setPrice(950);
        umeboshi.setImageFileName("ume.jpg");
        umeboshi.setShopeeUrl("https://shopee.com/product3");
        store.put(4L, umeboshi);
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