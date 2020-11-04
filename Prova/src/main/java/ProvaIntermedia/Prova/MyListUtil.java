package ProvaIntermedia.Prova;

import java.util.LinkedList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class MyListUtil {
	public static List<Integer> Ordina(int[] l, int dim, int x) {
		int tmp;
		List<Integer> numeri = new LinkedList<>();
		if (x == 1) {
			for (int i = 0; i < dim - 1; i++) {
				for (int j = i + 1; j < dim; j++) {
					tmp = 0;
					if (l[i] > l[j]) {
						tmp = l[i];
						l[i] = l[j];
						l[j] = tmp;
					}
				}
			}
		} else if (x == 0) {
			for (int i = 0; i < dim - 1; i++) {
				for (int j = i + 1; j < dim; j++) {
					tmp = 0;
					if (l[i] < l[j]) {
						tmp = l[i];
						l[i] = l[j];
						l[j] = tmp;
					}
				}
			}

		}
		for (int i = 0; i < dim; i++) {
			numeri.add(l[i]);
		}
		return numeri;

	}
	public static void Time() {
		 DateTimeZone tz = DateTimeZone.getDefault();
		    DateTime nowUTC = new DateTime(DateTimeZone.UTC);
		    DateTime nowLocal = nowUTC.withZone(tz);

	

		   
		    String l = nowLocal.toString();
		  
		   System.out.println(l);
		   
		    
	}
	
}
