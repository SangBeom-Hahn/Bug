package HSB;
import java.util.Random;

public class Randomprobing<k, v> {
	int M, N;
	Object Key[];
	Object Value[];
	//������
	Randomprobing(int M){
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
		Random rand = new Random();
		do {
			if(Key[i] == null) { //���ǹ� ����� null�̸� �ְ� �ƴϸ� �������� �ƴϸ� �ȳִ´�?? �ƴϴ�
				Key[i] = key;
				Value[i] = value;
				System.out.println(Key[i]+"�� �ؽð�="+i+", �����ʹ� "+Value[i]);
				N++;
				break;
			}
			if(key.equals(Key[i])) {
				Value[i] = value;
				break;
			}
			i = (i+rand.nextInt(1000)) % M;
		}while(N < M); //���Ҽ��� ��ü ũ�⺸�� ���� ����
	}
	public v get(k key) {
		int start = hash(key);
		if(Key[start] != null) 
			return (v) Value[start];
		return null;
	}
}
