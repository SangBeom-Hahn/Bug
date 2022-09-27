package HSB;

public class Stacks<E> {
	
	//�ʵ�
	Node<E> top;
	int size;
	
	//������
	Stacks(){
		top = null;
		size = 0;
	}
	
	public class Node<E>{
		
		E data;
		Node<E> next;
		//������
		Node(E data, Node top){
			this.data = data;
			next = top; 
		}
		public E getData() {
			return data;
		}
		public void setData(E data) {
			this.data = data;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}
	//�޼ҵ�
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public E peek() {
		return top.getData();
	}
	public void push(E data) {
		Node<E> p = new Node<>(data, top);
		top = p;
		size++;
	}
	public E pop() {
		if(isEmpty()) return null;
		Node rem = top;
		top = rem.getNext();
		size--;
		return (E) rem.getData();
	}
	public void print() {
		Node p = top;
		for(;p != null; p = p.getNext()) { //null�� ���� ������ ���ǹ��̳�,,
			System.out.print("     "+p.getData());
		}
	}
}