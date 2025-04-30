package SolidPrinciple.OpenForExtensionClosedForModification;

public class SmsNotification implements NotificationService {

    @Override
    public String otp(String type) {
	// TODO Auto-generated method stub
	return "Sending Otp Via Text Message";
    }

}
