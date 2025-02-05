package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.response.BaseResponse;


public class SetCustomEmojiStickerSetThumbnail extends BaseRequest<SetCustomEmojiStickerSetThumbnail, BaseResponse> {

    public SetCustomEmojiStickerSetThumbnail(TelegramBotClient api, String name) {
        super(api, BaseResponse.class);
        add("name", name);
    }

    /**
     * 
     * @param customEmojiId Custom emoji identifier of a sticker from the sticker set; pass an empty string to drop the thumbnail and use the first sticker as the thumbnail.
     * @return
     */
    public SetCustomEmojiStickerSetThumbnail customEmojiId(String customEmojiId) {
        add("custom_emoji_id", customEmojiId);
        return this;
    }    

}
