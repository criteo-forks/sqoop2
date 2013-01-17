/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for org.apache.sqoop.model.MEnumInput
 */
public class TestMEnumInput {
  /**
   * Test for class initialization
   */
  @Test
  public void testInitialization() {
    String[] values = { "value1", "value2" };
    MEnumInput input = new MEnumInput("NAME", values);
    assertEquals("NAME", input.getName());
    assertArrayEquals(values, input.getValues());
    assertEquals(MInputType.ENUM, input.getType());

    MEnumInput input1 = new MEnumInput("NAME", values);
    assertEquals(input1, input);
    String[] testVal = { "val", "test" };
    MEnumInput input2 = new MEnumInput("NAME1", testVal);
    assertFalse(input1.equals(input2));
  }
}
