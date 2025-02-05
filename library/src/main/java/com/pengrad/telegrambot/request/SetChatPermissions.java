package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.model.ChatPermissions;
import com.pengrad.telegrambot.response.BaseResponse;

/**
 * Stas Parshin
 * 30 July 2019
 */
public class SetChatPermissions extends BaseRequest<SetChatPermissions, BaseResponse> {

    public SetChatPermissions(TelegramBotClient api, Object chatId, ChatPermissions permissions) {
        super(api, BaseResponse.class);
        add("chat_id", chatId).add("permissions", permissions);
    }

    public SetChatPermissions useIndependentChatPermissions(boolean useIndependentChatPermissions) {
        return add("use_independent_chat_permissions", useIndependentChatPermissions);
    }
}
