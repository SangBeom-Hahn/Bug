package Main;
import java.util.Arrays;
import java.util.*;

//���� �ϳ����� �������� �Ͽ� ����
class People implements Comparable {

    private String name;
    private int age;
    
    public People(String name, int age){
        this.name = name;
        this.age= age;
    }

    public String print(){
        return name+"("+age+")";
    }

    @Override
    public int compareTo(Object pea) {
         // TODO Auto-generated method stub
    	People people = (People)pea;
         if (this.age < people.age) {
             return -1;
         } else if (this.age == people.age) {
             return 0;
         } else {
             return 1;
         }
     }
}

public class Sort{
     public static void main(String[] args)  {
         People[] arr = { new People("����", 20)
            , new People("ö��", 14)
            , new People("���", 31)
            , new People("��ȣ", 40)
            , new People("����", 24) 
        };
		
        Arrays.sort(arr); //�������� ����
		
        for (People i : arr) { //�������� ���
            System.out.print("["+i.print()+"]");
        }
		
        Arrays.sort(arr,Collections.reverseOrder()); //�������� ����
        System.out.println();
		
        for (People i : arr) { //�������� ���
            System.out.print("["+i.print()+"]");
        }
    }
}
