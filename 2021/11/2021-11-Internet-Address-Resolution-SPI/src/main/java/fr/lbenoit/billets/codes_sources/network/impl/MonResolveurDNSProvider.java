package fr.lbenoit.billets.codes_sources.network.impl;

import java.net.spi.InetAddressResolver;
import java.net.spi.InetAddressResolverProvider;

public class MonResolveurDNSProvider extends InetAddressResolverProvider {

	@Override
	public InetAddressResolver get(Configuration configuration) {
		System.out.println("[INFO ] : Le fournisseur 'MonResolveurDNSProvider' est chargé.");
		return new MonResolveurDNS(configuration.builtinResolver());
	}

	@Override
	public String name() {
		return "MonResolveurDNSProvider";
	}

}
