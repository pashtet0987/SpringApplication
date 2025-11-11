/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package by.pashkavlushka.SpringApplication.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author User
 */
public interface RemoteObject extends Remote {
    int plus(int first, int second) throws RemoteException;
    int minus(int first, int second) throws RemoteException;
    int devide(int first, int second)throws RemoteException;
    int multiply(int first, int second)throws RemoteException;
}
