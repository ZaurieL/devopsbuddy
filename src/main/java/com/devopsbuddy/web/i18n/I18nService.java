package com.devopsbuddy.web.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by rodrigodiaz on 1/23/19.
 */
@Service
public class I18nService {

    /* The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(I18nService.class);

    @Autowired
    public MessageSource messageSource;

    public String getMessage(String messageId) {
        LOG.info("Returning message for messageID {}" , messageId);
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    public String getMessage(String messageId, Locale locale) {
        return messageSource.getMessage(messageId, null, locale);
    }

}
