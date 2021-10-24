package fr.lbenoit.billets.codes_sources.securite.intrus;

import java.io.Serializable;

public class Intrus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Intrus(String info) {
		super();
		this.info = info;
	}

	String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String toString() {
		return "[INTRUS] Je suis entrée";
	}

}
