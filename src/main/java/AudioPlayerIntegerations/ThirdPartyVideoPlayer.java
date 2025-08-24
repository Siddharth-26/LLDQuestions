package AudioPlayerIntegerations;


import org.jdom2.Document;
import org.jdom2.Element;

public class ThirdPartyVideoPlayer {
  public Document playVideo(){
    // Just hard coding for this example. Otherwise this should ideally make calls to the DB and do something etc... and get the XML built.
    Document doc = new Document();
    Element root = new Element("event");
    doc.addContent(root);
    root.addContent(new Element("id").setText("mov-197"));
    root.addContent(new Element("action").setText("play"));
    return doc;
  }
}
