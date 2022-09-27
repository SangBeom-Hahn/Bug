package HSB;

public class DoubleHashing<k, v> {
	int M, N;
	Object Key[];
	Object Value[];
	//������
	DoubleHashing(int M){
		this.M = M;
		N = 0; //�׸��
		Key = new Object[M];
		Value = new Object[M];
	}
	//�޼���
	public int hash(k key) {
		return (key.hashCode() ^ 0x7fffffff) % M;
	}
	public void put(k key, v value) {
		int init = hash(key); 
		int i = init;
		int j = 1;
		int d = 7-(int)key % 7;
		
		do {
			if(Key[i] == null) { //���ǹ� ����� null�̸� �ְ� �ƴϸ� �������� �ƴϸ� �ȳִ´�?? �ƴϴ�
				Key[i] = key;
				Value[i] = value;
				System.out.println(Key[i]+"�� �ؽð�="+i+", �����ʹ� "+Value[i]);
				break;
			}
			if(key.equals(Key[i])) {			
				Value[i] = value;
				System.out.print("�ؽð� -> value ����->>>"); //��
				System.out.println(Key[i]+"�� �ؽð�="+i+", �����ʹ� "+Value[i]);
				break;
			}
			i = (i+d*j++) % M;
		}while(N < M); //���Ҽ��� ��ü ũ�⺸�� ���� ����
	}
	public v get(k key) {
		int start = hash(key);
		if(Key[start] != null) 
			return (v) Value[start];
		return null;
	}
}
