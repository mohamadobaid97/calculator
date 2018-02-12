package calculator;

public class Model {




public Model (){};



double getValue(double x , double y , char oper){

	
	if (oper == '+' ) return x+y;
	if (oper == '-' ) return x-y;
	if (oper == '/' )  return x/y;
	if (oper == '*' )  return x*y;
	if (oper == '%' )  return x%y;
	if (oper == '\u221A')  return (Math.sqrt(y));
	return x;


}

}
