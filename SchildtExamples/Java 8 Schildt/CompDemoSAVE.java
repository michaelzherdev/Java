package javaLang;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CompDemoSAVE {

	public static void main(String[] args) {
		Comparator<String> comp = (a, b) -> {
			int i,j;
			i = a.lastIndexOf(' ');
			j = b.lastIndexOf(' ');
			return a.substring(i).compareTo(b.substring(j));
		};
		Comparator<String> c = comp.thenComparing((a, b) -> a.compareTo(b));
		
		TreeMap<String, Double> map = new TreeMap<String, Double>(c);
		map.put("John Dow", 3434.4);
		map.put("Tom Smith", 123.22);
		map.put("Jane Baker", 1378.00);
		map.put("Todd Hall", 99.22);
		map.put("Ralf Smith", -19.41);

		for(Map.Entry<String, Double> m : map.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}
	
}
