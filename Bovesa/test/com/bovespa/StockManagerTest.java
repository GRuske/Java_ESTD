package com.bovespa;

import java.io.IOException;

import org.junit.Test;

public class StockManagerTest {
	@Test
	public void loadStockTest() throws IOException{
		StockManager stockManager = new StockManager();
		stockManager.loadStock("Z:/3 ano/ESTD/Projetos/COTAHIST_A2016_TEST.txt");
	}

}
