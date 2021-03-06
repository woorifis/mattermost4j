/*
 * Copyright (c) 2017-present, Takayuki Maruyama
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package net.bis5.mattermost.client4.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * API error response.
 * 
 * @author Takayuki Maruyama
 */
@Data
public class ApiError {

  @JsonProperty("id")
  private String id;
  @JsonProperty("message")
  private String message;
  @JsonProperty("detailed_error")
  private String detailedError; // XXX UNDOCUMENTED IN api.mattermost.com/v4
  @JsonProperty("request_id")
  private String requestId;
  @JsonProperty("status_code")
  private int statusCode;
  @JsonProperty("is_oauth")
  private boolean isOAuth;

}
