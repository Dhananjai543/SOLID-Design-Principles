package serialization;

import java.io.*;

public class MainClass {

    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person(12, "Dhananjai", "126378bhds32");

        //Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\DHANANJ1\\Documents\\cor\\person.ser"))){
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\DHANANJ1\\Documents\\cor\\person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized object is : " + deserializedPerson.toString());
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
