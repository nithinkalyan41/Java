package Dao;

import com.example.modules.Cart;
import com.example.modules.Product;

import java.sql.SQLException;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDao {
    private Connection con;
    private String q;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public ProductDao(Connection con) {
        this.con = con;
    }
    public List<Product> getAllProducts() throws SQLException {
        List<Product> products =new ArrayList<>();
        q = "select * from products";
        pstmt = this.con.prepareStatement(q);
        rs = pstmt.executeQuery();
        while(rs.next()){
            Product row = new Product();
            row.setId(rs.getInt("id"));
            row.setName(rs.getString("name"));
            row.setCategory(rs.getString("category"));
            row.setPrice(rs.getString("price"));
            row.setImage(rs.getString("image"));
            products.add(row);
        }
        return products;
    }
    public List<Cart> getCartProducts(ArrayList<Cart> cartList) throws SQLException {
        List<Cart> products = new ArrayList<>();
        if(cartList.size()>0){
            for(Cart item : cartList){
                q = "select * from products where id=?";
                pstmt = this.con.prepareStatement(q);
                pstmt.setInt(1,item.getId());
                rs = pstmt.executeQuery();
                 while(rs.next()){
                     Cart row  = new Cart();
                     row.setId(rs.getInt("id"));
                     row.setName(rs.getString("name"));
                     row.setCategory(rs.getString("category"));
                     row.setPrice(String.valueOf(rs.getDouble("price")*item.getQuantity()));
                     row.setQuantity(item.getQuantity());
                     products.add(row);
                 }
            }
        }
        return products;
    }
    public double getTotalCartPrice(ArrayList<Cart> cartlist) throws SQLException {
        double  sum = 0;
        if(cartlist.size() >0) {
            for(Cart item : cartlist) {
                q = "select * price from products where id = ?";
                pstmt = this.con.prepareStatement(q);
                pstmt.setInt(1,item.getId());
                rs = pstmt.executeQuery();
                while(rs.next()){
                    sum+=rs.getDouble("price")*item.getQuantity();
                }
            }

        }

        return sum;
    }
}
