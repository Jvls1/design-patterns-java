package org.jojo.factorymethod;

import org.jojo.factorymethod.message.Message;
import org.jojo.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
