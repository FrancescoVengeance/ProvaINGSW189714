package it.unical.it.provaIngsw;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.JodaTimePermission;

public class MyListUtilTest 
{
	private static MyListUtil listUtil;
	
	public MyListUtilTest() {}
	
	@BeforeClass
	public static void init()
	{
		listUtil = new MyListUtil();
	}
	
	@Before
	public void printStartTime()
	{
		System.out.println("Inizio il test " + DateTime.now());
	}
	
	@After
	public void printFinishTime()
	{
		System.out.println("Finisco il test " + DateTime.now() + "\n");
	}
	
	@Test
	public void ordineCrescenteWorks()
	{
		ArrayList<Integer> numeri = new ArrayList<Integer>();
		numeri.addAll(Arrays.asList(8,7,6,5,4,3,2,1));
		assertEquals(Arrays.asList(1,2,3,4,5,6,7,8), listUtil.ordineCrescente(numeri));
	}
	
	@Test
	public void ordineDecrescenteWorks()
	{
		ArrayList<Integer> numeri = new ArrayList<Integer>();
		numeri.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
		assertEquals(Arrays.asList(8,7,6,5,4,3,2,1), listUtil.ordineDecrescente(numeri));
	}
	
}
