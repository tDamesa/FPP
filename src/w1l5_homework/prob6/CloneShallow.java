package w1l5_homework.prob6;

class Computer implements Cloneable {
	String manifacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;

	public Computer(String manifacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		this.manifacturer = manifacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
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

class Person implements Cloneable {
	String name;
	Computer obj;

	Person(String name, Computer obj) {
		this.name = name;
		this.obj = obj;
	}

	public void setObj(Computer obj) {
		this.obj = obj;
	}

	// Shallow Clone
	public Object clone() throws CloneNotSupportedException {

		Person clone = (Person) super.clone();
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
		return "Name: " + name + "Manifacturer: " + obj.getManifacturer() + "Processor: " + obj.getProcessor();
	}
}
