/*
 * Copyright (c) 2016-present, Takayuki Maruyama
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

package net.bis5.mattermost.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Incoming webhook.
 * 
 * @author Takayuki Maruyama
 */
@Data
public class IncomingWebhook {

  @JsonProperty("id")
  private String id;
  @JsonProperty("create_at")
  private long createAt;
  @JsonProperty("update_at")
  private long updateAt;
  @JsonProperty("delete_at")
  private long deleteAt;
  @JsonProperty("user_id")
  private String userId;
  @JsonProperty("channel_id")
  private String channelId;
  @JsonProperty("team_id")
  private String teamId;
  @JsonProperty("display_name")
  private String displayName;
  @JsonProperty("description")
  private String description;

  private String username;
  private String iconUrl;
  /* @since Mattermost Server XXX what ver? */
  private boolean channelLocked;
}
