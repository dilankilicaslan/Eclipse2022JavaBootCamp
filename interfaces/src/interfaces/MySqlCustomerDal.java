package interfaces;
// bir class birden fazla ınterface implement edebilir.
//public class MySqlCustomerDal extends X implements Y,Z şeklinde yazılır 
public class MySqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("mysql eklendi");
		
	}

}
