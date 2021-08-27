package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave()
    {
        //Given
        Product product1 = new Product("Carrot");
        Product product2 = new Product("Apple");
        Product product3 = new Product("Orange");
        Product product4 = new Product("Apple2");
        Product product5 = new Product("Orange2");
        Item item1 = new Item(new BigDecimal("10"),4);
        Item item2 = new Item(new BigDecimal("20"),5);
        Item item3 = new Item(new BigDecimal("30"),10);
        item1.getProducts().add(product1);
        item1.getProducts().add(product2);
        item2.getProducts().add(product4);
        item2.getProducts().add(product3);
        item3.getProducts().add(product5);
        product1.setItem(item1);
        product2.setItem(item1);
        product3.setItem(item2);
        product4.setItem(item2);
        product5.setItem(item3);
        Invoice invoice1 = new Invoice("1");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item2);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertNotEquals(0, id);

    }
}
