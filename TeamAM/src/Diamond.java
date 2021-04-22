
public class Diamond {
	String name;
	double height =0;
	double length =0;
	
	Diamond(String name,double height,double length){
		this.name = name;
		this.height = height;
		this.length = length;
	}
	
	
	public void width(){
		double width = height*length/2;
		System.out.println(width+"\n");
	}
	
	
	
	

}
