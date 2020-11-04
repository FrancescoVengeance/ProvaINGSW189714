package it.unical.it.provaIngsw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyListUtil 
{	
	public MyListUtil() {}
	
	public List<Integer> ordineCrescente(ArrayList<Integer> numeri)
	{
		
		numeri.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) 
					return -1;
				if(o1 == o2)
					return 0;
				else
					return 1;
			}
		});
		
		return numeri;
	}
	
	public List<Integer> ordineDecrescente(ArrayList<Integer> numeri)
	{
		
		numeri.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) 
					return 1;
				if(o1 == o2)
					return 0;
				else
					return -1;
			}
		});
		
		return numeri;
	}
}
