
package kz.iitu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kz.iitu package. 
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

    private final static QName _SquareRoot_QNAME = new QName("http://iitu.kz/", "squareRoot");
    private final static QName _SubtractionOperator_QNAME = new QName("http://iitu.kz/", "subtractionOperator");
    private final static QName _AdditionOperator_QNAME = new QName("http://iitu.kz/", "additionOperator");
    private final static QName _AdditionOperatorResponse_QNAME = new QName("http://iitu.kz/", "additionOperatorResponse");
    private final static QName _SubtractionOperatorResponse_QNAME = new QName("http://iitu.kz/", "subtractionOperatorResponse");
    private final static QName _DivisionOperatorResponse_QNAME = new QName("http://iitu.kz/", "divisionOperatorResponse");
    private final static QName _MultiplicationOperator_QNAME = new QName("http://iitu.kz/", "multiplicationOperator");
    private final static QName _DivisionOperator_QNAME = new QName("http://iitu.kz/", "divisionOperator");
    private final static QName _SquareRootResponse_QNAME = new QName("http://iitu.kz/", "squareRootResponse");
    private final static QName _MultiplicationOperatorResponse_QNAME = new QName("http://iitu.kz/", "multiplicationOperatorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kz.iitu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DivisionOperator }
     * 
     */
    public DivisionOperator createDivisionOperator() {
        return new DivisionOperator();
    }

    /**
     * Create an instance of {@link SquareRootResponse }
     * 
     */
    public SquareRootResponse createSquareRootResponse() {
        return new SquareRootResponse();
    }

    /**
     * Create an instance of {@link MultiplicationOperatorResponse }
     * 
     */
    public MultiplicationOperatorResponse createMultiplicationOperatorResponse() {
        return new MultiplicationOperatorResponse();
    }

    /**
     * Create an instance of {@link AdditionOperatorResponse }
     * 
     */
    public AdditionOperatorResponse createAdditionOperatorResponse() {
        return new AdditionOperatorResponse();
    }

    /**
     * Create an instance of {@link SubtractionOperatorResponse }
     * 
     */
    public SubtractionOperatorResponse createSubtractionOperatorResponse() {
        return new SubtractionOperatorResponse();
    }

    /**
     * Create an instance of {@link DivisionOperatorResponse }
     * 
     */
    public DivisionOperatorResponse createDivisionOperatorResponse() {
        return new DivisionOperatorResponse();
    }

    /**
     * Create an instance of {@link MultiplicationOperator }
     * 
     */
    public MultiplicationOperator createMultiplicationOperator() {
        return new MultiplicationOperator();
    }

    /**
     * Create an instance of {@link SquareRoot }
     * 
     */
    public SquareRoot createSquareRoot() {
        return new SquareRoot();
    }

    /**
     * Create an instance of {@link SubtractionOperator }
     * 
     */
    public SubtractionOperator createSubtractionOperator() {
        return new SubtractionOperator();
    }

    /**
     * Create an instance of {@link AdditionOperator }
     * 
     */
    public AdditionOperator createAdditionOperator() {
        return new AdditionOperator();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareRoot }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "squareRoot")
    public JAXBElement<SquareRoot> createSquareRoot(SquareRoot value) {
        return new JAXBElement<SquareRoot>(_SquareRoot_QNAME, SquareRoot.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractionOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "subtractionOperator")
    public JAXBElement<SubtractionOperator> createSubtractionOperator(SubtractionOperator value) {
        return new JAXBElement<SubtractionOperator>(_SubtractionOperator_QNAME, SubtractionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "additionOperator")
    public JAXBElement<AdditionOperator> createAdditionOperator(AdditionOperator value) {
        return new JAXBElement<AdditionOperator>(_AdditionOperator_QNAME, AdditionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionOperatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "additionOperatorResponse")
    public JAXBElement<AdditionOperatorResponse> createAdditionOperatorResponse(AdditionOperatorResponse value) {
        return new JAXBElement<AdditionOperatorResponse>(_AdditionOperatorResponse_QNAME, AdditionOperatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractionOperatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "subtractionOperatorResponse")
    public JAXBElement<SubtractionOperatorResponse> createSubtractionOperatorResponse(SubtractionOperatorResponse value) {
        return new JAXBElement<SubtractionOperatorResponse>(_SubtractionOperatorResponse_QNAME, SubtractionOperatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionOperatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "divisionOperatorResponse")
    public JAXBElement<DivisionOperatorResponse> createDivisionOperatorResponse(DivisionOperatorResponse value) {
        return new JAXBElement<DivisionOperatorResponse>(_DivisionOperatorResponse_QNAME, DivisionOperatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "multiplicationOperator")
    public JAXBElement<MultiplicationOperator> createMultiplicationOperator(MultiplicationOperator value) {
        return new JAXBElement<MultiplicationOperator>(_MultiplicationOperator_QNAME, MultiplicationOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "divisionOperator")
    public JAXBElement<DivisionOperator> createDivisionOperator(DivisionOperator value) {
        return new JAXBElement<DivisionOperator>(_DivisionOperator_QNAME, DivisionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SquareRootResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "squareRootResponse")
    public JAXBElement<SquareRootResponse> createSquareRootResponse(SquareRootResponse value) {
        return new JAXBElement<SquareRootResponse>(_SquareRootResponse_QNAME, SquareRootResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationOperatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iitu.kz/", name = "multiplicationOperatorResponse")
    public JAXBElement<MultiplicationOperatorResponse> createMultiplicationOperatorResponse(MultiplicationOperatorResponse value) {
        return new JAXBElement<MultiplicationOperatorResponse>(_MultiplicationOperatorResponse_QNAME, MultiplicationOperatorResponse.class, null, value);
    }

}
