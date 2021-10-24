package fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre.modele.Cercle;
import fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre.modele.Point;
import fr.lbenoit.billets.codes_sources.securite.intrus.Intrus;

public class Programme {

	public static void main(String[] args) {
		Point c = new Point(4, 5);
		Cercle cercle = new Cercle(c, 20);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("target/serial.data"));) {
			oos.writeObject(cercle);
			oos.writeObject(new Intrus("INTRUSION"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("target/serial.data"));) {
			Object f = ois.readObject();
			System.out.println(f.toString());
			f = ois.readObject();
			System.out.println(f.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
