package com.bovespa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StockManager {
	private int i = 1;

	public Stock[] loadStock(String fileName) throws IOException {

		Stream<String> lines = Files.lines(Paths.get(fileName));
		Stock[] stocks = new Stock[20];

		lines.forEach(s -> {
			if (s.startsWith("01")) {
				
				Stock stock = new Stock();
				stock.setCode(s.substring(12, 24).trim());
				//stock.setDate(s.substring(2, 10).trim());
				stocks[i++] = stock;
				System.out.println(stock.getCode());
			}

		});

		return null;
	}
}
