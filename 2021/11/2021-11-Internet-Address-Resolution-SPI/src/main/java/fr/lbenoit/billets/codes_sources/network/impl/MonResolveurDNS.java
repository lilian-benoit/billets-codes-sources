package fr.lbenoit.billets.codes_sources.network.impl;

import java.lang.module.Configuration;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;
import java.util.stream.Stream;

public class MonResolveurDNS implements InetAddressResolver {

	private InetAddressResolver delegate;
	
	public MonResolveurDNS(InetAddressResolver delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public Stream<InetAddress> lookupByName(String host, LookupPolicy lookupPolicy) throws UnknownHostException {
		System.out.println("[INFO ] : Appel de la méthode 'MonResolveurDNS::lookupByName'.");
		return this.delegate.lookupByName(host, lookupPolicy);
	}

	@Override
	public String lookupByAddress(byte[] addr) throws UnknownHostException {
		 System.out.println("[INFO ] : Appel de la méthode 'MonResolveurDNS::lookupByAddress'.");
		 return delegate.lookupByAddress(addr);
	}

}
