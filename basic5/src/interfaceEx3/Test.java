package interfaceEx3;

public class Test {

	public static void main(String[] args) {

		InterfaceCImpl interfaceCImpl= new InterfaceCImpl();
		
//		System.out.println(interfaceCImpl);
		
		InterfaceA ia=interfaceCImpl;
		
		ia.methodA();
		
		InterfaceB ib=interfaceCImpl;
		ib.methodB();
		
		InterfaceC ic=interfaceCImpl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
