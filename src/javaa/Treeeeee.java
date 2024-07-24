package javaa;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treeeeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> mp=new TreeMap<Integer,String>();
		mp.put(1, "hello");
		mp.put(3, "java");
		mp.put(7, "high");
		mp.put(5, "Ann");
		mp.put(4, "Jasir");
		mp.put(9,"Rithu");
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

