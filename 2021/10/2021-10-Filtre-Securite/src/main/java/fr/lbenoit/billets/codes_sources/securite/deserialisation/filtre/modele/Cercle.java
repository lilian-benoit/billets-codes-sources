package fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre.modele;

import java.io.Serializable;
import java.util.Objects;

public class Cercle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Point centre;
	protected int rayon;
	
	public Cercle() {
		centre = new Point();
		rayon = 0;
	}
	
	@Override
	public String toString() {
		return "Cercle [centre=" + centre + ", rayon=" + rayon + "]";
	}

	public Cercle(Point p, int r) {
		this.centre = p;
		this.rayon = r;
	}
	
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public int getRayon() {
		return rayon;
	}
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(centre, rayon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cercle))
			return false;
		Cercle other = (Cercle) obj;
		return Objects.equals(centre, other.centre) && rayon == other.rayon;
	}
}
