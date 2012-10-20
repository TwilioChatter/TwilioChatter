import com.twilio.sdk.resource.instance.Sms;
import com.twilio.sdk.verbs.TwiMLException;
import com.twilio.sdk.verbs.TwiMLResponse;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ChatterServlet extends HttpServlet {
	
	 public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
	        TwiMLResponse twiml = new TwiMLResponse();
	        Sms sms = new Sms("Hello, Mobile Monkey");
	        try {
	            twiml.append(sms);
	        } catch (TwiMLException e) {
	            e.printStackTrace();
	        }
	 
	        response.setContentType("application/xml");
	        response.getWriter().print(twiml.toXML());
	    }
	}
}
