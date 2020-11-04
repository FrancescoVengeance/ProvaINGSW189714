package it.unical.it.provaIngsw;

import java.util.ArrayList;
import java.util.Comparator;

public class MyListUtil 
{
	
	public static ArrayList<Integer> ordineCrescente(ArrayList<Integer> numeri)
	{
		
		numeri.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) 
					return 1;
				return o2;
			}
		});
		
		
		
		return numeri;
	}
}
