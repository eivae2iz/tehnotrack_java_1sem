package ru.mail.track.comands;

import ru.mail.track.connection.ConnectionHandler;
import ru.mail.track.storage.Message;

import java.io.IOException;

public class UserCommandFind implements UserBaseCommand {
    @Override
    public Result perform(ConnectionHandler connectionHandler, CommandsData command) {
        try {
            connectionHandler.send(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getDescription() {
        return "find messages in history using regex";
    }
}