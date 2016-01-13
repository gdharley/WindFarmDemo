/*******************************************************************************
 * Licensed Materials - Property of BP3
 *
 *   Brazos-Open
 *
 *  Copyright © BP3 Global Inc. 2015. All Rights Reserved.
 *  This software is subject to copyright protection under
 *  the laws of the United States and other countries.
 ******************************************************************************/

package com.bp3.brazosopen.activiti.model;

import com.bp3.brazosopen.activiti.ActivitiModel;

import java.io.Serializable;
import java.util.Date;

/**
 * @author dparish
 */
@ActivitiModel
public class Person implements Serializable {
    long id;
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    Date birthday;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
