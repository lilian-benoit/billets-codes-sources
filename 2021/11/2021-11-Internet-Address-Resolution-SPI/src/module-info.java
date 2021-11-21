import java.net.spi.InetAddressResolverProvider;

module fr.lbenoit.billes.codes_sources.network {
    exports fr.lbenoit.billets.codes_sources.network.impl;
    provides InetAddressResolverProvider with fr.lbenoit.billets.codes_sources.network.impl.MonResolveurDNSProvider;
}