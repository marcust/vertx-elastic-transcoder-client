/**
 * Copyright (C) 2017 Etaia AS (oss@hubrick.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hubrick.vertx.elastictranscoder.model;

/**
 * @author Emir Dizdarevic
 * @since 1.0.0
 */
public enum VideoCodec {
    VC_GIF("gif"),
    VC_H264("H.264"),
    VC_MPEG2("mpeg2"),
    VC_VP8("vp8"),
    VC_VP9("vp9");

    private final String value;

    VideoCodec(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
