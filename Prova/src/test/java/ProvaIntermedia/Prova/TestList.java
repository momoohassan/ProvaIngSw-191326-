package ProvaIntermedia.Prova;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;



public class TestList {

private static MyListUtil Mylist;
	
	@Before
	public  void prepare() {
		Mylist = new MyListUtil();
	}
	@Test
	public  void prova() {
		int l[]= {50,26,88,121,10,152,55,63};
		Mylist.Time();
		 assertEquals(Arrays.asList(10,26,50,55,63,88,121,152), Mylist.Ordina(l,8,1));
		 Mylist.Time();
		 Mylist.Time();
		 assertEquals(Arrays.asList(152,121,88,63,55,50,26,10), Mylist.Ordina(l,8,0));
		 Mylist.Time();
	}
}
