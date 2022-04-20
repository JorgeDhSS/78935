//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.15 a las 01:16:45 PM CDT 
//


package https.t4is_uv_mx.todolist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.todolist package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarActivitiesRequest_QNAME = new QName("https://t4is.uv.mx/toDoList", "ListarActivitiesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.todolist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarActivitiesResponse }
     * 
     */
    public ListarActivitiesResponse createListarActivitiesResponse() {
        return new ListarActivitiesResponse();
    }

    /**
     * Create an instance of {@link CreateActivityRequest }
     * 
     */
    public CreateActivityRequest createCreateActivityRequest() {
        return new CreateActivityRequest();
    }

    /**
     * Create an instance of {@link CreateActivityResponse }
     * 
     */
    public CreateActivityResponse createCreateActivityResponse() {
        return new CreateActivityResponse();
    }

    /**
     * Create an instance of {@link ListarActivitiesResponse.ActivitieList }
     * 
     */
    public ListarActivitiesResponse.ActivitieList createListarActivitiesResponseActivitieList() {
        return new ListarActivitiesResponse.ActivitieList();
    }

    /**
     * Create an instance of {@link ModificarActivityRequest }
     * 
     */
    public ModificarActivityRequest createModificarActivityRequest() {
        return new ModificarActivityRequest();
    }

    /**
     * Create an instance of {@link ModificarActivityResponse }
     * 
     */
    public ModificarActivityResponse createModificarActivityResponse() {
        return new ModificarActivityResponse();
    }

    /**
     * Create an instance of {@link BorrarActivityRequest }
     * 
     */
    public BorrarActivityRequest createBorrarActivityRequest() {
        return new BorrarActivityRequest();
    }

    /**
     * Create an instance of {@link BorrarActivityResponse }
     * 
     */
    public BorrarActivityResponse createBorrarActivityResponse() {
        return new BorrarActivityResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/toDoList", name = "ListarActivitiesRequest")
    public JAXBElement<Object> createListarActivitiesRequest(Object value) {
        return new JAXBElement<Object>(_ListarActivitiesRequest_QNAME, Object.class, null, value);
    }

}
