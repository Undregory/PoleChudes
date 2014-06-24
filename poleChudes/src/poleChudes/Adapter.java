package poleChudes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Adapter {
	private LinkedHashMap<String,String> qMap;
	private String tempQuestion;
	private String tempAnswer;
	private List<String> list;
	Adapter(){
		qMap = new LinkedHashMap<String, String>();
		list = new ArrayList<String>();
		list.add("��� � ������� �������� ������� ��������� �����");
		list.add("�������� ������ � �������� �����, ������������ �� ������ ��������");
		list.add("�������� �������� ��� �����");
		list.add("��� ���������� ����������� �� ����������� ��������� ��������?");
		list.add("����� �������� ���� �������� ����������������� � ������� ���� ������� ������� ����������?");
		list.add("���������� ������ � ���������� ��������");
		list.add("�������� ����� �������� ��������� �� ���������� ������������ �������");
		list.add("��� ����� ����� ������ ������ ������");
		list.add("������, ���������� �������, �������");
		list.add("� ����� ����� ������ ��� ����, ����� ������ � ���������, ����� ��� �������� ����������� ��������");
		qMap.put(list.get(0), "�������");
		qMap.put(list.get(1),"���������");
		qMap.put(list.get(2),"������");
		qMap.put(list.get(3),"��������");
		qMap.put(list.get(4),"��������");
		qMap.put(list.get(5),"��������");
		qMap.put(list.get(6),"��������");
		qMap.put(list.get(7),"�������");
		qMap.put(list.get(8),"������");
		qMap.put(list.get(9),"�������");
	}
	
	public void newQuestion(){
		int num = (int) (Math.random()*qMap.size());
		tempQuestion = list.get(num);
		tempAnswer = qMap.get(tempQuestion);
	}
	
	public String getQuestion(){
		return tempQuestion;
	}
	
	public String getAnswer(){
		return tempAnswer;
	}
	
	public int checkLetter(String s){
		if(tempAnswer.contains(s.toLowerCase().trim())){
			int i = tempAnswer.indexOf(s.toLowerCase().trim());
			String s1,s2;
			s1 = "";
			s2 = "";
			if(i!=0)
				s1 = tempAnswer.substring(0, tempAnswer.indexOf(s.toLowerCase().trim()));
			s2 = tempAnswer.substring(tempAnswer.indexOf(s.toLowerCase().trim())+1, tempAnswer.length());
			tempAnswer = s1 + "/" + s2;
			return i;
		}
		else return -1;
	}
}
