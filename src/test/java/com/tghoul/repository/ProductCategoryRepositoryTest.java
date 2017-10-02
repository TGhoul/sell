package com.tghoul.repository;

import com.tghoul.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 64926 on 2017/7/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOne() {
        System.out.println(repository.findOne(1));
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory product = new ProductCategory("男生最爱", 4);

        ProductCategory result = repository.save(product);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest() {
        ProductCategory product = repository.findOne(2);
        product.setCategoryType(13);

//        product.setCategoryId(2);
//        product.setCategoryName("男生最爱");
//        product.setCategoryType(3);
        repository.save(product);
    }

    @Test
    public void findByCategoryTypeInTest () {
        List<Integer> list = Arrays.asList(2, 3, 4);

        List<ProductCategory> resultList = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, resultList.size());
    }
}