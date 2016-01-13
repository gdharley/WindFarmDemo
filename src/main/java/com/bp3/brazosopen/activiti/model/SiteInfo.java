package com.bp3.brazosopen.activiti.model;

import com.bp3.brazosopen.activiti.ActivitiModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author gdharley
 */
@ActivitiModel
public class SiteInfo implements Serializable {
    long id;
    String name;
    String description;
    String latitude;
    String longitude;
    String markerLatitude;
    String markerLongitude;
    String markerTitle;
//    ArrayList<String> towers;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMarkerLatitude() {
        return markerLatitude;
    }
    public void setMarkerLatitude(String markerLatitude) {
        this.markerLatitude = markerLatitude;
    }

    public String getMarkerLongitude() {
        return markerLongitude;
    }
    public void setMarkerLongitude(String markerLongitude) {
        this.markerLongitude = markerLongitude;
    }

    public String getMarkerTitle() {
        return markerTitle;
    }
    public void setMarkerTitle(String markerTitle) {
        this.markerTitle = markerTitle;
    }

//    public ArrayList<String> getTowers() {return towers;}
//    public void setTowers(ArrayList<String> towers) {this.towers = towers;}
}
