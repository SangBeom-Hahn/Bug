package HSB;

public class main { //���ǹ�, �ݺ��� return ����, ���ڿ����� ���ڻ��� ���̺귯�� ����
	public static void main(String[] args) {
		
		ArrQueue<String> q = new ArrQueue<>();
		q.add("apple");
		q.add("orange");
		q.add("pear");
		q.add("cherry");
		q.print();
		q.delete();
		q.delete();
		System.out.println();
		q.print();
		System.out.println();
		q.add("apple");
		q.add("orange");
		q.add("pear");
		q.add("cherry");
		q.print();
	}
}