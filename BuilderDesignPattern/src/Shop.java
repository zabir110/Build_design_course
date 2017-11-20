
public class Shop {

	public static void main(String[] args) {
		Phone phone=new PhoneBuilder().setName("Nokia").setBattery(1000).getPhone();
		System.out.println(phone);

	}

}
