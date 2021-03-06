/*
 *  Copyright 2017 Huawei Technologies Co., Ltd
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.servicecomb.swagger.generator.springmvc;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(path = "MethodResponseEntity")
public class MethodResponseEntity {

  @RequestMapping(method = RequestMethod.PUT, path = "usingRequestMapping")
  public ResponseEntity<List<User>> usingRequestMapping() {
    return null;
  }

  @GetMapping(path = "usingGetMapping")
  public ResponseEntity<List<User>> usingGetMapping() {
    return null;
  }

  @PutMapping(path = "usingPutMapping")
  public ResponseEntity<List<User>> usingPutMapping() {
    return null;
  }

  @PostMapping(path = "usingPostMapping")
  public ResponseEntity<List<User>> usingPostMapping() {
    return null;
  }

  @PatchMapping(path = "usingPatchMapping")
  public ResponseEntity<List<User>> usingPatchMapping() {
    return null;
  }

  @DeleteMapping(path = "usingDeleteMapping")
  public ResponseEntity<List<User>> usingDeleteMapping() {
    return null;
  }
}
