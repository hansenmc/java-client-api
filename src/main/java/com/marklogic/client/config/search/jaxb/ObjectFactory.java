//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.20 at 02:46:45 PM PDT 
//


package com.marklogic.client.config.search.jaxb;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.marklogic.client.config.search.jaxb package. 
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

    private final static QName _FacetResolutionTime_QNAME = new QName("http://marklogic.com/appservices/search", "facet-resolution-time");
    private final static QName _Facet_QNAME = new QName("http://marklogic.com/appservices/search", "facet");
    private final static QName _SnippetResolutionTime_QNAME = new QName("http://marklogic.com/appservices/search", "snippet-resolution-time");
    private final static QName _ReturnQuery_QNAME = new QName("http://marklogic.com/appservices/search", "return-query");
    private final static QName _SuggestionOption_QNAME = new QName("http://marklogic.com/appservices/search", "suggestion-option");
    private final static QName _GeoElemPair_QNAME = new QName("http://marklogic.com/appservices/search", "geo-elem-pair");
    private final static QName _TermOption_QNAME = new QName("http://marklogic.com/appservices/search", "term-option");
    private final static QName _Highlight_QNAME = new QName("http://marklogic.com/appservices/search", "highlight");
    private final static QName _SearchableExpression_QNAME = new QName("http://marklogic.com/appservices/search", "searchable-expression");
    private final static QName _ElementQuery_QNAME = new QName("http://marklogic.com/appservices/search", "element-query");
    private final static QName _Custom_QNAME = new QName("http://marklogic.com/appservices/search", "custom");
    private final static QName _ConcurrencyLevel_QNAME = new QName("http://marklogic.com/appservices/search", "concurrency-level");
    private final static QName _ReturnPlan_QNAME = new QName("http://marklogic.com/appservices/search", "return-plan");
    private final static QName _Value_QNAME = new QName("http://marklogic.com/appservices/search", "value");
    private final static QName _ReturnSimilar_QNAME = new QName("http://marklogic.com/appservices/search", "return-similar");
    private final static QName _ReturnResults_QNAME = new QName("http://marklogic.com/appservices/search", "return-results");
    private final static QName _Geospatial_QNAME = new QName("http://marklogic.com/appservices/search", "Geospatial");
    private final static QName _GeoElem_QNAME = new QName("http://marklogic.com/appservices/search", "geo-elem");
    private final static QName _Qtext_QNAME = new QName("http://marklogic.com/appservices/search", "qtext");
    private final static QName _Forest_QNAME = new QName("http://marklogic.com/appservices/search", "forest");
    private final static QName _Properties_QNAME = new QName("http://marklogic.com/appservices/search", "properties");
    private final static QName _GeoOption_QNAME = new QName("http://marklogic.com/appservices/search", "geo-option");
    private final static QName _ResponseFacet_QNAME = new QName("http://marklogic.com/appservices/search", "ResponseFacet");
    private final static QName _Quotation_QNAME = new QName("http://marklogic.com/appservices/search", "quotation");
    private final static QName _GeoAttrPair_QNAME = new QName("http://marklogic.com/appservices/search", "geo-attr-pair");
    private final static QName _Word_QNAME = new QName("http://marklogic.com/appservices/search", "word");
    private final static QName _FragmentScope_QNAME = new QName("http://marklogic.com/appservices/search", "fragment-scope");
    private final static QName _Query_QNAME = new QName("http://marklogic.com/appservices/search", "query");
    private final static QName _Range_QNAME = new QName("http://marklogic.com/appservices/search", "range");
    private final static QName _ConstraintType_QNAME = new QName("http://marklogic.com/appservices/search", "constraint-type");
    private final static QName _ReturnMetrics_QNAME = new QName("http://marklogic.com/appservices/search", "return-metrics");
    private final static QName _Collection_QNAME = new QName("http://marklogic.com/appservices/search", "collection");
    private final static QName _Debug_QNAME = new QName("http://marklogic.com/appservices/search", "debug");
    private final static QName _ReturnFacets_QNAME = new QName("http://marklogic.com/appservices/search", "return-facets");
    private final static QName _Options_QNAME = new QName("http://marklogic.com/appservices/search", "options");
    private final static QName _Boxes_QNAME = new QName("http://marklogic.com/appservices/search", "boxes");
    private final static QName _TotalTime_QNAME = new QName("http://marklogic.com/appservices/search", "total-time");
    private final static QName _ReturnConstraints_QNAME = new QName("http://marklogic.com/appservices/search", "return-constraints");
    private final static QName _ReturnQtext_QNAME = new QName("http://marklogic.com/appservices/search", "return-qtext");
    private final static QName _QueryResolutionTime_QNAME = new QName("http://marklogic.com/appservices/search", "query-resolution-time");
    private final static QName _SearchOption_QNAME = new QName("http://marklogic.com/appservices/search", "search-option");
    private final static QName _QualityWeight_QNAME = new QName("http://marklogic.com/appservices/search", "quality-weight");
    private final static QName _PageLength_QNAME = new QName("http://marklogic.com/appservices/search", "page-length");
    private final static QName _FacetOption_QNAME = new QName("http://marklogic.com/appservices/search", "facet-option");
    private final static QName _GeoElemElement_QNAME = new QName("http://marklogic.com/appservices/search", "element");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.marklogic.client.config.search.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeoElem }
     * 
     */
    public GeoElem createGeoElem() {
        return new GeoElem();
    }

    /**
     * Create an instance of {@link StartFacet }
     * 
     */
    public StartFacet createStartFacet() {
        return new StartFacet();
    }

    /**
     * Create an instance of {@link Facet }
     * 
     */
    public Facet createFacet() {
        return new Facet();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link DefaultSuggestionSource }
     * 
     */
    public DefaultSuggestionSource createDefaultSuggestionSource() {
        return new DefaultSuggestionSource();
    }

    /**
     * Create an instance of {@link WordLexicon }
     * 
     */
    public WordLexicon createWordLexicon() {
        return new WordLexicon();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link Implicit }
     * 
     */
    public Implicit createImplicit() {
        return new Implicit();
    }

    /**
     * Create an instance of {@link AnyCtsElement }
     * 
     */
    public AnyCtsElement createAnyCtsElement() {
        return new AnyCtsElement();
    }

    /**
     * Create an instance of {@link GeoElemPair }
     * 
     */
    public GeoElemPair createGeoElemPair() {
        return new GeoElemPair();
    }

    /**
     * Create an instance of {@link Joiner }
     * 
     */
    public Joiner createJoiner() {
        return new Joiner();
    }

    /**
     * Create an instance of {@link Anchor }
     * 
     */
    public Anchor createAnchor() {
        return new Anchor();
    }

    /**
     * Create an instance of {@link Metrics }
     * 
     */
    public Metrics createMetrics() {
        return new Metrics();
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link Empty }
     * 
     */
    public Empty createEmpty() {
        return new Empty();
    }

    /**
     * Create an instance of {@link ElementQuery }
     * 
     */
    public ElementQuery createElementQuery() {
        return new ElementQuery();
    }

    /**
     * Create an instance of {@link Custom }
     * 
     */
    public Custom createCustom() {
        return new Custom();
    }

    /**
     * Create an instance of {@link com.marklogic.client.config.search.jaxb.Element }
     * 
     */
    public com.marklogic.client.config.search.jaxb.Element createElement() {
        return new com.marklogic.client.config.search.jaxb.Element();
    }

    /**
     * Create an instance of {@link Lon }
     * 
     */
    public Lon createLon() {
        return new Lon();
    }

    /**
     * Create an instance of {@link Parent }
     * 
     */
    public Parent createParent() {
        return new Parent();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link FinishFacet }
     * 
     */
    public FinishFacet createFinishFacet() {
        return new FinishFacet();
    }

    /**
     * Create an instance of {@link SuggestionSource }
     * 
     */
    public SuggestionSource createSuggestionSource() {
        return new SuggestionSource();
    }

    /**
     * Create an instance of {@link Word }
     * 
     */
    public Word createWord() {
        return new Word();
    }

    /**
     * Create an instance of {@link Match }
     * 
     */
    public Match createMatch() {
        return new Match();
    }

    /**
     * Create an instance of {@link GeoAttrPair }
     * 
     */
    public GeoAttrPair createGeoAttrPair() {
        return new GeoAttrPair();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Snippet }
     * 
     */
    public Snippet createSnippet() {
        return new Snippet();
    }

    /**
     * Create an instance of {@link Range }
     * 
     */
    public Range createRange() {
        return new Range();
    }

    /**
     * Create an instance of {@link Bucket }
     * 
     */
    public Bucket createBucket() {
        return new Bucket();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link SortOrder }
     * 
     */
    public SortOrder createSortOrder() {
        return new SortOrder();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link TransformResults }
     * 
     */
    public TransformResults createTransformResults() {
        return new TransformResults();
    }

    /**
     * Create an instance of {@link Constraint }
     * 
     */
    public Constraint createConstraint() {
        return new Constraint();
    }

    /**
     * Create an instance of {@link Collection }
     * 
     */
    public Collection createCollection() {
        return new Collection();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link Plan }
     * 
     */
    public Plan createPlan() {
        return new Plan();
    }

    /**
     * Create an instance of {@link Parse }
     * 
     */
    public Parse createParse() {
        return new Parse();
    }

    /**
     * Create an instance of {@link Lat }
     * 
     */
    public Lat createLat() {
        return new Lat();
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link FacetValue }
     * 
     */
    public FacetValue createFacetValue() {
        return new FacetValue();
    }

    /**
     * Create an instance of {@link Boxes }
     * 
     */
    public Boxes createBoxes() {
        return new Boxes();
    }

    /**
     * Create an instance of {@link Heatmap }
     * 
     */
    public Heatmap createHeatmap() {
        return new Heatmap();
    }

    /**
     * Create an instance of {@link Operator }
     * 
     */
    public Operator createOperator() {
        return new Operator();
    }

    /**
     * Create an instance of {@link Grammar }
     * 
     */
    public Grammar createGrammar() {
        return new Grammar();
    }

    /**
     * Create an instance of {@link Starter }
     * 
     */
    public Starter createStarter() {
        return new Starter();
    }

    /**
     * Create an instance of {@link Term }
     * 
     */
    public Term createTerm() {
        return new Term();
    }

    /**
     * Create an instance of {@link ComputedBucket }
     * 
     */
    public ComputedBucket createComputedBucket() {
        return new ComputedBucket();
    }

    /**
     * Create an instance of {@link Box }
     * 
     */
    public Box createBox() {
        return new Box();
    }

    /**
     * Create an instance of {@link GeoElem.Element }
     * 
     */
    public GeoElem.Element createGeoElemElement() {
        return new GeoElem.Element();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "facet-resolution-time")
    public JAXBElement<Duration> createFacetResolutionTime(Duration value) {
        return new JAXBElement<Duration>(_FacetResolutionTime_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Facet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "facet", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "ResponseFacet")
    public JAXBElement<Facet> createFacet(Facet value) {
        return new JAXBElement<Facet>(_Facet_QNAME, Facet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "snippet-resolution-time")
    public JAXBElement<Duration> createSnippetResolutionTime(Duration value) {
        return new JAXBElement<Duration>(_SnippetResolutionTime_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "return-query")
    public JAXBElement<Boolean> createReturnQuery(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnQuery_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "suggestion-option")
    public JAXBElement<String> createSuggestionOption(String value) {
        return new JAXBElement<String>(_SuggestionOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoElemPair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "geo-elem-pair", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "Geospatial")
    public JAXBElement<GeoElemPair> createGeoElemPair(GeoElemPair value) {
        return new JAXBElement<GeoElemPair>(_GeoElemPair_QNAME, GeoElemPair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "term-option")
    public JAXBElement<String> createTermOption(String value) {
        return new JAXBElement<String>(_TermOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "highlight")
    public JAXBElement<String> createHighlight(String value) {
        return new JAXBElement<String>(_Highlight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "searchable-expression")
    public JAXBElement<String> createSearchableExpression(String value) {
        return new JAXBElement<String>(_SearchableExpression_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElementQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "element-query", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "constraint-type")
    public JAXBElement<ElementQuery> createElementQuery(ElementQuery value) {
        return new JAXBElement<ElementQuery>(_ElementQuery_QNAME, ElementQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Custom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "custom", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "constraint-type")
    public JAXBElement<Custom> createCustom(Custom value) {
        return new JAXBElement<Custom>(_Custom_QNAME, Custom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "concurrency-level")
    public JAXBElement<Long> createConcurrencyLevel(Long value) {
        return new JAXBElement<Long>(_ConcurrencyLevel_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "return-plan")
    public JAXBElement<Boolean> createReturnPlan(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnPlan_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Value }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "value", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "constraint-type")
    public JAXBElement<Value> createValue(Value value) {
        return new JAXBElement<Value>(_Value_QNAME, Value.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "return-similar")
    public JAXBElement<Boolean> createReturnSimilar(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnSimilar_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "return-results")
    public JAXBElement<Boolean> createReturnResults(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnResults_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "Geospatial", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "constraint-type")
    public JAXBElement<Object> createGeospatial(Object value) {
        return new JAXBElement<Object>(_Geospatial_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoElem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "geo-elem", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "Geospatial")
    public JAXBElement<GeoElem> createGeoElem(GeoElem value) {
        return new JAXBElement<GeoElem>(_GeoElem_QNAME, GeoElem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "qtext")
    public JAXBElement<String> createQtext(String value) {
        return new JAXBElement<String>(_Qtext_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "forest")
    public JAXBElement<BigInteger> createForest(BigInteger value) {
        return new JAXBElement<BigInteger>(_Forest_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "properties", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "constraint-type")
    public JAXBElement<Properties> createProperties(Properties value) {
        return new JAXBElement<Properties>(_Properties_QNAME, Properties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "geo-option")
    public JAXBElement<String> createGeoOption(String value) {
        return new JAXBElement<String>(_GeoOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "ResponseFacet")
    public JAXBElement<Object> createResponseFacet(Object value) {
        return new JAXBElement<Object>(_ResponseFacet_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link AdditionalQuery }}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "additional-query")
    public AdditionalQuery createAdditionalQuery(AnyCtsElement value) {
        return new AdditionalQuery(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "quotation")
    public JAXBElement<String> createQuotation(String value) {
        return new JAXBElement<String>(_Quotation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoAttrPair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "geo-attr-pair", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "Geospatial")
    public JAXBElement<GeoAttrPair> createGeoAttrPair(GeoAttrPair value) {
        return new JAXBElement<GeoAttrPair>(_GeoAttrPair_QNAME, GeoAttrPair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Word }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "word", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "constraint-type")
    public JAXBElement<Word> createWord(Word value) {
        return new JAXBElement<Word>(_Word_QNAME, Word.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "fragment-scope")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFragmentScope(String value) {
        return new JAXBElement<String>(_FragmentScope_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyCtsElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "query")
    public JAXBElement<AnyCtsElement> createQuery(AnyCtsElement value) {
        return new JAXBElement<AnyCtsElement>(_Query_QNAME, AnyCtsElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Range }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "range", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "constraint-type")
    public JAXBElement<Range> createRange(Range value) {
        return new JAXBElement<Range>(_Range_QNAME, Range.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "constraint-type")
    public JAXBElement<Object> createConstraintType(Object value) {
        return new JAXBElement<Object>(_ConstraintType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "return-metrics")
    public JAXBElement<Boolean> createReturnMetrics(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnMetrics_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "collection", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "constraint-type")
    public JAXBElement<Collection> createCollection(Collection value) {
        return new JAXBElement<Collection>(_Collection_QNAME, Collection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "debug")
    public JAXBElement<Boolean> createDebug(Boolean value) {
        return new JAXBElement<Boolean>(_Debug_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "return-facets")
    public JAXBElement<Boolean> createReturnFacets(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnFacets_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "options")
    public JAXBElement<Options> createOptions(Options value) {
        return new JAXBElement<Options>(_Options_QNAME, Options.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boxes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "boxes", substitutionHeadNamespace = "http://marklogic.com/appservices/search", substitutionHeadName = "ResponseFacet")
    public JAXBElement<Boxes> createBoxes(Boxes value) {
        return new JAXBElement<Boxes>(_Boxes_QNAME, Boxes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "total-time")
    public JAXBElement<Duration> createTotalTime(Duration value) {
        return new JAXBElement<Duration>(_TotalTime_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "return-constraints")
    public JAXBElement<Boolean> createReturnConstraints(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnConstraints_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "return-qtext")
    public JAXBElement<Boolean> createReturnQtext(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnQtext_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "query-resolution-time")
    public JAXBElement<Duration> createQueryResolutionTime(Duration value) {
        return new JAXBElement<Duration>(_QueryResolutionTime_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "search-option")
    public JAXBElement<String> createSearchOption(String value) {
        return new JAXBElement<String>(_SearchOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "quality-weight")
    public JAXBElement<Double> createQualityWeight(Double value) {
        return new JAXBElement<Double>(_QualityWeight_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "page-length")
    public JAXBElement<Long> createPageLength(Long value) {
        return new JAXBElement<Long>(_PageLength_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "facet-option")
    public JAXBElement<String> createFacetOption(String value) {
        return new JAXBElement<String>(_FacetOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeoElem.Element }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marklogic.com/appservices/search", name = "element", scope = GeoElem.class)
    public JAXBElement<GeoElem.Element> createGeoElemElement(GeoElem.Element value) {
        return new JAXBElement<GeoElem.Element>(_GeoElemElement_QNAME, GeoElem.Element.class, GeoElem.class, value);
    }

}