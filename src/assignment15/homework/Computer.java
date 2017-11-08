package assignment15.homework;

public class Computer {
	public int mac;
//	public String CPUId;
//	public String MainId;
//	public int HardwareSize;
//	public int MemorySize;
//	public String XiankaId;
	public int price;
	
	public void show(Computer c) {
		System.out.println(c.mac);
//		System.out.println(this.CPUId);
//		System.out.println(this.MainId);
//		System.out.println(this.HardwareSize);
//		System.out.println(this.MemorySize);
//		System.out.println(this.XiankaId);
		System.out.println(c.price);
	}

	public void setId(int mac) {
		this.mac = mac;
	}

//	public void setCPUId(String cPUId) {
//		CPUId = cPUId;
//	}
//
//	public void setMainId(String mainId) {
//		MainId = mainId;
//	}
//
//	public void setHardwareSize(int hardwareSize) {
//		HardwareSize = hardwareSize;
//	}
//
//	public void setMemorySize(int memorySize) {
//		MemorySize = memorySize;
//	}
//
//	public void setXiankaId(String xiankaId) {
//		XiankaId = xiankaId;
//	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}
