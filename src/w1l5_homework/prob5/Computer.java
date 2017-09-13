package w1l5_homework.prob5;

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

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public double computePower() {
		return ramSize * processorSpeed;
	}

	// Override toString method
	@Override
	public String toString() {
		return "[" + "Manifacturer: " + manifacturer + "Processor: " + processor + "Ram Size: " + ramSize
				+ "Disk Size: " + diskSize + "Processor Speed: " + processorSpeed + "]";
	}

	// Override equals method
	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (!(ob instanceof Computer))
			return false;
		Computer obj = (Computer) ob;
		boolean isEqual = obj.processor == this.processor && obj.ramSize == this.ramSize
				&& obj.diskSize == this.diskSize;
		return isEqual;
	}
	// Override hashCode
	@Override
	public int hashCode() {
		int hash = 10;
		hash = hash + processor.hashCode() + Integer.valueOf(ramSize).hashCode() + Integer.valueOf(diskSize).hashCode();
		return hash;
	}

}
