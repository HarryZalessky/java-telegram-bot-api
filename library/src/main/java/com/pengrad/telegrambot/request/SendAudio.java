package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.model.MessageEntity;
import com.pengrad.telegrambot.model.request.ParseMode;

import java.io.File;

/**
 * stas
 * 5/2/16.
 */
public class SendAudio extends AbstractMultipartRequest<SendAudio> {

    public SendAudio(TelegramBotClient api, Object chatId, String audio) {
        super(api, chatId, audio);
    }

    public SendAudio(TelegramBotClient api, Object chatId, File audio) {
        super(api, chatId, audio);
    }

    public SendAudio(TelegramBotClient api, Object chatId, byte[] audio) {
        super(api, chatId, audio);
    }

    public SendAudio caption(String caption) {
        return add("caption", caption);
    }

    public SendAudio parseMode(ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendAudio captionEntities(MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendAudio duration(int duration) {
        return add("duration", duration);
    }

    public SendAudio performer(String performer) {
        return add("performer", performer);
    }

    public SendAudio title(String title) {
        return add("title", title);
    }

/**
     * @deprecated Use thumbnail instead
     */
    @Deprecated 
    public SendAudio thumb(byte[] thumb) {
        return thumbnail(thumb);
    }

    /**
     * @deprecated Use thumbnail instead
     */
    @Deprecated 
    public SendAudio thumb(File thumb) {
        return thumbnail(thumb);
    }

    public SendAudio thumbnail(byte[] thumbnail) {
        return super.thumbnail(thumbnail);
    }

    public SendAudio thumbnail(File thumbnail) {
        return super.thumbnail(thumbnail);
    }

    @Override
    protected String getFileParamName() {
        return "audio";
    }

    @Override
    public String getDefaultFileName() {
        return ContentTypes.AUDIO_FILE_NAME;
    }

    @Override
    public String getDefaultContentType() {
        return ContentTypes.AUDIO_MIME_TYPE;
    }
}
