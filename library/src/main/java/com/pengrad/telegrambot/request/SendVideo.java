package com.pengrad.telegrambot.request;

import com.pengrad.telegrambot.impl.TelegramBotClient;
import com.pengrad.telegrambot.model.MessageEntity;
import com.pengrad.telegrambot.model.request.ParseMode;

import java.io.File;

/**
 * stas
 * 5/1/16.
 */
public class SendVideo extends AbstractMultipartRequest<SendVideo> {

    public SendVideo(TelegramBotClient api, Object chatId, String video) {
        super(api, chatId, video);
    }

    public SendVideo(TelegramBotClient api, Object chatId, File video) {
        super(api, chatId, video);
    }

    public SendVideo(TelegramBotClient api, Object chatId, byte[] video) {
        super(api, chatId, video);
    }

    public SendVideo duration(int duration) {
        return add("duration", duration);
    }

    public SendVideo width(int width) {
        return add("width", width);
    }

    public SendVideo height(int height) {
        return add("height", height);
    }

    /**
     * @deprecated Use thumbnail instead
     */
    @Deprecated
    public SendVideo thumb(byte[] thumb) {
        return thumbnail(thumb);
    }

    /**
     * @deprecated Use thumbnail instead
     */
    @Deprecated
    public SendVideo thumb(File thumb) {
        return thumbnail(thumb);
    }

    public SendVideo thumbnail(byte[] thumbnail) {
        return super.thumbnail(thumbnail);
    }

    public SendVideo thumbnail(File thumbnail) {
        return super.thumbnail(thumbnail);
    }

    public SendVideo caption(String caption) {
        return add("caption", caption);
    }

    public SendVideo parseMode(ParseMode parseMode) {
        return add("parse_mode", parseMode.name());
    }

    public SendVideo captionEntities(MessageEntity... entities) {
        return add("caption_entities", entities);
    }

    public SendVideo supportsStreaming(boolean supportsStreaming) {
        return add("supports_streaming", supportsStreaming);
    }

    public SendVideo hasSpoiler(boolean has_spoiler) {
        return add("has_spoiler", has_spoiler);
    }

    @Override
    protected String getFileParamName() {
        return "video";
    }

    @Override
    public String getDefaultFileName() {
        return ContentTypes.VIDEO_FILE_NAME;
    }

    @Override
    public String getDefaultContentType() {
        return ContentTypes.VIDEO_MIME_TYPE;
    }
}
