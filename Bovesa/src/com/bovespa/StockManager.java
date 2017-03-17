package com.bovespa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StockManager {
	
	public Stock[] loadStock( String fileName) throws IOException{
		
		Stream<String> lines = Files.lines(Paths.get(fileName));
		
		lines.forEach(s -> {
			System.out.println(s);
		});
		
		return null;
	}
}
