package cn.ac.iscas.ibpteam.jena.vocabulary;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Music vocabulary class for namespace http://www.iscas.ac.cn/2015/music-rdf/1.0#
 */
public class Music extends Base{
	
	protected static final String uri = "http://www.iscas.ac.cn/2015/music-rdf/1.0#";
	
	private static Model m = ModelFactory.createDefaultModel();
	
	public static final Property ALBUM = m.createProperty(uri + "album");
	public static final Property AUTHOR  = m.createProperty(uri + "author");
	public static final Property FORMAT = m.createProperty(uri + "format");
	public static final Property BITRATE = m.createProperty(uri + "bitrate");
	public static final Property FREQUENCY = m.createProperty(uri + "frequency");
	public static final Property TALB = m.createProperty(uri + "talb");
	public static final Property TIT2 = m.createProperty(uri + "tit2");
	public static final Property TPE1 = m.createProperty(uri + "tpe1");
	public static final Property TDRC = m.createProperty(uri + "tdrc");
	public static final Property APIC = m.createProperty(uri + "apic");
	public static final Property TRACK = m.createProperty(uri + "track");
	public static final Property COMM = m.createProperty(uri + "comm");

}
