package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test01_Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("java01", "1234");
		map.put("java02", "0909");
		map.put("java03", "0070");
		map.put("user01", "1234");
		map.put("user02", "1234");
		// map.put("java01","0000"); -> 중복값 overwritting
		/*
		 * System.out.println(map);
		 * 
		 * Set<String> key = map.keySet(); Iterator<String> it = key.iterator(); while
		 * (it.hasNext()) { String keyname = (String) it.next();
		 * System.out.println(keyname+"/"+map.get(keyname));
		 * 
		 * }
		 * 
		 * 
		 * Scanner input = new Scanner (System.in); while(true) {
		 * System.out.println("ID 와 PW를 입력하세요"); System.out.println("ID : _"); String id
		 * = input.nextLine().trim();//trim->공백제거 System.out.println("Password : _");
		 * String pw = input.nextLine().trim();
		 * 
		 * if (!map.containsKey(id)) { System.out.println("입력하신 ID는 존재하지 않습니다..");
		 * continue; }else { if(!pw.equals(map.get(id))) { System.out.println("로그인 실패");
		 * }else { System.out.println("로그인 성공");
		 * 
		 * } }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		map.forEach((t, u) -> System.out.println(t+"="+u));
		
		
	}

}
