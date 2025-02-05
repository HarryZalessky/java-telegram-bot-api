package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.model.Sticker.Format;
import com.pengrad.telegrambot.response.GetFileResponse;

/**
 * Stas Parshin
 * 23 July 2017
 */
public class UploadStickerFile extends AbstractUploadRequest<UploadStickerFile, GetFileResponse> {

    /**
     * @deprecated Use constructor with the InputFile type (since API v6.6)
     */
    @Deprecated
    public UploadStickerFile(TelegramBotClient api, Long userId, Object pngSticker) {
        super(api, GetFileResponse.class, "png_sticker", pngSticker);
        add("user_id", userId);
    }

    /**
     * @param stickerFormat must be one of “static”, “animated”, “video”.
     */
    public UploadStickerFile(TelegramBotClient api, Long userId, Object sticker, Format stickerFormat) {
        super(api, GetFileResponse.class, "sticker", sticker);
        add("user_id", userId);
        add("sticker_format", stickerFormat.name().toLowerCase());
    }


}
