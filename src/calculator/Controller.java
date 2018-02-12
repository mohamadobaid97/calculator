package calculator;





////////////// this class checks the equation (valid or not ) , if yes it send the equation to model class (operations)
///////////// if not return an error massage .... 






public class Controller {
	protected InterFace V ;
	private String S = "";
	private String result ; 
	private char equation [];
	private Model M;
	
	public void addView (InterFace v){
		V = v ;
	}
	
	public void addModel (Model m){
		M = m;
	}
	public Controller(){
		 
	
	
	}
	
                  /////// /////   to set equation from tow source 
	
	public void setEquationFromTestFile (String s){ S =s ; }
	
	
	public void setEquationFromView (){	S = V.getTextField();}

	
	
	                  /////////   function to check the validation of equation ;;;
	
	
	protected String GetResult (){
		
		
		
	
		equation = S.toCharArray();
		  result = " ";
		  
		  
		  
	                            ///////////////////////// to check the syntax  
		
	
		if (equation [0] == '=' || equation [0] == '+'  || equation [0] == '*' || equation [0] == '/' ||equation [0] == '%'){ result = "Unacceptable format"; return result;}
		if( equation[S.length()-2] == '=' || equation[S.length()-2] == '+' || equation[S.length()-2] == '-' || equation[S.length()-2] == '*' || equation[S.length()-2] == '/' || equation[S.length()-2] == '%'){result = "Unacceptable format";return result;}  
        
	    int i = 0 ;
	    for (int j = 0 ; j <equation.length ; j++){
	    	if (i > 2 ) return "Unacceptable format";
			if (equation [j] == '=' || equation [j] == '+' || equation [j] == '*' || equation [j] == '/' ||equation [j] == '%'||equation [j] == '\u221A'){ i++;}
			
	    }
		
		if (i>2)return "Unacceptable format";             
		
		
		                        ////////////////  to check equation validation 
		
		if (S.contains("/0")){result = "runtime exeption ";return result;}
		if (S.contains('\u221A'+"-")){result = "illogical oparetion ";return result;}
		
		
	                          //////////// now we guarantee that the equation is correct , send it to model class by next function 
		
		
		result =Double.toString( this.sendToModel(S));
		return result;
	}
	
	
	
	
	
	
	////////////// function to split the equation and send it to Model 
	
	
	private double sendToModel (String s){
		
		
        char c , oper = ' ';
		String n1 = "0";
		String n2  = "0" , equ ;
		 int operIndex=0;
		equ = s;
		int i = 0;
		boolean isN1 = true ;
		
		
		
			while (true){ 
				c = equ.charAt(i++);
				if (c == '=')break; 
				//
				
				if (i == 1 && c =='-') { n1 = "-"+n1 ;continue ;}
				if (i == operIndex +1  && c =='-' ) {n2 = "-" + n2;continue;}
				
				//
				if (c == '+' || c=='-' || c == '*' || c=='/' || c=='%' ||c == '\u221A'){ oper = c; operIndex = i;isN1 = false; continue;}
				
				if (isN1 )n1 = n1 +c;
				if(! isN1)n2=n2+c;
				
			   }
			
			
		double x = Double.parseDouble(n1), y =Double.parseDouble(n2);
		return M.getValue(x , y, oper);
		
	}
	

}
