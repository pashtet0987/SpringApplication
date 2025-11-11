package by.pashkavlushka.SpringApplication;

import by.pashkavlushka.SpringApplication.remote.RemoteObject;
import by.pashkavlushka.SpringApplication.remote.RemoteObjectImpl;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		SpringApplication.run(Application.class, args);
                
                RemoteObject object = new RemoteObjectImpl();
                
                Remote remote = UnicastRemoteObject.exportObject(object, 1234);
                
                Registry registry = LocateRegistry.createRegistry(1234);
                registry.bind("calculator", remote);
	}

}
