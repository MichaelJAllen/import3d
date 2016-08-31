/*
Facsimile -- A Discrete-Event Simulation Library
Copyright © 2004-2016, Michael J Allen.

This file is part of Facsimile.

Facsimile is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
version.

Facsimile is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along with Facsimile. If not, see
http://www.gnu.org/licenses/lgpl.

The developers welcome all comments, suggestions and offers of assistance. For further information, please visit the
project home page at:

  http://facsim.org/

Thank you for your interest in the Facsimile project!

IMPORTANT NOTE: All patches (modifications to existing files and/or the addition of new files) submitted for inclusion
as part of the official Facsimile code base, must comply with the published Facsimile Coding Standards. If your code
fails to comply with the standard, then your patches will be rejected. For further information, please visit the coding
standards at:

  http://facsim.org/Documentation/CodingStandards/
========================================================================================================================
Scala source file belonging to the org.facsim.import3d.cell package.
*/
//======================================================================================================================

package org.facsim.import3d.cell

import javafx.scene.paint.{Color => JFXColor}

/**
Base trait for all ''AutoMod cell'' file colors.

Prior to release 12.6, ''AutoMod's cell'' file format supported 16 colors (with corresponding names in ''AutoMod'' code)
represented by integers in the range 0-15. Release 12.6 added a further 64 colors (also with corresponding names in
''AutoMod'' code), represented by integers in the range 16-79.

@todo Technically, each color's ''red, green and blue'' (''RGB'') components can be specified by the user, in a file
named `.asilibrc` in the same directory as an ''AutoMod'' model or ''cell'' file. At some point in the future, these
customized colors will be supported; however, for now, the RGB components of each color matches the default RGB
component values for each ''cell'' color.
*/

sealed trait Color {

/**
''JavaFX'' color corresponding to this ''cell'' color.

This color is used to draw associated ''cell'' elements in ''JavaFX''.
*/

  val jfxColor: JFXColor

/**
Flag indicating whether this is a ''standard'' (`false`) or ''extended'' (`true`) color.

@note Originally, there were only 8 cell colors (codes 0-7), which ''AutoMod'' 8 increased to 16 (0-15); these are
now regarded as the standard colors. ''AutoMod'' release 12.6 added a further 64 colors (codes 16-79), which are now
referred to as the extended colors.
*/

  val isExtendedColor: Boolean

/**
This color's ''cell'' color code.
*/

  val cellCode: Byte
}

/**
Black.
*/

case object Black
extends Color {
  override val jfxColor = JFXColor.rgb(0, 0, 0)
  override val isExtendedColor = false
  override val cellCode = 0.toByte
}

/**
Red.
*/

case object Red
extends Color {
  override val jfxColor = JFXColor.rgb(0, 0, 0)
  override val isExtendedColor = false
  override val cellCode = 1.toByte
}