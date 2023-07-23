package week1.day2;

public class Methods {

	public void sendSms() {
		System.out.println("From OPPO");
	}

	public long makeCall(long phno) {
		return phno;
	}

	public static void main(String[] args) {
		Methods mobile = new Methods();
		mobile.sendSms();
		long num = mobile.makeCall(9003769742l);
		System.out.println("My Mobile Num is " + num);
	}

}
