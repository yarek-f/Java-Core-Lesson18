package lgs.task1.min;

import java.util.ArrayList;
import java.util.List;

public class App {
	static List<Integer> castomList = new ArrayList<>();

	public static void main(String[] args) {
	addToList(castomList);
	System.out.println(castomList);
	}

	public static <T> void addToList(List<T> list) { //����� ����� ������ ������������������ ArrayList, ���������� ����� ������ ���� Object-�������� 	
	list.add((T) (Integer) 1);
	list.add((T) (String) "Iwanyshyn");
	}

}
