package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.DC;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.VCARD;

public class writeFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Model myModel = createModel();
		
		File file1 = new File("./FileTest/testXML.xml");
		if(!file1.exists()){
			file1.createNewFile();
		}
		
		File file2 = new File("./FileTest/testRDF.xml");
		if(!file1.exists()){
			file1.createNewFile();
		}
		
		File file3 = new File("./FileTest/testNT.xml");
		if(!file1.exists()){
			file1.createNewFile();
		}
		
		OutputStream out1 = new FileOutputStream(file1);
		OutputStream out2 = new FileOutputStream(file2);
		OutputStream out3 = new FileOutputStream(file3);
		
		myModel.write(out1);
		myModel.write(out2, "RDF/XML-ABBREV");
		myModel.write(out3, "N-TRIPLE");
		
	}
	
	public static Model createModel(){
		
		// some definitions
        String personURI    = "http://iscas/HuYuanzhe";
        String givenName    = "Yuanzhe";
        String familyName   = "Hu";
        String fullName     = givenName + " " + familyName;
        String age = "18";
        String sex = "male";
        String email = "yuanzhe@iscas.ac.cn";
        String phone = "13426241537";
        String myProperty = "MyProperty";
        
        // create an empty model
        Model model = ModelFactory.createDefaultModel();
        // create property
        Property myAge = model.createProperty(myProperty, "AGE");
        Property mySex = model.createProperty(myProperty, "SEX");
        
        
        // create the resource
        //   and add the properties cascading style
        Resource johnSmith 
          = model.createResource(personURI)
                 .addProperty(VCARD.FN, fullName)
                 .addProperty(VCARD.N, 
                              model.createResource()
                                   .addProperty(VCARD.Given, givenName)
                                   .addProperty(VCARD.Family, familyName))
                 .addProperty(VCARD.EMAIL, email)
                 .addProperty(VCARD.TEL, phone);
                 //.addProperty(myAge, age)
                 //.addProperty(mySex, sex);
        
        return model;
	}

}
