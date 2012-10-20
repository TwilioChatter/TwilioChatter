	// Download the twilio-java library from http://twilio.com/docs/libraries
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.resource.instance.Sms;

import java.util.HashMap;
import java.util.Map;
	 
public class TextSentImpl {
	
	
	 
	    /* Find your sid and token at twilio.com/user/account */
	   
	 
	    public static void main(String[] args) throws TwilioRestException {
	 
	        TwilioRestClient client = new TwilioRestClient(MessageConstants.ACCOUNT_SID, MessageConstants.AUTH_TOKEN);
	 
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


