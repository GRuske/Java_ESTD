package com.bovespa;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class StockManager {
	
	private int i = 1;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	public Stock[] loadStock(String fileName) throws IOException {
		
	
		Stream<String> lines = Files.lines(Paths.get(fileName));
		Stock[] stocks = new Stock[(int) lines.count() - 2];

		lines.forEach(s -> {
			if (s.startsWith("01")) {
				
				Stock stock = new Stock();
				stock.setCode(s.substring(12, 24).trim());
				stock.setDate(LocalDate.parse(s.substring(2,10),dtf));
				stock.setOpenPrice(new BigDecimal(s.substring(56, 67) + "." + s.substring(67, 69)));
				stock.setClosePrice(new BigDecimal(s.substring(108, 119) + "." + s.substring(119, 121)));
				stock.setMaxPrice(new BigDecimal(s.substring(69, 80) + "." + s.substring(80, 82)));
				stock.setMinPrice(new BigDecimal(s.substring(82, 93) + "." + s.substring(93, 95)));
				stocks[i++] = stock;
			}

		});

		return null;
	}
}
