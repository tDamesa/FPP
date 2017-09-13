package w1l5_homework.prob6;

//public class CloneDeep {

class Computer1 implements Cloneable {
	String manifacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;

	public Computer1(String manifacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		this.manifacturer = manifacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}

	public Object clone() throws CloneNotSupportedException {
		Computer1 clone = (Computer1) super.clone();
		return clone;
	}

	public int getRamSize() {
		return ramSize;
	}

	public String getManifacturer() {
		return manifacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public double computePower() {
		return ramSize * processorSpeed;
	}

}

class Person1 implements Cloneable {
	String name;
	Computer1 obj1;

	Person1(String name, Computer1 obj1) {
		this.name = name;
		this.obj1 = obj1;
	}

	public void setObj(Computer1 obj1) {
		this.obj1 = obj1;
	}

	// Deep Clone
	public Object clone() throws CloneNotSupportedException {

		Person1 clone = (Person1) super.clone();
		clone.obj1 = (Computer1) this.obj1.clone();
		return clone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name + "Manifacturer: " + obj1.getManifacturer() + "Processor: " + obj1.getProcessor();
	}
}
// }
