import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class AddClient {
	public static void main(String[] args) {
		String AddServerURL = "rmi://" + args[0] + "/AddServer";
		try {
			AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(AddServerURL);
			
			System.out.println("First Number: " + args[1]);
			double d1 = Double.valueOf(args[1]).doubleValue();
			System.out.println("Second Number: " + args[2]);
			double d2 = Double.valueOf(args[2]).doubleValue();
			System.out.println("Sum: " + addServerIntf.add(d1, d2));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
