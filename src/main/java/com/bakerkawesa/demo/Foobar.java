/*
 * Copyright 2020 Baker Kawesa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bakerkawesa.demo;

import java.util.UUID;
import java.time.LocalDateTime;
import java.util.Objects;

/**
  * Models a Foobar.
  *
  * @version 0.0.0
  * @since 0.0.0
  * @author Baker Kawesa
  */
public class Foobar {

  private UUID pk;
  private LocalDateTime datetimeCreated;
  private LocalDateTime datetimeUpdated;
  private String name;

  /**
    * Constructs a Foobar instance.
    *
    * @param pk the Foobar's primary key.
    * @param datetimeCreated the datetime when the Foobar was created.
    * @param datetimeUpdated the datetime when the Foobar was last updated.
    * @param name the Foobar's name.
    * @since 0.0.0
    */
  Foobar(UUID pk, LocalDateTime datetimeCreated, LocalDateTime datetimeUpdated, String name) {
    this.pk = Objects.requireNonNull(pk);
    this.datetimeCreated = Objects.requireNonNull(datetimeCreated);
    this.datetimeUpdated = Objects.requireNonNull(datetimeUpdated);
    this.name = Objects.requireNonNull(name);
  }

  /**
    * Gets the Foobar's primary key.
    *
    * @return the Foobar's primary key.
    * @since 0.0.0
    */
  public UUID getPk() {
    return pk;
  }

  /**
    * Gets the datetime when the Foobar was created.
    *
    * @return the datetime when the Foobar was created.
    * @since 0.0.0
    */
  public LocalDateTime getDatetimeCreated() {
    return datetimeCreated;
  }

  /**
    * Gets the datetime when the Foobar was last updated.
    *
    * @return the datetime when the Foobar was last updated.
    * @since 0.0.0
    */
  public LocalDateTime getDatetimeUpdated() {
    return datetimeUpdated;
  }

  /**
    * Gets the Foobar's name.
    *
    * @return the Foobar's name.
    * @since 0.0.0
    */
  public String getName() {
    return name;
  }

  /**
    * Tests whether or not the object is equal to another.
    *
    * @param otherObject the other object.
    * @return whether or not the object is equal to another.
    * @since 0.0.0
    */
  @Override
  public boolean equals(Object otherObject) {
    return otherObject instanceof Foobar ? ((Foobar)otherObject).pk.equals(pk) : false;
  }

  /**
    * Computes the object's hash code.
    *
    * @return the object's hash code.
    * @since 0.0.0
    */
  @Override
  public int hashCode() {
    return (getClass().getName() + "[pk=" + pk + "]").hashCode();
  }
}
