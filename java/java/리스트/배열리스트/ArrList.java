package Main;
import java.util.*; //��迭�ε� peek�Ҷ� ����÷ο� ����

public class ArrList<E> {
	
	//�ʵ�
	Object o[];
	int size;
	boolean b;
	
	ArrList(){
		size = 0;
		o = new Object[1];
	}
	
	//�޼���
	public E peek(int a) {
		try{
			return (E)o[a];
		}
		catch(NoSuchElementException e){
			System.out.println("����÷ο� �߻�");
		}
		return null;
	}
	public void insertLast(E item) {
		if(size == o.length) {
			resize(2*o.length);
		}
		o[size++] = item;
	}
	public void resize(int newsize) {
		Object o1[] = new Object[newsize];
		for(int i=0; i<size; i++)
			o1[i] = o[i];
		o = o1;
	}
}
