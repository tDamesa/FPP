package w1l3_homework.prob1;

public class Mainprob1 {

	public static void main(String[] args) {
		//Create three objects for Customer class
		Customer C1= new Customer("Abeba", "Des", "2341323");
		Customer C2=new Customer("Tg", "Dames", "1235566");
		Customer C3=new Customer("Mike", "John", "1253679");
		//Objects for Address class
		Address C1AddB=new Address("Chicago", "Chicago", "ambassador", "123453");
		Address C2AddB=new Address("Texas", "huston", "Stree", "123456");
		Address C3AddB=new Address("Florida", "Chicago", "Tigist", "123455");
		Address C1AddS=new Address("Chicago", "Chicago", "geeta", "123457");
		Address C2AddS=new Address("Washington", "huston", "ambassador", "123458");
		Address C3AddS=new Address("DC", "huston", "ambassador", "123459");
		//Set shipping and billing address
		C1.setBillingAdd(C1AddB);
		C1.setShippingAdd(C1AddS);
		C2.setBillingAdd(C2AddB);
		C2.setShippingAdd(C2AddS);
		C3.setBillingAdd(C3AddB);
		C3.setShippingAdd(C3AddS);
		Customer[] arr={C1,C2,C3};
		//Print out the customers whose billingAddress is located in the city of Chicago
	for (int i = 0; i < arr.length; i++) {
		if(arr[i].getBillingAdd().getCity().equals("Chicago")){
			System.out.println(arr[i]);
		}
	}
		
	}

}
/*Output:
Customer [firstName=Abeba, lastName=Des, socialSecurityNum=2341323]
Customer [firstName=Mike, lastName=John, socialSecurityNum=1253679]*/

