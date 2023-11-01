package com.smk.cashier.service;

import com.smk.cashier.model.Barang;
import com.smk.cashier.model.Stock;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class StockService {
    FileReader stockServiceReader;
    FileWriter stockServiceWriter;

    List<Stock> stockList =
            new LinkedList<>();
    private static StockService
            stockService = null;

    private StockService() {
        try {
            stockServiceReader = new FileReader("stock.txt");
            stockServiceWriter = new FileWriter("stock.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static synchronized
    StockService getInstance() {
        if (stockService == null) {
            stockService = new StockService();
        }
        return stockService;
    }

    /*private void readFile(){
        BufferedReader bufferedReader = new BufferedReader(stockServiceReader);
        List<String> stringList = bufferedReader.lines().toList();
        stockList = new LinkedList<>();
        for (String string: stringList) {
            stockList.add(parsingLineToBarang(string));
        }
    }

    private void writeFile(){
        try {
            stockServiceWriter = new FileWriter("stock.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(stockServiceWriter);
        for (int i = 0; i < stockList.size(); i++) {
            Barang barang = stockList.get(i);
            StringBuilder sb = new  StringBuilder();
            sb.append(barang.getKodeBarang());
            sb.append("|");
            sb.append(barang.getNamaBarang());
            sb.append("|");
            sb.append(barang.getHargaBarang());
            try {
                bufferedWriter.write(sb.toString());
                if (i < stockList.size() - 1) {
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Stock parsingLineToBarang(String string) {
        StringTokenizer st = new StringTokenizer(string, "|");
        int id = 0;
        Stock stock = new Stock();
        while (st.hasMoreElements()) {
            if (id == 0) {
                stock.setStockId(st.nextToken());
            } else if (id == 1) {
                stock.setStockBarang(Integer.parseInt(st.nextToken()));
            }
            id++;
        }
        return stock;
    }

    public List<Barang> getStockList(){
        readFile();
        return  stockList;
    }

    public void addStock(Stock barang){
        stockList.add(barang);
        writeFile();
    }

    public List<Barang> findByKodeBarang(String kodeBarang){
        List<Barang> resultList = stockList.stream()
                .filter(barang -> barang.getKodeBarang().equalsIgnoreCase(kodeBarang))
                .toList();
        return resultList;
    }*/
}
