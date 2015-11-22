
//standard deviation class
public class STD implements Comparable<STD>{
	public Double standarddev;
	public int index;
	
	public STD(double s, int index){
		this.standarddev = s;
		this.index = index;
	}
	@Override
	public int compareTo(STD s) {
		return this.standarddev.compareTo(s.standarddev);
	}
	@Override
	public String toString(){
		return "standarddev: " + this.standarddev + " " + "index: " + index;
	}
}
