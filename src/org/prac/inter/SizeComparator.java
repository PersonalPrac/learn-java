package org.prac.inter;

import java.util.Comparator;

public class SizeComparator implements Comparator<HDTV>{

	@Override
	public int compare(HDTV tv1, HDTV tv2){
		
		if(tv1.getSize() > tv2.getSize())
		{
			return 1;
		}
		else if (tv1.getSize() == tv2.getSize())
		{
		return 0;
		}
		else
		{
			return -1;
		}
	}

	
}
