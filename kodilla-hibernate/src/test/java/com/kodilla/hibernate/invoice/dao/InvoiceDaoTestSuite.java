package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertNotEquals(0, id);
        assertEquals("1",invoice1.getNumber());
        assertEquals(4,invoice1.getItems().get(0).getQuantity());
        assertEquals(5,invoice1.getItems().get(1).getQuantity());
        assertEquals(10,invoice1.getItems().get(2).getQuantity());
        assertEquals(new BigDecimal("40"),invoice1.getItems().get(0).getValue());
        assertEquals(new BigDecimal("100"),invoice1.getItems().get(1).getValue());
        assertEquals(new BigDecimal("300"),invoice1.getItems().get(2).getValue());
        assertEquals("Carrot",invoice1.getItems().get(0).getProducts().get(0).getName());
        assertEquals("Apple",invoice1.getItems().get(0).getProducts().get(1).getName());
        assertEquals("Apple2",invoice1.getItems().get(1).getProducts().get(0).getName());
        assertEquals("Orange",invoice1.getItems().get(1).getProducts().get(1).getName());
        assertEquals("Orange2",invoice1.getItems().get(2).getProducts().get(0).getName());


    }
}
