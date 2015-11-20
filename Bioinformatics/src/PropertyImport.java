import java.util.ArrayList;


public class PropertyImport {
	public String[] properties;
	public Property[] finalprops = new Property[269];
	
	public PropertyImport(String s){	
		properties = s.split("	");
		setProperties();
	}
	
	public void setProperties() {
	
		for(int i = 0; i < properties.length; i++)
		{
			Property a = new Property(properties[i], i);
			finalprops[i] = a;
		}
	}
	
}
