package onlinerobot.control;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "ControlDelegate", targetNamespace = "http://control.onlinerobot/")
public interface ControlDelegate {

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "main", targetNamespace = "http://control.onlinerobot/", className = "onlinerobot.control.Main")
	@ResponseWrapper(localName = "mainResponse", targetNamespace = "http://control.onlinerobot/", className = "onlinerobot.control.MainResponse")
	public void main(
			@WebParam(name = "arg0", targetNamespace = "") List<String> arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GetSobot")
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "GetSobot", targetNamespace = "http://control.onlinerobot/", className = "onlinerobot.control.GetSobot")
	@ResponseWrapper(localName = "GetSobotResponse", targetNamespace = "http://control.onlinerobot/", className = "onlinerobot.control.GetSobotResponse")
	public String getSobot(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GetBing")
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "GetBing", targetNamespace = "http://control.onlinerobot/", className = "onlinerobot.control.GetBing")
	@ResponseWrapper(localName = "GetBingResponse", targetNamespace = "http://control.onlinerobot/", className = "onlinerobot.control.GetBingResponse")
	public String getBing(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "GetTuLing")
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "GetTuLing", targetNamespace = "http://control.onlinerobot/", className = "onlinerobot.control.GetTuLing")
	@ResponseWrapper(localName = "GetTuLingResponse", targetNamespace = "http://control.onlinerobot/", className = "onlinerobot.control.GetTuLingResponse")
	public String getTuLing(
			@WebParam(name = "arg0", targetNamespace = "") String arg0);

}
