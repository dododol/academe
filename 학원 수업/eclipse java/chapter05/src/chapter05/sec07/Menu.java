package chapter05.sec07;

public enum Menu {
	
//	Member_SignUp("ȸ�����"),
//	Member_Update("ȸ������ ����"),
//	Member_delete("ȸ������");
//	
//	private final String value;
//	Menu(String value) {
//		this.value = value;
//	}
//	
//	public String getValue() {
//		return value;
		
		Member_SignUp(1),
		Member_Update(2),
		Member_delete(3);
		
		private final int value;
		Menu(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
	}
}
