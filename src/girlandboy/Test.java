package girlandboy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boy boy=new Boy();
		boy.setName("ÁúÁú");
		boy.setAge(21);
		
		Girl girl=new Girl();
		girl.setName("»¨»¨");
		
		boy.marry(girl);
		boy.shout();
		girl.marry(boy);
	}

}
