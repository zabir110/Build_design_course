package UserSector;
import CompanySector.OS;
import CompanySector.OperatingSystemFactory;
public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory object=new OperatingSystemFactory();
		OS obj =object.Factory("Open");
		obj.sector();
	}

}
