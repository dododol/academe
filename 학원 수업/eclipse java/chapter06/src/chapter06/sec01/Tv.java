package chapter06.sec01;

public class Tv {
	private String maker;
	private int year;
	private int size;
	
	// ����ȸ��
	public void setMaker(String maker) {
		this.maker = maker;
	}
	// ����⵵
	public void setYear(int year) {
		this.year = year;
	}
	// ũ��
	public void setSize(int size) {
		this.size = size;
	}

	public void show() {
		System.out.println("------------------------------");
		System.out.println(" maker     year     size");
		System.out.println("------------------------------");
		System.out.printf("%6s    %6d    %6d",maker,year,size);
	}

}

/*
���� 5] main�޼ҵ带 ����������� ����ȸ��, ����⵵, ũ�⸦ ����ϴ� TvŬ������ �ۼ��Ͻÿ�.
���� 6] �������� ������ �Է¹޾� ������ ����� ����ϴ� Grade Ŭ���� ���� ( �迭����ϸ� ��������)
���� 7] �Ա�(deposit),���(withdraw),�ܰ�Ȯ��(getbalance)�� �����ϴ� ����Ŭ����(Account)�� �����Ͻÿ�.

�Ա�ó�� �޼ҵ� - �ִµ� + �ܰ�(��ȯ�� ����)
���ó�� �޼ҵ� - ����ڰ� ��� �Է��ϸ� �ܰ� Ȯ�κ��� ��(ã�µ�>=�ܰ�) �Ŀ� �� ���������(��ȯ�� ����)
�ܰ� ó���ϴ� �޼ҵ� - ��ȯ�� ����

���� Ŭ������ �������� �⺻���� : ������(�̸�), �ܰ�

*/