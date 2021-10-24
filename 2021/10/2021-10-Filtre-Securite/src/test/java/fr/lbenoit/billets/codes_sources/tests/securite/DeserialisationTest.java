package fr.lbenoit.billets.codes_sources.tests.securite;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre.modele.Cercle;
import fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre.modele.Point;
import fr.lbenoit.billets.codes_sources.securite.filtre.LoggerFiltre;
import fr.lbenoit.billets.codes_sources.securite.filtre.MonFiltre;
import fr.lbenoit.billets.codes_sources.securite.intrus.Intrus;

public class DeserialisationTest extends AbstractSerialisationTest {

	@BeforeAll
	public static void initialiseFichierSerialisation() {
		Point c = new Point(4, 5);
		cercle = new Cercle(c, 20);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHIER_SERIALISATION));) {
			oos.writeObject(cercle);
			oos.writeObject(new Intrus("INTRUSION"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void chargementFiltreByChaine() {
		ObjectInputFilter filtre = ObjectInputFilter.Config
				.createFilter("fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre.modele*;!*");
		chargementAvecControle(filtre);
	}

	@Test
	public void chargementFiltreByClasseSpecifique() {
		ObjectInputFilter filtre = new MonFiltre();
		chargementAvecControle(filtre);
	}

	@Test
	public void chargementFiltreAvecLogger() {
		ObjectInputFilter filtre = new LoggerFiltre();
		chargementSansControle(filtre);
	}

}
