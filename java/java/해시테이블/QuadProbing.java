package HSB;

public class QuadProbing<k, v> {
	int M, N;
	Object Key[];
	Object Value[];
	//������
	QuadProbing(int M){
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
		
		do {
			if(Key[i] == null) { //���ǹ� ����� null�̸� �ְ� �ƴϸ� �������� �ƴϸ� �ȳִ´�?? �ƴϴ�
				Key[i] = key;
				Value[i] = value;
				System.out.println(Key[i]+"�� �ؽð�="+i+", �����ʹ� "+Value[i]);
				break;
			}
			if(key.equals(Key[i])) {
				System.out.print("�ؽð� -> value ����->>>"); //��
				Value[i] = value;
				System.out.println(Key[i]+"�� �ؽð�="+i+", �����ʹ� "+Value[i]);
				break;
			}
			i = (i+j*j++) % M;
		}while(N < M); //���Ҽ��� ��ü ũ�⺸�� ���� ����
	}
	public v get(k key) {
		int start = hash(key);
		if(Key[start] != null) 
			return (v) Value[start];
		return null;
	}
}
