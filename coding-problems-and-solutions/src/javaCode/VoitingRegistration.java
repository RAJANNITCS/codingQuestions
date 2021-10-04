package javaCode;

public class VoitingRegistration {
	
	public void checkAge(int age) {
		try {
			if(age < 18) {
				throw new YoungerAgeException("You are not elegibal for voit");
			}else {
				System.out.println("Success");
			}
		}catch (Exception e) {
			System.out.println("You are not elegibal for voit");
		} 
	}

	public static void main(String[] args) {
		VoitingRegistration obj = new VoitingRegistration();
		obj.checkAge(15);
	} 
}
