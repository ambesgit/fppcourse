package lessonseven;

public class ProblemTwo {
	public double giveDollar(double dollar){		
		return StaticInnerClass.currencyConvertor(dollar);
	}
	static class StaticInnerClass{
		public static double currencyConvertor(double d){
			
			return d*18;
		}
		}
	}


