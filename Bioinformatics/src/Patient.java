
public class Patient {
	public String[] properties;
	
	public Patient(String s){
		/*String[] temp = s.split(" ");
		for(int i=0; i<temp.length; i++){
			properties[i] = temp[i];
			System.out.println(properties[i]);
		}*/
		
		properties = s.split("	");
	}
}
