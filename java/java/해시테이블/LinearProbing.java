package HSB;

public class LinearProbing<k,v> { //���� ���� �ؽ����̺�
	int M;
	Object Key[];
	Object Value[];
	//������
	LinearProbing(int M){
		this.M = M;
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
				break;
			}
			if(key.equals(Key[i])) {
				Value[i] = value;
				break;
			}
			i = (i+j++) % M;
		}while(i != init);
	}
	public v get(k key) {
		int start = hash(key);
		if(Key[start] != null) 
			return (v) Value[start];
		return null;
	}
}
