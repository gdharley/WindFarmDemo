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
mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"));


Person person = new Person()
person.setId(1l);
person.setFirstName("David");
person.setLastName("Parish");
person.setBirthday(Date.parse("MM/dd/yyyy", "07/25/1969"));

return mapper.writeValueAsString(person)



