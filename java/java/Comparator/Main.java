package main;

import java.util.*;
import java.lang.Math;

public class Main {
	
	public static void main(String[] args) {
		
		int arr[] = {4, 23, 33, 15, 17, 19};
		
		Arrays.sort(arr);
		
		for(int ar : arr) {
			System.out.println(ar);
		}
	}
	
	/*public static void print(Student[] st, String key) {
		System.out.println();
		System.out.println("     "+key+"�� ����");
		System.out.println("---------------");
		for(Student temp : st) {
			System.out.print(temp.getId()+" "+temp.getName()+" "+temp.getDep()+" "+temp.getGrade()+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student stu[] = {
				new Student(111, "��**", "��ǻ��", 2),
				new Student(222, "��**", "��ȸ", 2),
				new Student(333, "��**", "���þ�", 2)
		};
		
		Arrays.sort(stu);
		print(stu, "ID");
		Arrays.sort(stu, new Dep());
		print(stu, "DEP");
		
		
	}*/
}








