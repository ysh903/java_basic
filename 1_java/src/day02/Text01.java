package day02;

import java.util.Date;

public class Text01 {
	
	public static void main(String[] args) {
		
		char i = 'A';
		i='a';
		System.out.println(i);
		
		Date d= new Date(); 
		//d의 기억공간 생성 in heap 영역(gc가 관리), ref type
		System.out.println(d.toLocaleString());//deprecate 비추천
		
		Date d2 = d; //d의 주소 복사
		
		
		d=null; //heap 공간의 ref type 메모리가 gc에 의해 삭제 가능해짐.
		
		String ss = new Date().toString(); 
		//temporary data, 메모리 로딩되나 핸들링 못하고 잠시 사용, gc처리대상
		System.out.println(ss);
		
		double pi=Math.PI;
		//자주 사용 하는 것은 이미 메모리에 떠있어서(final static) new 안 씀.
		//final static 한번 초기화 후 수정 불가
		//class variable이라고 함. 주소를 모름
		double r = Math.random();
		int r1 = (int)(Math.random()*45+1);//1~45 난수
		System.out.println(pi+","+r+","+r1);//성능 저하의 코드
		System.out.printf("pi=%.4f, r= %.2f, r1= %d %n",pi,r,r1);
		//소수 반올림 처리
		
		
		
		
		
		
		
		
		String s1 = "hello";//String은 세미 타입. 객체 생성이나 new 생략 가능
		//사용 방법은 같으나 new는 heap으로 감. 메모리를 계속 올림
		String s11= "hello"; //heap 말고 코드표에 감. 많이 씀.
		String s2 = "hello";
		String s22="hello";//문자가 같으면 1개의 영역만 사용함
		
		
		
		
		

	}

}
