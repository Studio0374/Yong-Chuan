/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Autopilot}
 */
public class AutopilotTest {
    @Test
    public void testElementWithParams() {
        Autopilot elem = new Autopilot.Builder("name").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Autopilot>name</Autopilot>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Autopilot elem = new Autopilot.Builder("name").build();

        Assert.assertEquals(
            Autopilot.Builder.fromXml("<Autopilot>name</Autopilot>").build().toXml(),
            elem.toXml()
        );
    }
}