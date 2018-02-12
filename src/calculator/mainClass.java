package calculator;

public class mainClass {
	public static void main (String args []){
		
		
		InterFace v = new InterFace ();
		v.setVisible(true);
		  
		Controller c = new Controller();
	//	
		Model m = new Model ();

		c.addView(v);
		v.addController(c);
		c.addModel(m);
	}

}
