package designpatterns;

import designpatterns.singleton.SerializedSingleton;

import java.io.*;

public class SerializedSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserialize from file to Object.
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hasCode=" + instanceTwo.hashCode());
        // System.out.println("Your Singleton pattern destroyed by a serialization ...");
        System.out.println("You saved Singleton pattern destroyed by a serialization ...");
    }
}
