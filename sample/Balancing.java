package sample;

class lifo{
	char stack[] = new char[10];
	int top = -1;
	void push(char data) {
			top=top+1;
			stack[top] = data;
			System.out.println("In push "+stack[top]);
	}
	int pop() {
		int data;
		if(top == -1)return -1;
		data = stack[top];
		top = top-1;
		System.out.println("In pop "+data);
		return data;
	}
}

public class Balancing {

	public static void main(String[] args) {
		String input = "{[]}";
		char inp[] = input.toCharArray();
		lifo lf= new lifo();
		for(int i=0; i<inp.length; i++) {
			if(inp[i] == '{' || inp[i] == '[' || inp[i] == '(') {
				lf.push(inp[i]);
			}
			if(inp[i] == '}' || inp[i] == ']' || inp[i] == ')') {
				if(inp[i]-lf.stack[lf.top] == 2) {
					lf.pop();
				}
			}
		}
		if(lf.top == -1) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("UnBalanced");
		}
	}

}
