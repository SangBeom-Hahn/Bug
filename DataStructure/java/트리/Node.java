package Main;

public class Node<Key extends Comparable<Key>> { 
	//�ʵ�
	Key item;
	Node<Key> left;
	Node<Key> right;
	//������
	Node(Key item, Node<Key> left, Node<Key> right){
		this.item = item;
		this.left = left;
		this.right = right;
	}
	//�޼ҵ�
	public Key getItem() {
		return item;
	}
	public void setItem(Key item) {
		this.item = item;
	}
	public Node<Key> getLeft() {
		return left;
	}
	public void setLeft(Node<Key> left) {
		this.left = left;
	}
	public Node<Key> getRight() {
		return right;
	}
	public void setRight(Node<Key> right) {
		this.right = right;
	}
}
