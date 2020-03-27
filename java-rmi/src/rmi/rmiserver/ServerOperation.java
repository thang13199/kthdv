package rmi.rmiserver;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import rmi.rmiinterface.RMIInterface;

public class ServerOperation extends UnicastRemoteObject implements RMIInterface{
    private static final long serialVersionUID = 1L;

    protected ServerOperation() throws RemoteException {
        super();
    }

    @Override
    public String helloTo(String mssv) throws RemoteException{
        arrayStudent arrayStudent=new arrayStudent();
        arrayStudent.addStudent("Nguyen Ba Thanh",69,"thanh@email.com","0375681025",17021032,"6/9/1996","Ha Noi");
        arrayStudent.addStudent("Nguyen Ba Thang",69,"thanh1@email.com","0375681026",17021033,"7/9/1996","Ha Noi");
        arrayStudent.addStudent("Nguyen Ba Tung",69,"thanh2@email.com","0375681027",17021034,"8/9/1996","Ha Noi");
        arrayStudent.addStudent("Nguyen Ba Tuan",69,"thanh3@email.com","0375681028",17021035,"9/9/1996","Ha Noi");
        arrayStudent.addStudent("Nguyen Ba Kien",69,"thanh4@email.com","0375681029",17021036,"10/9/1996","Ha Noi");
        System.err.println(mssv + " is trying to contact!");
        return arrayStudent.getStudentbyMssv(Integer.parseInt(mssv));
    }

    public static void main(String[] args){
        try {
            Naming.rebind("//localhost/MyServer", new ServerOperation());
            System.err.println("Server ready");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
