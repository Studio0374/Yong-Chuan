/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.http.HttpMethod;
import com.twilio.twiml.GenericNode;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;

/**
 * Test class for {@link Record}
 */
public class RecordTest {
    @Test
    public void testEmptyElement() {
        Record elem = new Record.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Record/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Record elem = new Record.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CRecord%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        Record elem = new Record.Builder()
            .action(URI.create("https://example.com"))
            .method(HttpMethod.GET)
            .timeout(1)
            .finishOnKey("finish_on_key")
            .maxLength(1)
            .playBeep(true)
            .trim(Record.Trim.TRIM_SILENCE)
            .recordingStatusCallback(URI.create("https://example.com"))
            .recordingStatusCallbackMethod(HttpMethod.GET)
            .transcribe(true)
            .transcribeCallback(URI.create("https://example.com"))
            .build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Record action=\"https://example.com\" finishOnKey=\"finish_on_key\" maxLength=\"1\" method=\"GET\" playBeep=\"true\" recordingStatusCallback=\"https://example.com\" recordingStatusCallbackMethod=\"GET\" timeout=\"1\" transcribe=\"true\" transcribeCallback=\"https://example.com\" trim=\"trim-silence\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        Record elem = new Record.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Record a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        Record.Builder builder = new Record.Builder();

        builder.addText("Hey no tags!");

        Record elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Record>" +
            "Hey no tags!" +
            "</Record>",
            elem.toXml()
        );
    }

    @Test
    public void testMixedContent() {
        GenericNode.Builder child = new GenericNode.Builder("Child");
        child.addText("content");

        Record.Builder builder = new Record.Builder();

        builder.addText("before");
        builder.addChild(child.build());
        builder.addText("after");

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Record>" +
            "before" +
            "<Child>content</Child>" +
            "after" +
            "</Record>",
            builder.build().toXml()
        );
    }

    @Test
    public void testElementWithGenericNode() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        genericBuilder.addText("Some text");
        GenericNode node = genericBuilder.build();

        Record.Builder builder = new Record.Builder();
        Record elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Record>" +
            "<genericTag>" +
            "Some text" +
            "</genericTag>" +
            "</Record>",
            elem.toXml()
        );
    }
}