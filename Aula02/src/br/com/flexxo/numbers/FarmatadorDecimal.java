package br.com.flexxo.numbers;

import java.text.DecimalFormat;

// https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html
public class FarmatadorDecimal {

	static public void customFormat(String pattern, double value) {
		
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		
		System.out.println(value + "  " + pattern + "  " + output);
	}

	static public void main(String[] args) {

		customFormat("###,###.###", 123456.789);
		customFormat("###.##", 123456.789);
		customFormat("000000.000", 123.78);
		customFormat("$###,###.###", 12345.67);
	}

}
