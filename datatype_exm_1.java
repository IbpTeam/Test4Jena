package test;


import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ResourceFactory;

public class schema_test {
	private static final String BASE = "http://music/"; 
	public static void main(String[] args) {
		
        Model model = ModelFactory.createDefaultModel();
        
        Resource subject = r("item1234");
        
        model.addLiteral (subject, p("size"), 10);
        model.addLiteral (subject, p("author"), 0.5);
        model.addLiteral (subject, p("album"), (float)0.5);
        model.addLiteral (subject, p("p6"), true);
        model.add (subject, p("full_name"), l("goodsong", XSDDatatype.XSDstring));
        model.add (subject, p("create_time"), l("2012-03-11", XSDDatatype.XSDdate));
        model.add (subject, p("tags"), l("P2Y", XSDDatatype.XSDduration));

        model.setNsPrefix("muisc_instance", BASE);
        model.setNsPrefix("xsd", "http://www.w3.org/2001/XMLSchema#");

        model.write(System.out, "TURTLE");
    }
    private static Resource r ( String localname ) {
        return ResourceFactory.createResource ( BASE + localname );
    }
    
    private static Property p ( String localname ) {
        return ResourceFactory.createProperty ( BASE, localname );
    }

    private static Literal l ( String lexicalform, RDFDatatype datatype ) {
        return ResourceFactory.createTypedLiteral ( lexicalform, datatype );
    }
    
}

