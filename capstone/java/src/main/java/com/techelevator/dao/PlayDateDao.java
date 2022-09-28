package com.techelevator.dao;

import com.techelevator.model.PlayDate;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface PlayDateDao {
    //list all pd
    public List<PlayDate> getAllPlayDates();

    //show pd by pd id
    public PlayDate getPlayDateById(int playDateId);

    //local date
    public LocalDateTime getPlayDateByLocalDateAndTime(LocalDateTime playDateLocalDateAndTime);

    //create pd
    public PlayDate createPlayDate(PlayDate playDate);

    //update pd
    public PlayDate updatePlayDate(PlayDate playDateToUpdate);

    //delete pd
    public void deletePlayDate(int playDateId);

    //join a pd
    public void joinPlayDate(PlayDate playDateToJoin);

    //decline a pd
    public void declinePlayDate(PlayDate invitedPlayDate); //should we use PD ID?

}
