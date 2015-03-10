package onlinerobot.control;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * ControlService service = new ControlService();
 * ControlDelegate portType = service.getControlPort();
 * portType.main(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "ControlService", targetNamespace = "http://control.onlinerobot/", wsdlLocation = "http://localhost:8080/OnlineRobot/ControlPort?wsdl")
public class ControlService extends Service {

	private final static URL CONTROLSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(onlinerobot.control.ControlService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = onlinerobot.control.ControlService.class.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/OnlineRobot/ControlPort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/robots/ControlPort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		CONTROLSERVICE_WSDL_LOCATION = url;
	}

	public ControlService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ControlService() {
		super(CONTROLSERVICE_WSDL_LOCATION, new QName(
				"http://control.onlinerobot/", "ControlService"));
	}

	/**
	 * 
	 * @return returns ControlDelegate
	 */
	@WebEndpoint(name = "ControlPort")
	public ControlDelegate getControlPort() {
		return super.getPort(new QName("http://control.onlinerobot/",
				"ControlPort"), ControlDelegate.class);
	}

}
