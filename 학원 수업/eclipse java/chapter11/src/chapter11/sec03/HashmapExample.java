package chapter11.sec03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		//자료저장
		map.put(1000, "홍길동");
		map.put(1001, "이순신");
		map.put(1002, "강감찬");
		
		String name = map.get("1001");
		System.out.println(name);
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			Integer keys = iter.next();
			System.out.println(keys + "=>" + map.get(keys));
		}
	
	}

}
