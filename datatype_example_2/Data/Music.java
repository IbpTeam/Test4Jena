package Data;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;

import Data.Base;

public class Music extends Base {
	 private static final String BASE = "http://music/"; 
	    //Create a default model
	    private static Model m = ModelFactory.createDefaultModel();
	
	public static final Property ALBUM = m.createProperty( BASE,"album" );
	
	public static final Property AUTHOR = m.createProperty( BASE,"author" );
	
	public static final Property BITRATE = m.createProperty( BASE,"bit_tate" );

}
