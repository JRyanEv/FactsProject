package facts;

public class Controller {

	private static Fact factObjectController;
	
	protected Model modelController;
	
	protected View viewController;

	
	public Fact getRandomFact(){

			factObjectController = Model.getRandomFact();
			
			View.setFactArea(factObjectController);
			
			return factObjectController;
	}	

    // Controller sets view
    public void setView(View viewIN){
    	
    	this.viewController = viewIN;
    }
	
	// Controller sets model
    public void setModel(Model modelIN){
    	
    	this.modelController = modelIN;
    }
     

    
}