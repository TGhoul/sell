package com.tghoul.service;

import com.tghoul.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by TGhoul
 * 2017-08-07  10:56
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn (List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
