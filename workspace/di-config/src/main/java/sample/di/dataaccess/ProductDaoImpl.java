package sample.di.dataaccess;

import sample.di.business.domain.Product;
import sample.di.business.service.ProductDao;

public class ProductDaoImpl implements ProductDao {
    // Daoだけど簡単にするためRDBにはアクセスしてません。
    public Product getProduct() {
        // Daoっぽく、製品名と価格をもったProductを検索したかのように返します。
        return new Product("ホチキス", 100);
    }
}
