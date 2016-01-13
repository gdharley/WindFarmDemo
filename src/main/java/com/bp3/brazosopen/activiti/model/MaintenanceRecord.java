package com.bp3.brazosopen.activiti.model;

import com.bp3.brazosopen.activiti.ActivitiModel;

import java.io.Serializable;

/**
 * @author gdharley
 */
@ActivitiModel
public class MaintenanceRecord implements Serializable {
    long id;
    String technician;
    String description;
    String status;
    String type;
    String tower;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTechnician() {
        return technician;
    }
    public void setTechnician(String name) {
        this.technician = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getTower() {
        return tower;
    }
    public void setTower(String tower) {
        this.tower = tower;
    }
    
}
