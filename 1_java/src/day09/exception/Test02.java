package day09.exception;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("start");

		try {
			throw new Exception("고의로 발생시켰음");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("에러 메시지 : " + e.getMessage());
		}
		System.out.println("end");

	}

}
