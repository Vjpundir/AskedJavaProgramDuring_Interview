package interview.questions;

public class CallingPojoClass {

	public static void main(String[] args) {
	
		PojoClassExample pojo = new PojoClassExample();
			
			
			pojo.setId(10);
			pojo.setName("vijay");
			pojo.setLocation("noida");
			
			pojo.getId();
			pojo.getName();
			pojo.getLocation();

	}

}
