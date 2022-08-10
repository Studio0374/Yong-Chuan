/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest;

public enum Domains {
    ACCOUNTS("accounts"),
    API("api"),
    AUTOPILOT("autopilot"),
    CHAT("chat"),
    CONVERSATIONS("conversations"),
    EVENTS("events"),
    FLEXAPI("flex-api"),
    FRONTLINEAPI("frontline-api"),
    INSIGHTS("insights"),
    IPMESSAGING("ip-messaging"),
    LOOKUPS("lookups"),
    MEDIA("media"),
    MESSAGING("messaging"),
    MONITOR("monitor"),
    NOTIFY("notify"),
    NUMBERS("numbers"),
    PREVIEW("preview"),
    PRICING("pricing"),
    PROXY("proxy"),
    ROUTES("routes"),
    SERVERLESS("serverless"),
    STUDIO("studio"),
    SYNC("sync"),
    TASKROUTER("taskrouter"),
    TRUNKING("trunking"),
    TRUSTHUB("trusthub"),
    VERIFY("verify"),
    VIDEO("video"),
    VOICE("voice"),
    WIRELESS("wireless"),
    SUPERSIM("supersim"),
    BULKEXPORTS("bulkexports"),
    MICROVISOR("microvisor");

    private final String value;

    private Domains(final String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}