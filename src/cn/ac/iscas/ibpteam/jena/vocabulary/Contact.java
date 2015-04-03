package cn.ac.iscas.ibpteam.jena.vocabulary;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Contact vocabulary class for namespace http://www.iscas.ac.cn/2015/contact-rdf/1.0#
 */
public class Contact extends Base{
	
	protected static final String uri = "http://www.iscas.ac.cn/2015/contact-rdf/1.0#";
	
	private static Model m = ModelFactory.createDefaultModel();
	
	public static final Property N = m.createProperty(uri + "N");
	public static final Property FN  = m.createProperty(uri + "FN");
	public static final Property SEX = m.createProperty(uri + "SEX");
	public static final Property AGE = m.createProperty(uri + "AGE");
	public static final Property PHOTO = m.createProperty(uri + "PHOTO");
	public static final Property PHONE = m.createProperty(uri + "PHONE");
	public static final Property EMAIL = m.createProperty(uri + "EMAIL");
	public static final Property ORG = m.createProperty(uri + "ORG");
	public static final Property GROUP = m.createProperty(uri + "GROUP");
	public static final Property NAME = m.createProperty(uri + "NAME");
	public static final Property ADR = m.createProperty(uri + "ADR");
	public static final Property TITLE = m.createProperty(uri + "TITLE");
	public static final Property NICKNAME = m.createProperty(uri + "NICKNAME");

}
