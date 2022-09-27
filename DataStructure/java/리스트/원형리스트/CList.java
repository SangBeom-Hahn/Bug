package HSB;

public class CList<E> {

	public class Node<E> {

		E data;
		Node next;
		
		Node(E data, Node n){
			this.data =data;
			this.next = n;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
	}
	
	Node last;
	int size;
	
	CList(){
		last = null;
		size = 0;
	}
	
	//�޼ҵ�
	public void insertfirst(E data) {
		Node<E> n = new Node<>(data, null);
		if(last == null) {
			n.setNext(n);
			last = n;
		}
		else {
			n.setNext(last.getNext());
			last.setNext(n);
		}
		size++;
	}
	public Node deleteFirst() {
		Node rem = last.getNext(); //last�� getnext�� �Ǿ��̰���?
		if ( rem == null)
			return rem;
		else {
			last.setNext(rem.getNext());//�Ǿ��� ������°Ŵ� �� �������� �Ǿ��̾������� �ϳ� ���� ������
		}
		size--;
		return rem;
	}
	public void print(){  // ���� ����Ʈ ������ �׸���� ���ʷ� ���
		if (size > 0){
			int i = 0;
			for (Node p = last.getNext(); i<size ; p = p.getNext(), i++) 
					System.out.print(p.getData()+"\t ");
		}
		else
			System.out.println("����Ʈ �������.");
	}
}