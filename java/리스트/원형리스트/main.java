package HSB;

public class main {
	public static void main(String[] args) {
		CList<String> s = new CList<String>();  // ���� ����Ʈ ��ü s ����

        s.insertfirst("pear");    s.insertfirst("cherry");
        s.insertfirst("orange");  s.insertfirst("apple"); 
		s.print();
		System.out.print(": s�� ���� = "+s.size+"\n"); 

		s.deleteFirst(); 
		s.print(); 
		System.out.print(" : s�� ���� = "+s.size);System.out.println();	
	}
}