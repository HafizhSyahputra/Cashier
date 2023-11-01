package com.smk.cashier.service;
import com.smk.cashier.dao.StokDAO;
import com.smk.cashier.model.Barang;
import com.smk.cashier.model.Stock;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(
        MethodOrderer.OrderAnnotation.class
)

class StokServiceTest {

    /*@Test
    @Order(2)
    void getStokList() {
        List<Barang> stockList=StockService.getInstance().getStockList();
        assertEquals(stockList.size(),2);
    }

    @Test
    @Order(4)
    void saveStockToDatabase(){
        StokDAO stokDao = new StokDAO();
        Stock laptop = new Stock();
        laptop.setStockId("001");
        laptop.setNamaBarang("Laptop");
        laptop.setJumlahStok(50);
        laptop.setDateCreated(new Date());
        laptop.setLastModified(new Date());
        stokDao.save(laptop);

        Stock mouse = new Stock();
        mouse.setStockId("001");
        mouse.setNamaBarang("Mouse");
        mouse.setJumlahStok(10);
        mouse.setDateCreated(new Date());
        mouse.setLastModified(new Date());
        stokDao.save(mouse);

        Stock LaptopGaming = new Stock();
        LaptopGaming.setStockId("002");
        LaptopGaming.setNamaBarang("Laptop" + " Gaming");
        LaptopGaming.setJumlahStok(200);
        LaptopGaming.setDateCreated(new Date());
        LaptopGaming.setLastModified(new Date());
        stokDao.save(LaptopGaming);

    }

    @Test
    @Order(5)
    void getDataById(){
        StokDAO stokDao = new StokDAO();
        Optional<Stock> stok1 = stokDao.get(1);
        stok1.ifPresent(new Consumer<Stock>() {
            @Override
            public void accept(Stock stok) {
                assertEquals("Laptop", stok.getNamaBarang());
                assertEquals("LPOO1", stok.getStockId());

            }
        });

        Optional<Stock> stok2 = stokDao.get(2);
        stok2.ifPresent(new Consumer<Stock>() {
            @Override
            public void accept(Stock stok) {
                assertEquals("Mouse", stok.getNamaBarang());
                assertEquals("001", stok.getStockId());

            }
        });
    }

    @Test
    @Order(1)
    void addStok() {
        Stock laptop = new Stock();
        laptop.setStockId("001");
        laptop.setNamaBarang("Laptop");
        laptop.setJumlahStok(50);
        StockService.getInstance().addStock(laptop);

        Stock mouse = new Stock();
        mouse.setStockId("001");
        mouse.setNamaBarang("Mouse");
        mouse.setJumlahStok(10);
        StockService.getInstance().addStock(mouse);

        Stock laptopGaming = new Stock();
        laptopGaming.setStockId("002");
        laptopGaming.setNamaBarang("Laptop " + "Gaming");
        laptopGaming.setJumlahStok(200);
        StockService.getInstance().addStock(laptopGaming);


    }*/
}