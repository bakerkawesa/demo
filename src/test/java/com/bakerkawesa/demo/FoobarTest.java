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

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.UUID;
import java.time.LocalDateTime;

/**
  * Tests {@link com.bakerkawesa.demo.Foobar Foobar}.
  *
  * @author Baker Kawesa
  */
public class FoobarTest {

  private static UUID pk;
  private static LocalDateTime datetimeCreated;
  private static LocalDateTime datetimeUpdated;
  private static String name;
  private static Foobar instance;

  /**
    * Initializes the test class.
    */
  @BeforeAll
  public static void setUpClass() {
    pk = UUID.randomUUID();
    datetimeCreated = LocalDateTime.now();
    datetimeUpdated = LocalDateTime.now();
    name = "Name";
    instance = new Foobar(
      pk,
      datetimeCreated,
      datetimeUpdated,
      name
    );
  }

  /**
    * Tests the getPk method.
    */
  @Test
  public void testGetPk() {
    assertEquals(pk, instance.getPk());
  }

  /**
    * Tests the getDatetimeCreated method.
    */
  @Test
  public void testGetDatetimeCreated() {
    assertEquals(datetimeCreated, instance.getDatetimeCreated());
  }

  /**
    * Tests the getDatetimeUpdated method.
    */
  @Test
  public void testGetDatetimeUpdated() {
    assertEquals(datetimeUpdated, instance.getDatetimeUpdated());
  }

  /**
    * Tests the getName method.
    */
  @Test
  public void testGetName() {
    assertEquals(name, instance.getName());
  }

  /**
    * Tests the equals method.
    */
  @Test
  public void testEquals() {
    var equalObject = new Foobar(
      pk,
      LocalDateTime.now(),
      LocalDateTime.now(),
      "Different Name"
    );
    assertTrue(instance.equals(equalObject));

    var unequalObject = new Foobar(
      UUID.randomUUID(),
      datetimeCreated,
      datetimeUpdated,
      name
    );
    assertFalse(instance.equals(unequalObject));
  }

  /**
    * Tests the hashCode method.
    */
  @Test
  public void testHashCode() {
    var equalObject = new Foobar(
      pk,
      LocalDateTime.now(),
      LocalDateTime.now(),
      "Different Name"
    );
    assertEquals(equalObject.hashCode(), instance.hashCode());

    var unequalObject = new Foobar(
      UUID.randomUUID(),
      datetimeCreated,
      datetimeUpdated,
      name
    );
    assertNotEquals(unequalObject.hashCode(), instance.hashCode());
  }
}
