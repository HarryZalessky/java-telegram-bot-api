package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.SendResponse;

/**
 * Stas Parshin
 * 03 October 2016
 */
public class SetGameScore extends BaseRequest<SetGameScore, BaseResponse> {

    public SetGameScore(TelegramBotClient api, long userId, int score, Object chatId, int messageId) {
        super(api, SendResponse.class);
        add("user_id", userId).add("score", score).add("chat_id", chatId).add("message_id", messageId);
    }

    public SetGameScore(TelegramBotClient api, long userId, int score, String inlineMessageId) {
        super(api, BaseResponse.class);
        add("user_id", userId).add("score", score).add("inline_message_id", inlineMessageId);
    }

    public SetGameScore force(boolean force) {
        return add("force", force);
    }

    public SetGameScore disableEditMessage(boolean disableEditMessage) {
        return add("disable_edit_message", disableEditMessage);
    }
}
