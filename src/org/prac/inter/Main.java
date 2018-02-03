package org.prac.inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony");
		HDTV tv3 = new HDTV(42, "Panasonic");
		
		List<HDTV> tvList = new ArrayList<>();
		
		tvList.add(tv1);
		tvList.add(tv2);
		tvList.add(tv3);
		
		Collections.sort(tvList, new SizeComparator());
		
		for (HDTV tv : tvList) {
			System.out.println("Correct Order");
			System.out.println(tv);
			
		}

		Collections.sort(tvList, Collections.reverseOrder(new SizeComparator()));
		for (HDTV tv : tvList) {
			System.out.println("Reverse Order");
			System.out.println(tv);
			
		}
		
	}
	

}
