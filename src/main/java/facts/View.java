package facts;

public class View {

    protected static void setFactArea(Fact factIN){
    	
    	String factString = factIN.getText();
    	
    	MVCWrapper.factField.setText(factString);
    	
    }

}