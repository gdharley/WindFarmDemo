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
import com.fasterxml.jackson.databind.ObjectMapper

import java.text.SimpleDateFormat

/**
 * @author dparish
 *
 * This is a simple script designed to list diagram info as json.
 */

def mapper = new ObjectMapper()
// We should try and find out how to do this globally
mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));

List<Person> people = new ArrayList<>();

Person person = new Person()
person.setId(1l);
person.setFirstName("David");
person.setLastName("Parish");
person.setBirthday(new Date().parse("d/M/yyyy", "25/07/1969"));
people.add(person);

person = new Person();
person.setId(2l);
person.setFirstName("Chris");
person.setLastName("Parish");
person.setBirthday(new Date().parse("d/M/yyyy", "15/08/1989"));
people.add(person);

person = new Person();
person.setId(3l);
person.setFirstName("Matthew");
person.setLastName("Parish");
person.setBirthday(new Date().parse("d/M/yyyy", "17/09/1991"));
people.add(person);

person = new Person();
person.setId(4l);
person.setFirstName("Lauren");
person.setLastName("Parish");
person.setBirthday(new Date().parse("d/M/yyyy", "13/06/1987"));
people.add(person);

return mapper.writeValueAsString(people)
