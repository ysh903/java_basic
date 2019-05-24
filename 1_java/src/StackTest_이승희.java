/*
MyStack 클래스에 대한 요구조건
1.	MyStack클래스는 기본생성자로 생성하면 int 타입의 정수를 10개만 저장하는 Stack 클래스이다. 
2.	객체 생성 시 생성자 매개변수로 배열의 크기를 지정할 수 있으나 음수가 매개변수로 들어올 경우는 기본적으로 10개의 정수를 저장하도록 한다. 
3.	push() 메서드로 Stack에 정수를 저장한다.
4.	isEmpty() 메서드로 Stack이 비어있는지 확인할 수 있다. 
5.	ifFull() 메서드로 Stack이 가득찼는지 확인할 수 있다. 
6.	top() 메서드로 Stack에서 최상위에 저장된 숫자가 뭔지 알 수 있다. top() 메서드를 호출했다고 해서 숫자가 삭제되는 것은 아니다. 꺼낼 숫자가 없는 경우 -1을 리턴한다.
7.	pop() 메서드로 Stack에서 최상위에 저장된 숫자를 꺼낼 수 있다. 스택에서 숫자를 꺼내면 그 숫자는 Stack에서 삭제된다. 꺼낼 숫자가 없는 경우 -1을 리턴한다.
8.	java.util.Stack class는 사용하지 않는다.
*/

public class StackTest_이승희{
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	private int[] stack;// 주소값 null
	int count = 0;
	
	public MyStack(){
		stack = new int[10];
	}
	public MyStack(int i){
		if (i<0) {
			stack = new int[10];
		}else
		{
			stack = new int[i];
		}
	}
	public void push(int i) {
		
		if (count == stack.length) {
			int[] temp = new int[stack.length+1];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
		}
		
		stack[count]=i;
		count++;
	}
	
	public boolean isEmpty() {
		if (count==0) return true;
		else return false;
	}
	public boolean isFull() {
		if (count==stack.length) return true;
		else return false;
	}
	public int top() {
		if (count>0) return stack[count-1];
		else return -1;
	}
	public int pop() {
		if (count>0) {
			count--;
			return stack[count];
		
		}else return -1;
		
	}
	
	
}


	// 구현하시오.

