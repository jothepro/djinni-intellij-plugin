/*
 * Copyright 2015 Dropbox, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cross_language_cpp.djinni_intellij_plugin;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by jaetzold on 7/20/15.
 */
public class DjinniFileType extends LanguageFileType {
  public static final DjinniFileType INSTANCE = new DjinniFileType();

  private DjinniFileType() {
    super(DjinniLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public String getName() {
    return "Djinni";
  }

  @NotNull
  @Override
  public String getDescription() {
    return "Djinni interface definition file";
  }

  @NotNull
  @Override
  public String getDefaultExtension() {
    return "djinni";
  }

  @Nullable
  @Override
  public Icon getIcon() {
    return DjinniIcons.FILE;
  }
}
