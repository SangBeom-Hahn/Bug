package HSB;

import java.util.*;

public class main { //���ǹ�, �ݺ��� return ����, ���ڿ����� ���ڻ��� ���̺귯�� ����
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		
		Issue i = new Issue("8/2-3+3*2");
		s = i.back();
		System.out.print(s);
		
	}
}