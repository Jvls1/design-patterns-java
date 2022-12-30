package org.jojo.creational.factorymethod;

import org.jojo.creational.factorymethod.message.Message;
import org.jojo.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
