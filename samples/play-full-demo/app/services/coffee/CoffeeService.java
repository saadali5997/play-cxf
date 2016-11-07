
package services.coffee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CoffeeService", targetNamespace = "http://coffee.services/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CoffeeService {


    /**
     * 
     * @param parameters
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "makeCoffeeResponse", targetNamespace = "http://coffee.services/", partName = "parameters")
    public String makeCoffee(
            @WebParam(name = "makeCoffee", targetNamespace = "http://coffee.services/", partName = "parameters")
                    String parameters);

}
