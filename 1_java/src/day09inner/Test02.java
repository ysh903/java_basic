package day09inner;

import javax.swing.JOptionPane;

import day09.Command;

public class Test02 {

	public static void main(String[] args) {
		Command delete = new Command() {
			@Override
			public void exec() {
				System.out.println("delete 작업 실행");
			}

		};
		Command update = new Command() {

			@Override
			public void exec() {
				System.out.println("update 작업 실행");

			}
		};
		Command list = new Command() {

			@Override
			public void exec() {
				System.out.println("list 작업 실행");

			}
		};
		Command create = new Command() {

			@Override
			public void exec() {
				System.out.println("create 작업 실행");

			}
		};
		String msg = JOptionPane.showInputDialog("수행할 명령을 입력하세요. create, list, delete, update");
		switch (msg.trim().toLowerCase()) {
		case "delete":
			delete.exec();
			break;
		case "create":
			create.exec();
			break;
		case "list":
			list.exec();
			break;
		case "update":
			update.exec();
			break;
		default:
			System.out.println("다시 입력하세요");

		}

	}
}
