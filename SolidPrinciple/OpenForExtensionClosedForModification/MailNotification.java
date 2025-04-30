package SolidPrinciple.OpenForExtensionClosedForModification;

public class MailNotification implements NotificationService {

    @Override
    public String otp(String type) {
	// TODO Auto-generated method stub
	return "Sending otp via Mail";
    }

}
