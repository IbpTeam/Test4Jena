package Data;

import com.hp.hpl.jena.rdf.model.*;

public class Base {
		 private static final String BASE = "http://base/"; 
    //Create a default model
    private static Model m = ModelFactory.createDefaultModel();

public static final Property FILENAME = m.createProperty( BASE,"filename" );

public static final Property SIZE = m.createProperty(BASE,"size" );

public static final Property POSTFIX  = m.createProperty(BASE,"postfix" );

public static final Property PATH = m.createProperty(BASE,"path" );

public static final Property URI = m.createProperty(BASE,"uri" );

public static final Property CREATETIME = m.createProperty(BASE,"createtime" );
}
