package org.jojo.creational.factorymethod;

import org.jojo.creational.factorymethod.message.JSONMessage;
import org.jojo.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
