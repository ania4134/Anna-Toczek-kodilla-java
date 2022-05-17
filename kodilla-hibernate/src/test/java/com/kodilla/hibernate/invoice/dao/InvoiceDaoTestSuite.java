package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product milk = new Product("milk");
        Product water = new Product("water");
        Item oatMilk = new Item(new BigDecimal(7.80), 3, new BigDecimal(1000));
        Item wholeMilk = new Item(new BigDecimal(7.99), 2, new BigDecimal(1000));
        Item mineralWater = new Item(new BigDecimal(3.65), 1, new BigDecimal(1500));
        Item stillWater = new Item(new BigDecimal(2.99), 6, new BigDecimal(800));
        Invoice invoice1 = new Invoice("56328");
        Invoice invoice2 = new Invoice("48699");
        oatMilk.setProduct(milk);
        wholeMilk.setProduct(milk);
        mineralWater.setProduct(water);
        stillWater.setProduct(water);
        oatMilk.setInvoice(invoice1);
        oatMilk.setInvoice(invoice2);
        wholeMilk.setInvoice(invoice1);
        mineralWater.setInvoice(invoice1);
        stillWater.setInvoice(invoice2);
        milk.getItems().add(oatMilk);
        milk.getItems().add(wholeMilk);
        water.getItems().add(mineralWater);
        water.getItems().add(stillWater);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        int id1 = invoice1.getId();
        int id2 = invoice2.getId();

        //Then
        Assertions.assertNotEquals(0, id1);
        Assertions.assertNotEquals(0, id2);

        //CleanUp
        invoiceDao.deleteById(id1);
        invoiceDao.deleteById(id2);
    }
}
