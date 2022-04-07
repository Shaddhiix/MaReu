package com.example.mareu.model;

import java.io.Serializable;

public class Meeting implements Serializable {

    private String nameMeeting;

    private String nameRoom;

    private String dateMeeting;

    private String timeMeeting;

    private String personList;

    public Meeting(String nameMeeting, String nameRoom, String dateMeeting, String timeMeeting, String personList) {
        this.nameMeeting = nameMeeting;
        this.nameRoom = nameRoom;
        this.dateMeeting = dateMeeting;
        this.timeMeeting = timeMeeting;
        this.personList = personList;
    }

    public String getNameMeeting() {
        return nameMeeting;
    }

    public void setNameMeeting(String nameMeeting) {
        this.nameMeeting = nameMeeting;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getDateMeeting() {
        return dateMeeting;
    }

    public void setDateMeeting(String dateMeeting) {
        this.dateMeeting = dateMeeting;
    }

    public String getTimeMeeting() {
        return timeMeeting;
    }

    public void setTimeMeeting(String timeMeeting) {
        this.timeMeeting = timeMeeting;
    }

    public String getPersonList() {
        return personList;
    }

    public void setPersonList(String personList) {
        this.personList = personList;
    }
}
