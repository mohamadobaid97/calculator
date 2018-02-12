package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;

public class calTest {
 
	Controller controller = new Controller ();
	
	Model model = new Model ();
    
	String result ;
	
	
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void test() {
		
		controller.addModel(model);
		
		controller.setEquationFromTestFile ("5/4=");
		 result = controller.GetResult();
		 System.out.println("\n"+result);
     
		controller.setEquationFromTestFile("4/0=");
	     result = controller.GetResult();
		 System.out.println("\n"+result);

	    controller.setEquationFromTestFile("-3*-9=");
	    result = controller.GetResult();
		 System.out.println("\n"+result);

		controller.setEquationFromTestFile("3*-9=");
		 result = controller.GetResult();
		 System.out.println("\n"+result);

	    controller.setEquationFromTestFile('\u221A'+"-8=");
	     result = controller.GetResult();
		 System.out.println("\n"+result);

		 
		 controller.setEquationFromTestFile("-8+*9=");
	     result = controller.GetResult();
		 System.out.println("\n"+result);
		 
		 
		 controller.setEquationFromTestFile("7+/*2+6=");
	     result = controller.GetResult();
		 System.out.println("\n"+result);

	}

}
