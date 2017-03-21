package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTest {
	@Test
	public void loadStockTest() throws IOException{
		StockManager stockManager = new StockManager();
		Stock[] stocks = stockManager.loadStock("Z:/3 ano/ESTD/Projetos/COTAHIST_A2016_TEST.txt");
		
		for (Stock stock : stocks) {
				if (stock.getCode().equalsIgnoreCase("PETR4")) {
					//System.out.println(stock.getOpenPrice());
				}
		}
	}

}
