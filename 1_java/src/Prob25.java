
public class Prob25 {

	
		private String name="no name";
		private int korean=0;
		private int english=0;
		private int math=0;
		private int science=0;
		
		public Prob25() {}
		public Prob25(String name, int korean, int english,int math,
				int science) {
			this.name=name;
			this.korean=korean;
			this.english=english;
			this.math=math;
			this.science=science;
		}
				
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKorean() {
			return korean;
		}
		public void setKorean(int korean) {
			this.korean = korean;
		}
		public int getEnglish() {
			return english;
		}
		public void setEnglish(int english) {
			this.english = english;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public int getScience() {
			return science;
		}
		public void setScience(int science) {
			this.science = science;
		}
		
		public double getAvg(int korean,int english,int math,int science) {
			double result=(korean+english+math+science)/4;
			return result;
		}
		
		public char getGrade(double result) {
			if (result >=90 )
				return 'A';
			else if (result >= 70)
				return 'B';
			else if (result >= 50)
				return 'C';
			else if (result >= 30)
				return 'D';
			else 
				return 'F';
		}
	

}
