/**
 * "First, solve the problem. Then, write the code. -John Johnson"
 * "Or use Vangav M"
 * www.vangav.com
 * */

/**
 * MIT License
 *
 * Copyright (c) 2016 Vangav
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 * */

/**
 * Community
 * Facebook Group: Vangav Open Source - Backend
 *   fb.com/groups/575834775932682/
 * Facebook Page: Vangav
 *   fb.com/vangav.f
 * 
 * Third party communities for Vangav Backend
 *   - play framework
 *   - cassandra
 *   - datastax
 *   
 * Tag your question online (e.g.: stack overflow, etc ...) with
 *   #vangav_backend
 *   to easier find questions/answers online
 * */

package com.vangav.vos_instagram.controllers.get_post_likes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vangav.backend.play_framework.request.response.ResponseBodyJson;
import com.vangav.vos_instagram.controllers.get_post_likes.response_json.ResponsePostLike;

/**
 * GENERATED using ControllersGeneratorMain.java
 */
/**
 * ResponseGetPostLikes represents the response's structure
 * */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseGetPostLikes extends ResponseBodyJson {

  @Override
  @JsonIgnore
  protected String getName () throws Exception {

    return "GetPostLikes";
  }

  @Override
  @JsonIgnore
  protected ResponseGetPostLikes getThis () throws Exception {

    return this;
  }

  @JsonProperty
  public String request_tracking_id;
  @JsonProperty
  public ResponsePostLike[] post_likes;

  @JsonIgnore
  public void set (
    String request_tracking_id,
    ResponsePostLike[] post_likes) {

    this.request_tracking_id = request_tracking_id;
    this.post_likes = post_likes;
  }
}
