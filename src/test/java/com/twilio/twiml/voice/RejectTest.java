/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.GenericNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Reject}
 */
public class RejectTest {
    @Test
    public void testEmptyElement() {
        Reject elem = new Reject.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Reject/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Reject elem = new Reject.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CReject%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        Reject elem = new Reject.Builder().reason(Reject.Reason.REJECTED).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Reject reason=\"rejected\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        Reject elem = new Reject.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Reject a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        Reject.Builder builder = new Reject.Builder();

        builder.addText("Hey no tags!");

        Reject elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Reject>" +
            "Hey no tags!" +
            "</Reject>",
            elem.toXml()
        );
    }

    @Test
    public void testMixedContent() {
        GenericNode.Builder child = new GenericNode.Builder("Child");
        child.addText("content");

        Reject.Builder builder = new Reject.Builder();

        builder.addText("before");
        builder.addChild(child.build());
        builder.addText("after");

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Reject>" +
            "before" +
            "<Child>content</Child>" +
            "after" +
            "</Reject>",
            builder.build().toXml()
        );
    }

    @Test
    public void testElementWithGenericNode() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        genericBuilder.addText("Some text");
        GenericNode node = genericBuilder.build();

        Reject.Builder builder = new Reject.Builder();
        Reject elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Reject>" +
            "<genericTag>" +
            "Some text" +
            "</genericTag>" +
            "</Reject>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Reject elem = new Reject.Builder().reason(Reject.Reason.REJECTED).build();

        Assert.assertEquals(
            Reject.Builder.fromXml("<Reject reason=\"rejected\"/>").build().toXml(),
            elem.toXml()
        );
    }
}