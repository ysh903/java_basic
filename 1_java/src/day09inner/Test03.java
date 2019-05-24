package day09inner;

import day09.Command;

public class Test03 {

	public static void main(String[] args) {
		Command delete = () -> System.out.println("delete 작업 실행");

		Command update = () -> System.out.println("update 작업 실행");

		Command list = () -> System.out.println("list 작업 실행");

		Command create = () -> System.out.println("create 작업 실행");
		
		delete.exec();
		update.exec();
		list.exec();
		create.exec();
		
		
	}
}
