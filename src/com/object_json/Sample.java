package com.object_json;

//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Sample {
	private int pid;
	private String pname;
	private double price;
	public Sample() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Sample [pid=" + pid + ", pname=" + pname + ", price=" + price
				+ "]";
	}
	

}
