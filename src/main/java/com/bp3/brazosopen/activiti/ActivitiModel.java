/*******************************************************************************
 * Licensed Materials - Property of BP3
 *
 *   Brazos-Open
 *
 *  Copyright © BP3 Global Inc. 2015. All Rights Reserved.
 *  This software is subject to copyright protection under
 *  the laws of the United States and other countries.
 ******************************************************************************/

package com.bp3.brazosopen.activiti;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * Pojo's annotated with this annotation will get picked up as a json parsable variable by JsonRestResponseFactory
 * 
 * @author dparish
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //can use in method only.
public @interface ActivitiModel {
}
