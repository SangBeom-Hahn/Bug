package HSB;

public class Examine {
	
	String s;
	boolean b;
	//������
	Examine(String sentence){
		s = sentence;
		b = true;
	}
	
	//�޼ҵ�
	public void compare() {
		Stacks<Character> stack = new Stacks<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			}
			if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
				char c = stack.pop();
				switch (c) {
				case '{':
					if(s.charAt(i) != '}')
						b = !b;
				break;
				case '[':
					if(s.charAt(i) != ']')
						b = !b;
				break;
				case '(':
					if(s.charAt(i) != ')')
						b = !b;
				break;
				}	
			}
			if(b == false) {
				break;
			}
		}
		if(b == false) {
			System.out.print("����");
		}
		else
			System.out.print("����");
	}
}
