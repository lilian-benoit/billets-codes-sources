package fr.lbenoit.billets.codes_sources.network.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTestMain {
	public static void main (String [] args) throws UnknownHostException {
		InetAddress adr = InetAddress.getByName("www.edf.fr");
		System.out.println(" - " + adr.getHostName() + " -> " + adr.getHostAddress());

		adr = InetAddress.getByName("www.wikipedia.fr");
		System.out.println(" - " + adr.getHostName() + " -> " + adr.getHostAddress());
	}
}
