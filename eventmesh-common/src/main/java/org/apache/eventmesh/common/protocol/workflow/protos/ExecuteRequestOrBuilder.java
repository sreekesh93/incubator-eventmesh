/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: workflow.proto

package org.apache.eventmesh.common.protocol.workflow.protos;

@SuppressWarnings({"all"})
public interface ExecuteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:eventmesh.workflow.api.protocol.ExecuteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string instance_id = 2;</code>
   * @return The instanceId.
   */
  String getInstanceId();
  /**
   * <code>string instance_id = 2;</code>
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString
      getInstanceIdBytes();

  /**
   * <code>string input = 3;</code>
   * @return The input.
   */
  String getInput();
  /**
   * <code>string input = 3;</code>
   * @return The bytes for input.
   */
  com.google.protobuf.ByteString
      getInputBytes();
}
