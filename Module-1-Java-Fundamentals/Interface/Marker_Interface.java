import java.io.*;

// By implementing Serializable interface
// we make sure that state of instances of class A
// can be saved in a file.
class ms implements Serializable {
    int i;
    String s;

    // A class constructor
    public ms(int i, String s)
    {
        this.i = i;
        this.s = s;
    }
}
//The Serializable interface in Java is a marker interface available in the java.io package. It is used to indicate
// that the objects of a class can be converted into a byte stream (serialization) and later reconstructed back into
// objects (deserialization). Since it is a marker interface, it does not contain any methods or fields and is mainly
// used for object persistence and data transfer.
//
//Works with ObjectOutputStream and ObjectInputStream.
//Helps save and restore the state of an object.
//Allows objects to be transmitted over a network.
public class Marker_Interface {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
        ms a = new ms(20, "Krupen");

        // Serializing 'a'
        FileOutputStream fos
                = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos
                = new ObjectOutputStream(fos);
        oos.writeObject(a);

        // De-serializing 'a'
        FileInputStream fis
                = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ms b = (ms)ois.readObject(); // down-casting object

        System.out.println(b.i + " " + b.s);

        // closing streams
        oos.close();
        ois.close();
    }
}
