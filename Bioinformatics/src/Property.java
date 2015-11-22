
public class Property implements Comparable<Property> {
	String propertyValue;
	int column;
	
	public Property(String a, int b) {
		propertyValue = a;
		column = b;
	}
	@Override
	public int compareTo(Property p) {
		return Double.valueOf(this.propertyValue).compareTo(Double.valueOf(p.propertyValue));
	}
}
