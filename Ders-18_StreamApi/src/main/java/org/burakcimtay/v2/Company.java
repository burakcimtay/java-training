package org.burakcimtay.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "ekmek", 5F));
        productList.add(new Product(2, "Süt", 23.5F));
        productList.add(new Product(3, "Yağ", 165.0F));

        List<Product> productList2 = productList.stream().filter(p -> p.getPrice() > 5 && p.getPrice() < 100).collect(Collectors.toList());

        System.out.println(productList2);
    }

}
