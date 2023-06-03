package Study05_06;

import java.util.Scanner;

public class MovieManagementSystem {
	
	String selectName = "";			// ���Ž� �Է��� �̸�
	int selectMovie = 0;			// ���Ž� ������ ��ȭ ��ȣ
	String selectMovieName = "";	// ���Ž� ������ ��ȭ��
	String selectSeatNumber = "";	// ���Ž� ������ �¼���ȣ
	boolean flag = false;			// �̿� ����(���� �̿���)
	int money = 50000;				// ���� �ܾ�
	
	String[] movie = new String[] {
			"����Ʈ","���˵���","���������","�丣:���� �� ���","����� ���",
			"ī��","����","����2"
	};
	int[] moviePrice = {12000,14000,10000,14000,12000,
			11000,10000,12000};
	// �¼� ��Ȳ ('-')
	String[][] seat = new String[4][10];
	String[][] seatGuide = new String[4][10];	// ���� �¼� ��ȣ ����
	String[] seatLine = {"a","b","c","d"};		// �� �� Line
	
	public MovieManagementSystem() {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "-";
			}
		}
		
		for (int i = 0; i < seatGuide.length; i++) {
			for (int j = 0; j < seatGuide[i].length; j++) {
				// a-1, a-2, a-3
				seatGuide[i][j] = seatLine[i] + "-" + j;
			}
		}
		
		
		// ���� ������ (dummy)
		seat[0][1] = "���缮-����Ʈ-a-1";
		seat[0][2] = "�ڸ��-����Ʈ-a-2";
		seat[2][4] = "������-ī��-c-4";
		seat[3][9] = "������-����2-d-9";
	}
	
	// MovieMain Ŭ�������� ȣ��Ǿ� ���۵� �Լ�(���)
	public void start() {
		System.out.println("���� ���CGV ����");
		while(true) {
			System.out.println("���MAIN MENU");
			System.out.println("�� 1. �����ϱ�");
			System.out.println("�� 2. ��ȸ�ϱ�");
			System.out.println("�� 3. ����ϱ�");
			System.out.println("�� 4. ������");
			System.out.println("");
			System.out.println("::: �޴��� �������ּ���.");
			System.out.print("���� : ");
					
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			System.out.println(); // ��ĭ����
			
			switch (menu) {
			case 1:
				//�����ϱ�
				ticketting();
				break;
			case 2:
				// ��ȸ�ϱ�
				break;
			case 3:
				// ����ϱ�
				break;
			case 4:
				// ������
				System.out.println("�� �̿����ּż� �����մϴ�!");
				System.out.println("����� ��� CGV �����");
				flag = true;		// �̿����(�ߵ�)
				break;
			default:
				// �׿��� �޴�
				System.err.println("��޴��� ��Ȯ�ϰ� �Է����ּ���!");
				break;
			}
			
			System.out.println();
			System.out.println();
			
			if(flag) {
				System.exit(0);
			}
		}
		
	}
	
	// ��ȭ �����ϱ�
	public void ticketting() {
		Scanner sc1 = new Scanner(System.in);
				System.out.println("���[��ȭ �����ϱ�]");
				System.out.println("::: �����Ͻô� ������ �̸��� �����ּ���.");
				System.out.print("[ �̸� : ");
				selectName = sc1.nextLine();  //�̸� ����
				
				System.out.println();
				System.out.println("::: ��ȭ�� �������ּ���.");
				System.out.println("���[Movie]");
				for (int i = 0; i < movie.length; i++) {
					System.out.println(i + ". " + movie[i]);
				}
				
				System.out.print("[ ��ȭ : ");
				selectMovie = sc1.nextInt();	//������ ��ȭ ��ȣ ����
				System.out.println();
				
				for (int i = 0; i < movie.length; i++) {
					if(selectMovie == i) {	// ���� ������ ��ȭ
						System.out.println("["+movie[i]+"] ���ÿϷ�Ǿ����ϴ�!\n");
						selectMovieName = movie[i];	//������ ��ȭ�� ����
					}
				}
				
				System.out.println();
				System.out.println("::: �¼��� �������ּ���");
				
				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						if(!seat[i][j].contentEquals("-")) {	// ����� �ڸ�
							System.out.print("��");
						} else {								// ���� ������ �ڸ�
							System.out.print("��");
						}
						if(j == 3 || j == 7) {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

				System.out.println("---------------------------------------");
				
				
				// �¼� ���̵� Ȯ���ϱ� (a-1, a-2, a-3 ... �ڸ�)
				for (int i = 0; i < seatGuide.length; i++) {
					for (int j = 0; j < seatGuide[i].length; j++) {
						if(!seat[i][j].contentEquals("-")) {	// ����� �ڸ�
							System.out.print("XXX ");
						} else {								// ���� �������ڸ�
							System.out.print(seatGuide[i][j] + " ");
						}
						if(j == 3 || j == 7) {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				
				System.out.println("[ �¼� :");
				String selectSeat1 = sc1.nextLine();
				String selectSeat = sc1.nextLine();
				System.out.println();
				
				/*
				 * ����ڰ� �Է��ϰ� ������ �̸�, ��ȭ, �¼� �����͸� �̿��Ͽ� ��ȭ ���Ÿ� ����
				 */
				String[] arr = selectSeat.split("-");
				String seatId = arr[0];
				int seatNum = Integer.parseInt(arr[1]);
				
				// ���� �̸�, ��ȭ, �¼���ȣ�� �̿��Ͽ� ��ȭ ���������� ����մϴ�.
				for (int i = 0; i < seat.length; i++) {
					if(seatId.equals(seatLine[i])) {
						// ������-����Ʈ-a-1�� ���� ���� ����
						seat[i][seatNum] = selectName + "-"
								+ selectMovieName + "_" + selectSeat;
					}
				}
				
				System.out.println("::: ������ �����մϴ�...");
				for (int i = 0; i < 10; i++) {
					System.out.print("��");
					try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print(" 100%");
			System.out.println();
			
			money -= moviePrice[selectMovie];
			System.out.println("�� ������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("");
			System.out.println("��� ���Ű� �Ϸ�Ǿ����ϴ�.");
			System.out.println("�� �̸� : " + selectName);
			System.out.println("�� ��ȭ : " + selectMovieName);
			System.out.println("�� �¼� : " + selectSeat);
			System.out.println("�� �ܾ� : " + money);
}
}