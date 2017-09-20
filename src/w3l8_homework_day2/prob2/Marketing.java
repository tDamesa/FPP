package w3l8_homework_day2.prob2;

public class Marketing {
	String employeename;
	String productname;
	double salesamount;

	public Marketing(String employeename, String productname, double salesamount) {
		super();
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	@Override
	public String toString() {
		return "employeename=" + employeename + ", productname=" + productname + ", salesamount=" + salesamount;
	}

	@Override
	public boolean equals(Object o) {

		if (o == null)
			return false;
		if (!(o instanceof Marketing))
			return false;

		Marketing m = (Marketing) o;
		boolean isEqual = this.employeename == m.employeename && this.salesamount == m.salesamount;
		return isEqual;

	}
}
