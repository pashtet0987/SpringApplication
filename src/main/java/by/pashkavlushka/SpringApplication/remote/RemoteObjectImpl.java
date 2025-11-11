/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package by.pashkavlushka.SpringApplication.remote;

/**
 *
 * @author User
 */
public class RemoteObjectImpl implements RemoteObject{

    @Override
    public int plus(int first, int second) {
        return first + second;
    }

    @Override
    public int minus(int first, int second) {
        return first - second;
    }

    @Override
    public int devide(int first, int second) {
        return first / second;
    }

    @Override
    public int multiply(int first, int second) {
        return first * second;
    }
    
}
