package fr.lbenoit.billets.codes_sources.tests.securite;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

import fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre.modele.Cercle;

public class AbstractSerialisationTest {

	protected static final String FICHIER_SERIALISATION = "target/serial.data";
	protected static Cercle cercle = null;
	
	public AbstractSerialisationTest() {
		super();
	}

	protected void chargementSansControle(ObjectInputFilter filtre) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHIER_SERIALISATION));) {
			if (filtre != null) {
				ois.setObjectInputFilter(filtre);
			}
			Object f = ois.readObject();
			System.out.println(f.toString());
			assertTrue(f.equals(cercle), "La première forme devrait être le cercle");
			f = ois.readObject();
			System.out.println(f.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			fail("Une erreur s'est produite : " + e.getMessage());
		}
	}

	protected void chargementAvecControle(ObjectInputFilter filtre) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHIER_SERIALISATION));) {
			if (filtre != null) {
				ois.setObjectInputFilter(filtre);
			}
			Object f = ois.readObject();
			System.out.println(f.toString());
			assertTrue(f.equals(cercle), "La première forme devrait être le cercle");
			try {
				f = ois.readObject();
				fail("Une exception aurait dû se produire.");
			} catch (InvalidClassException ice) {
				System.out.println(ice.getMessage());
				assertTrue(ice.getMessage().contains("REJECTED"));
			}
			System.out.println(f.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			fail("Une erreur s'est produite : " + e.getMessage());
		}
	}

}