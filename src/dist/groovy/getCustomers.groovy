/*******************************************************************************
 * Licensed Materials - Property of BP3
 *
 *   Brazos-Open
 *
 *  Copyright © BP3 Global Inc. 2015. All Rights Reserved.
 *  This software is subject to copyright protection under
 *  the laws of the United States and other countries.
 ******************************************************************************/

import com.bp3.brazosopen.activiti.model.Person
import org.fluttercode.datafactory.impl.DataFactory
import com.fasterxml.jackson.databind.ObjectMapper

import java.text.SimpleDateFormat

/**
 * @author dparish
 *
 * This is a simple script designed to list diagram info as json.
 */

def mapper = new ObjectMapper()
// We should try and find out how to do this globally
mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"));

DataFactory df = new DataFactory();
Date minDate = new Date().parse("d/M/yyyy", "25/07/1935")
Date maxDate = new Date().parse("d/M/yyyy", "25/12/1999")
List<Person> people = new ArrayList<>();

Random r = new Random();
for (int i=0;i<input;i++) {
    Person person = new Person();
    person.setId(i);
    person.setFirstName(df.getFirstName());
    person.setLastName(df.getLastName());
    person.setBirthday(df.getDateBetween(minDate,maxDate));
    person.setAddress(df.getAddress());
    int zip = r.nextInt(99999 - 11111) + 11111;
    person.setZip(String.valueOf(zip));
    person.setCity(df.getCity());
    people.add(person);
}

return mapper.writeValueAsString(people)

