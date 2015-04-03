package cn.ac.iscas.ibpteam.jena.vocabulary;

import com.hp.hpl.jena.rdf.model.*;

/**
 * BASE vocabulary class for namespace http://www.iscas.ac.cn/2015/base-rdf/1.0#
 */
public class Base {
	
	protected static final String uri = "http://www.iscas.ac.cn/2015/base-rdf/1.0#";
	
	/**
	 * returns the URI for this schema
	 * 
	 * @return
	 */
	public static String getURI(){
		return uri;
	}
	
	private static Model m = ModelFactory.createDefaultModel();
	
	public static final Resource CATEGORYTYPES = m.createResource(uri + "CATEGORYTYPES");
	public static final Property FILENAME = m.createProperty(uri + "filename");
	public static final Property POSTFIX  = m.createProperty(uri + "postfix");
	public static final Property PATH = m.createProperty(uri + "path");
	public static final Property SIZE = m.createProperty(uri + "size");
	public static final Property URI = m.createProperty(uri + "URI");
	public static final Property CREATETIME = m.createProperty(uri + "createtime");
	public static final Property MODIFYTIME = m.createProperty(uri + "modifytime");
	public static final Property ACCESSTIME = m.createProperty(uri + "accesstime");
	public static final Property CREATEDEVICE = m.createProperty(uri + "createdevice");

}
