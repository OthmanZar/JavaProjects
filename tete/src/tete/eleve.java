package tete;

import java.util.Random;

public class eleve {
private int age ;
 private String name;
private double moy ; 
Random r = new  Random ();


public eleve () {
	 
	//this.age=r.nextInt();
	//this.name=r.toString();
	//this.moy=r.nextInt(20);

}



public void setAge(int age) {
	this.age = age;
}
	public int getAge() {
		return age;
	}
  

public void setMoy(double moy) {
	this.moy = moy;
}
public double getMoy() {
	return moy;
}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
}
