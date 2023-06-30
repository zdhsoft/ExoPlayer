/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer2.util;

/**
 * A listener for processing input frames.
 *
 * @deprecated com.google.android.exoplayer2 is deprecated. Please migrate to androidx.media3 (which
 *     contains the same ExoPlayer code). See <a
 *     href="https://developer.android.com/guide/topics/media/media3/getting-started/migration-guide">the
 *     migration guide</a> for more details, including a script to help with the migration.
 */
@Deprecated
public interface OnInputFrameProcessedListener {

  /**
   * Called when the given input frame has been processed.
   *
   * @param textureId The identifier of the processed texture.
   * @param syncObject A GL sync object that has been inserted into the GL command stream after the
   *     last write of texture. Value is 0 if and only if the {@code GLES30#glFenceSync} failed or
   *     the EGL context version is less than openGL 3.0. The sync object must be {@link
   *     com.google.android.exoplayer2.util.GlUtil#deleteSyncObject deleted} after use.
   */
  void onInputFrameProcessed(int textureId, long syncObject) throws VideoFrameProcessingException;
}
