
package com.bancomaya.clientes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bancomaya.clientes package. 
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

    private final static QName _ObtenerTarjetaNombreCliente_QNAME = new QName("http://clientes.bancomaya.com/", "obtenerTarjetaNombreCliente");
    private final static QName _ObtenerTarjetaNumeroResponse_QNAME = new QName("http://clientes.bancomaya.com/", "obtenerTarjetaNumeroResponse");
    private final static QName _ObtenerTarjetaDigitales_QNAME = new QName("http://clientes.bancomaya.com/", "obtenerTarjetaDigitales");
    private final static QName _ObtenerTarjetaDigitalesResponse_QNAME = new QName("http://clientes.bancomaya.com/", "obtenerTarjetaDigitalesResponse");
    private final static QName _CrearTarjetaDigital_QNAME = new QName("http://clientes.bancomaya.com/", "crearTarjetaDigital");
    private final static QName _CrearTarjetaDigitalResponse_QNAME = new QName("http://clientes.bancomaya.com/", "crearTarjetaDigitalResponse");
    private final static QName _ObtenerTarjetaNombreClienteResponse_QNAME = new QName("http://clientes.bancomaya.com/", "obtenerTarjetaNombreClienteResponse");
    private final static QName _ObtenerTarjetaNumero_QNAME = new QName("http://clientes.bancomaya.com/", "obtenerTarjetaNumero");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bancomaya.clientes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearTarjetaDigital }
     * 
     */
    public CrearTarjetaDigital createCrearTarjetaDigital() {
        return new CrearTarjetaDigital();
    }

    /**
     * Create an instance of {@link ObtenerTarjetaDigitalesResponse }
     * 
     */
    public ObtenerTarjetaDigitalesResponse createObtenerTarjetaDigitalesResponse() {
        return new ObtenerTarjetaDigitalesResponse();
    }

    /**
     * Create an instance of {@link ObtenerTarjetaNumero }
     * 
     */
    public ObtenerTarjetaNumero createObtenerTarjetaNumero() {
        return new ObtenerTarjetaNumero();
    }

    /**
     * Create an instance of {@link CrearTarjetaDigitalResponse }
     * 
     */
    public CrearTarjetaDigitalResponse createCrearTarjetaDigitalResponse() {
        return new CrearTarjetaDigitalResponse();
    }

    /**
     * Create an instance of {@link ObtenerTarjetaNombreClienteResponse }
     * 
     */
    public ObtenerTarjetaNombreClienteResponse createObtenerTarjetaNombreClienteResponse() {
        return new ObtenerTarjetaNombreClienteResponse();
    }

    /**
     * Create an instance of {@link ObtenerTarjetaDigitales }
     * 
     */
    public ObtenerTarjetaDigitales createObtenerTarjetaDigitales() {
        return new ObtenerTarjetaDigitales();
    }

    /**
     * Create an instance of {@link ObtenerTarjetaNombreCliente }
     * 
     */
    public ObtenerTarjetaNombreCliente createObtenerTarjetaNombreCliente() {
        return new ObtenerTarjetaNombreCliente();
    }

    /**
     * Create an instance of {@link ObtenerTarjetaNumeroResponse }
     * 
     */
    public ObtenerTarjetaNumeroResponse createObtenerTarjetaNumeroResponse() {
        return new ObtenerTarjetaNumeroResponse();
    }

    /**
     * Create an instance of {@link TarjetaDigital }
     * 
     */
    public TarjetaDigital createTarjetaDigital() {
        return new TarjetaDigital();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTarjetaNombreCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.bancomaya.com/", name = "obtenerTarjetaNombreCliente")
    public JAXBElement<ObtenerTarjetaNombreCliente> createObtenerTarjetaNombreCliente(ObtenerTarjetaNombreCliente value) {
        return new JAXBElement<ObtenerTarjetaNombreCliente>(_ObtenerTarjetaNombreCliente_QNAME, ObtenerTarjetaNombreCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTarjetaNumeroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.bancomaya.com/", name = "obtenerTarjetaNumeroResponse")
    public JAXBElement<ObtenerTarjetaNumeroResponse> createObtenerTarjetaNumeroResponse(ObtenerTarjetaNumeroResponse value) {
        return new JAXBElement<ObtenerTarjetaNumeroResponse>(_ObtenerTarjetaNumeroResponse_QNAME, ObtenerTarjetaNumeroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTarjetaDigitales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.bancomaya.com/", name = "obtenerTarjetaDigitales")
    public JAXBElement<ObtenerTarjetaDigitales> createObtenerTarjetaDigitales(ObtenerTarjetaDigitales value) {
        return new JAXBElement<ObtenerTarjetaDigitales>(_ObtenerTarjetaDigitales_QNAME, ObtenerTarjetaDigitales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTarjetaDigitalesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.bancomaya.com/", name = "obtenerTarjetaDigitalesResponse")
    public JAXBElement<ObtenerTarjetaDigitalesResponse> createObtenerTarjetaDigitalesResponse(ObtenerTarjetaDigitalesResponse value) {
        return new JAXBElement<ObtenerTarjetaDigitalesResponse>(_ObtenerTarjetaDigitalesResponse_QNAME, ObtenerTarjetaDigitalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTarjetaDigital }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.bancomaya.com/", name = "crearTarjetaDigital")
    public JAXBElement<CrearTarjetaDigital> createCrearTarjetaDigital(CrearTarjetaDigital value) {
        return new JAXBElement<CrearTarjetaDigital>(_CrearTarjetaDigital_QNAME, CrearTarjetaDigital.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTarjetaDigitalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.bancomaya.com/", name = "crearTarjetaDigitalResponse")
    public JAXBElement<CrearTarjetaDigitalResponse> createCrearTarjetaDigitalResponse(CrearTarjetaDigitalResponse value) {
        return new JAXBElement<CrearTarjetaDigitalResponse>(_CrearTarjetaDigitalResponse_QNAME, CrearTarjetaDigitalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTarjetaNombreClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.bancomaya.com/", name = "obtenerTarjetaNombreClienteResponse")
    public JAXBElement<ObtenerTarjetaNombreClienteResponse> createObtenerTarjetaNombreClienteResponse(ObtenerTarjetaNombreClienteResponse value) {
        return new JAXBElement<ObtenerTarjetaNombreClienteResponse>(_ObtenerTarjetaNombreClienteResponse_QNAME, ObtenerTarjetaNombreClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTarjetaNumero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.bancomaya.com/", name = "obtenerTarjetaNumero")
    public JAXBElement<ObtenerTarjetaNumero> createObtenerTarjetaNumero(ObtenerTarjetaNumero value) {
        return new JAXBElement<ObtenerTarjetaNumero>(_ObtenerTarjetaNumero_QNAME, ObtenerTarjetaNumero.class, null, value);
    }

}
