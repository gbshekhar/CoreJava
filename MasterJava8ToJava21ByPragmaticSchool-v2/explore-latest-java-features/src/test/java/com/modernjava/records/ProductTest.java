package com.modernjava.records;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void createProduct(){
        //given
        Product product = new Product("IPhone", new BigDecimal("999.99"), "Electronics");

        //when
        System.out.println("product :" + product);
        assertEquals("IPhone", product.name());
        assertEquals("Electronics", product.type());

        //then
    }

    @Test
    void createProduct_nameNotValid(){
        //when
        var exception = assertThrows(IllegalArgumentException.class, () ->
                new Product("", new BigDecimal("999.99"), "Electronics"));

        //then
        assertEquals("Name is not valid", exception.getMessage());
    }

    @Test
    void createProduct_costNotValid(){
        //when
        var exception = assertThrows(IllegalArgumentException.class, () ->
                new Product("Iphone", new BigDecimal("-999.99"), "Electronics"));

        //then
        assertEquals("Cost is not valid", exception.getMessage());
    }

    @Test
    void createProduct_customConstructor(){
        //given
        Product product = new Product("IPhone", new BigDecimal("999.99"));

        //when
        System.out.println("product :" + product);
        assertEquals("IPhone", product.name());
        assertEquals("GENERAL", product.type());

        //then
    }

    @Test
    void createProductComparison(){

        Product product = new Product("IPhone", new BigDecimal("999.99"), "Electronics1");
        Product product1 = new Product("IPhone", new BigDecimal("999.99"), "Electronics");

        assertEquals(product, product1);

    }

}