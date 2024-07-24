package javaa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mappp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1, "hello");
		mp.put(3, "java");
		mp.put(2, "high");
		mp.put(4, "Ann");
		mp.put(5, "Jasir");
		mp.put(6,"Rithu");
		mp.put(8, "jin");
		System.out.println(mp);
		System.out.println("Random access:"+mp.get(1));
		Set li=mp.entrySet();
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
