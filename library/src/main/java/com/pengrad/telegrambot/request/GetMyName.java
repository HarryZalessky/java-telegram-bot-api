package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.response.GetMyNameResponse;

public class GetMyName extends BaseRequest<GetMyName, GetMyNameResponse> {

    public GetMyName(TelegramBotClient api) {
        super(api, GetMyNameResponse.class);
    }

    /**
     * 
     * @param languageCode A two-letter ISO 639-1 language code or an empty string
     * @return
     */
    public GetMyName languageCode(String languageCode) {
        add("language_code", languageCode);
        return this;
    }
}
