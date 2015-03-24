package test;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.vocabulary.VCARD;

public class HelloWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// some definitions
        String personURI    = "http://somewhere/JohnSmith";
        String givenName    = "John";
        String familyName   = "Smith";
        String fullName     = givenName + " " + familyName;
        // create an empty model
        Model model = ModelFactory.createDefaultModel();

        // create the resource
        //   and add the properties cascading style
        Resource johnSmith 
          = model.createResource(personURI)
                 .addProperty(VCARD.FN, fullName)
                 .addProperty(VCARD.N, 
                              model.createResource()
                                   .addProperty(VCARD.Given, givenName)
                                   .addProperty(VCARD.Family, familyName));
        
        model.write(System.out);
        System.out.println();
        model.write(System.out, "RDF/XML-ABBREV");
        System.out.println();
        model.write(System.out, "N-TRIPLE");
        
        String directory = "./TDB/testDb";
        Dataset dataset = TDBFactory.createDataset(directory);
        
        Model defaultModel = dataset.getDefaultModel();
        
        defaultModel.add(model);
		defaultModel.commit();
        dataset.close();
        
	}

}
