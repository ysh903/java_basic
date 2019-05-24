package day06;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("start...");
		BlockTest b;
		//BlockTest b=new BlockTest();
		System.out.println("-----");
		//BlockTest c=new BlockTest();

		
		System.out.println("end...");
	}

}

class BlockTest{
	static {
		System.out.println("초기화 static { }");
	}
		{
		System.out.println("초기화 static { }");
	}
	
	public BlockTest() {
		System.out.println("BlockTest() 생성자..");
	}
}
