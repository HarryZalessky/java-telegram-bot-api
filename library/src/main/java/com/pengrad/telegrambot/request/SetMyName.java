package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.response.BaseResponse;

public class SetMyName extends BaseRequest<SetMyName, BaseResponse> {

    public SetMyName(TelegramBotClient api) {
        super(api, BaseResponse.class);
    }
    
    /**
     * 
     * @param name New bot name; 0-64 characters. Pass an empty string to remove the dedicated name for the given language.
     * @return
     */
    public SetMyName name(String name) {
        add("name", name);
        return this;
    }

    /**
     * 
     * @param languageCode A two-letter ISO 639-1 language code. If empty, the name will be shown to all users for whose language there is no dedicated name.
     * @return
     */
    public SetMyName languageCode(String languageCode) {
        add("language_code", languageCode);
        return this;
    }

}
