package com.noahhendrickson.warcoat.common.events;

import java.util.UUID;

public class WarcoatEvent {

    private EventType eventType;
    private UUID correlationId;
    private long timestamp;
    private WarcoatEventPayload payload;

    public WarcoatEvent() {
    }

    public WarcoatEvent(EventType eventType, UUID correlationId, long timestamp, WarcoatEventPayload payload) {
        if (!EventType.PAYLOAD_TYPES.get(eventType).isAssignableFrom(payload.getClass())) {
            throw new IllegalArgumentException("Payload type does not match event type");
        }

        this.eventType = eventType;
        this.correlationId = correlationId;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public UUID getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(UUID correlationId) {
        this.correlationId = correlationId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public WarcoatEventPayload getPayload() {
        return payload;
    }

    public void setPayload(WarcoatEventPayload payload) {
        this.payload = payload;
    }
}
