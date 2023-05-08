package facts;

public class Model {
	
	// File path for my Windows machine
	public static final String xmlFile = "C:/Users/jryan/eclipse-workspace/facts2/src/main/java/facts/data/facts.xml";
	
	public static final String jsFile = "C:/Users/jryan/eclipse-workspace/facts2/src/main/java/facts/facts.js";
	
	// Instantiate model objects
	protected static Parser factParser = new Parser(xmlFile);
	
	protected static FactList factModel = new FactList();
	
	protected static Fact factBuffer = new Fact();;
	
	
	//random fact generator
	public static Fact getRandomFact(){
		
		factModel = factParser.getFactList();
		
		factBuffer = factModel.getRandom();
		
		return factBuffer;
	}
	
}