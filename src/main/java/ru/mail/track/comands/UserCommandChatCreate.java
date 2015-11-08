package ru.mail.track.comands;

import ru.mail.track.connection.ConnectionHandler;

import java.io.IOException;

public class UserCommandChatCreate implements UserBaseCommand {

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
        return "create new chat with specified users usage \\chat_create usersId [userId] ...";
    }
}