package filter.v2.common;

public class Constants {
	enum GIAI {
		DB(){
			public String getGiai(){
				return "DB";
			}
		}, G1g;
		
		public String getGiai(){
			return "";
		}
	}
	
	public static void main(String[] args) throws Exception {
		String s1 = "abccd";
		String s2 = "a";
		s2 = s1.replace("cc", "c");
		System.out.println(s2);
		
		System.out.println(s1==s2);
	}
}
