package org.jojo.factorymethod;

import org.jojo.factorymethod.message.JSONMessage;
import org.jojo.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
