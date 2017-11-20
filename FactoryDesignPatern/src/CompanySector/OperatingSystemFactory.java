package CompanySector;

public class OperatingSystemFactory {
	public OS Factory(String s ){
		
		if(s.equals("Open"))
		return new Android();
		
		else if (s.equals("Secret")) 
			return new IOS();
		
			else 
			return new Windows();
				
	}
}
