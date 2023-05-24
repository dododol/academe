package chapter05.sec07;

public enum Menu {
	
//	Member_SignUp("회원등록"),
//	Member_Update("회원정보 수정"),
//	Member_delete("회원삭제");
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
