/*
 * .NET tools :: StyleCop Runner
 * Copyright (C) 2010 Jose Chillan, Alexandre Victoor and SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.dotnet.tools.stylecop;

import org.sonar.plugins.dotnet.api.DotNetException;

/**
 * Exception generated for StyleCop execution.
 */
public class StyleCopException extends DotNetException {

  private static final long serialVersionUID = -8744090490644930724L;

  /**
   * {@inheritDoc}
   */
  public StyleCopException(String message) {
    super(message);
  }

  /**
   * {@inheritDoc}
   */
  public StyleCopException(String message, Throwable cause) {
    super(message, cause);
  }

}
