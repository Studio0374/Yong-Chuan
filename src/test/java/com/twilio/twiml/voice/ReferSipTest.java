/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import org.junit.Assert;
import org.junit.Test;

import java.net.URI;

/**
 * Test class for {@link ReferSip}
 */
public class ReferSipTest {
    @Test
    public void testElementWithParams() {
        ReferSip elem = new ReferSip.Builder(URI.create("https://example.com")).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Sip>https://example.com</Sip>",
            elem.toXml()
        );
    }
}