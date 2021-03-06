package com.company.namozVaqtlariViloyatlarMenu.viloyatlar;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Qashqadaryo {

    public SendMessage sendTextMessage(Message message){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Qaysi shahar yoki tumanni tanlaysiz: ");
        sendMessage.setParseMode(ParseMode.MARKDOWN);
        sendMessage.setChatId(String.valueOf(message.getChatId()));

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setSelective(true);
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        KeyboardRow keyboardRow2 = new KeyboardRow();
        KeyboardRow keyboardRow3 = new KeyboardRow();
        KeyboardRow keyboardRow4 = new KeyboardRow();
        KeyboardRow keyboardRow5 = new KeyboardRow();
        keyboardRow1.add("Qarshi shahri");
        keyboardRow1.add("Shahrisabz tumani");
        keyboardRow2.add("Dehqonobod tumani");
        keyboardRow2.add("G'ozor tumani");
        keyboardRow1.add("Muborak tumani");
        keyboardRow5.add("\uD83D\uDD19 Orqaga");
        keyboardRow5.add("\uD83D\uDD1D Asosiy Menyu");
        keyboardRowList.add(keyboardRow1);
        keyboardRowList.add(keyboardRow2);
        keyboardRowList.add(keyboardRow3);
        keyboardRowList.add(keyboardRow4);
        keyboardRowList.add(keyboardRow5);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
}
