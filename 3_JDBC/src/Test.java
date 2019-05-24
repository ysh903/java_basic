import java.util.ArrayList;
import java.util.List;


/*문제1. JDBC 프로그램(DeptManager.java)을 완성하십시오. 

문제 개요 :select * from Dept 실행 결과 셋을 List에 담아서 리턴하는 
getDepts() 함수를 구현하세요. JdbcUtil을 사용합니다.

문제 설명 : 
1.DeptManager 클래스의 
Public List getDepts() 메소드를 구현합니다.

2. Test 클래스에 main 함수를 이용 테스트해 보세요. 
getDepts() 를 수행 후 리턴 값을 화면에 출력하세요.
*/

public class Test {
	public static void main(String[] args) {
		List<Dept> dept = new ArrayList<>();
		DeptManager dm = new DeptManager();
		dept=dm.getDepts(); 
		
		dept.forEach(i->System.out.println(i));
		
		
	}

	
}
