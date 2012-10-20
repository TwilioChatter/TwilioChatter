	// Download the twilio-java library from http://twilio.com/docs/libraries
	import java.util.Map;
	import java.util.HashMap;
	 
	import com.twilio.sdk.resource.instance.Account;
	import com.twilio.sdk.TwilioRestClient;
	import com.twilio.sdk.TwilioRestException;
	import com.twilio.sdk.resource.factory.SmsFactory;
	import com.twilio.sdk.resource.instance.Sms;
	 
public class TextSentImpl {
	
	
	 
	    /* Find your sid and token at twilio.com/user/account */
	    public static final String ACCOUNT_SID = "ACd977dffe0d2e11866572a21b38c7dd25";
	    public static final String AUTH_TOKEN = "fecf2edee484f18dfcb3e59127563d98";
	 
	    public static void main(String[] args) throws TwilioRestException {
	 
	        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
	 
	        Account account = client.getAccount();
	 
	        SmsFactory smsFactory = account.getSmsFactory();
	        Map<String, String> smsParams = new HashMap<String, String>();
	        smsParams.put("To", "+15123514250"); 
	        smsParams.put("From", "(410) 555-6789"); // Replace with a valid phone
	        // number in your account
	        smsParams.put("Body", "Where's Wallace?");
	        Sms sms = smsFactory.create(smsParams);
	    }
	}

}
