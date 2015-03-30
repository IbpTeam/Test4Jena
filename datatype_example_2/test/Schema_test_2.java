package test;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

import Data.Music;

public class Schema_test_2 {
    public static void main(String[] args) {
    	Music music = new Music();
    	Model model = ModelFactory.createDefaultModel();
    	model.createResource("item123")
    	.addProperty(music.URI, "12312312")
    	.addProperty(music.FILENAME,"music")
    	.addProperty(music.POSTFIX, "mp3")
    	.addProperty(music.SIZE, "10242")
    	.addProperty(music.PATH, "/home/xiquan/.custard/music.mp3")
    	.addProperty(music.CREATETIME, "2015-3-26-11-26")
    	.addProperty(music.AUTHOR, "xiquan")
    	.addProperty(music.ALBUM, "NewWave")
    	.addProperty(music.BITRATE, "192");
    	model.write(System.out, "TURTLE");
    }
}
