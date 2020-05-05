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

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
  * Bootstraps the program.
  *
  * @version 0.0.0
  * @since 0.0.0
  * @author Baker Kawesa
  */
public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  /**
    * Bootstraps the program.
    *
    * @param arguments command-line arguments.
    * @since 0.0.0
    */
  public static void main(String[] arguments) {
    logger.info("Hello world! 😃️");
  }
}
