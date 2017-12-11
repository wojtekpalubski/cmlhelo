package pl.wpe.cmlhelo.beans;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NumerowaneWierszeBean {
	public static String map(String string) {
		System.out.println("Zaczynam numerowanie wierszy bean");
		AtomicInteger i = new AtomicInteger(0);
		i.set(0);
		return Arrays.asList(string.split("\n")).stream().map(w -> i.getAndIncrement() + " " + w + " (bean)")
				.collect(Collectors.joining("\n"));
	}
}
