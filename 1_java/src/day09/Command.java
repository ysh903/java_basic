package day09;

@FunctionalInterface//이것이 허용 되어야만 람다 가능
public interface Command {
	void exec();

	default public void process() {// default method 가능, static처리가 됨

		System.out.println("process()");
	}

}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}

}

class CreateCommand implements Command {
	@Override
	public void exec() {
		System.out.println("CreatCommand 수행");
	}

}

class UpdateCommand implements Command {
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}

}

class ListCommand implements Command {
	@Override
	public void exec() {
		System.out.println("ListCommand 수행");
	}

}