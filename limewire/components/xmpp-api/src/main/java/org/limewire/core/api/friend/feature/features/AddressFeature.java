package org.limewire.core.api.friend.feature.features;

import java.net.URI;
import java.net.URISyntaxException;

import org.limewire.core.api.friend.feature.Feature;
import org.limewire.io.Address;

public class AddressFeature extends Feature<Address> {

    public static final URI ID;

    static {
        try {
            ID = new URI("http://www.limewire.org/address/2008-12-01");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public AddressFeature(Address feature) {
        super(feature, ID);
    }
}
