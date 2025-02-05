package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.response.SendResponse;

/**
 * stas
 * 5/1/16.
 */
public class ForwardMessage extends BaseRequest<ForwardMessage, SendResponse> {

    public ForwardMessage(TelegramBotClient api, Object chatId, Object fromChatId, int messageId) {
        super(api, SendResponse.class);
        add("chat_id", chatId).add("from_chat_id", fromChatId).add("message_id", messageId);
    }

    public ForwardMessage messageThreadId(Integer messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    public ForwardMessage disableNotification(boolean disableNotification) {
        return add("disable_notification", disableNotification);
    }
}
