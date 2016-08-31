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
Scala source file belonging to the org.facsim.import3d package.
*/
//======================================================================================================================

package org.facsim.import3d

import org.parboiled2._

/**
Common file parsing rules.
*/
private[import3d] trait CommonRules {

  self: Parser =>

/**
Common whitespace characters, excluding ''newline'' characters.
*/
  private final val WS = " \t"

/**
Common whitespace characters, including ''newline'' characters.
*/
  private final val WSNL = WS + "\n"

/**
Rule matching one or more consecutive whitespace characters (excluding newline characters).

@note Use to denote required whitespace.
*/
  def ws = rule(quiet(oneOrMore(anyOf(WS))))

/**
Rule matching one or more consecutive whitespace characters (including newline characters).

@note Use to denote required whitespace.
*/
  def wsnl = rule(quiet(oneOrMore(anyOf(WSNL))))

/**
Rule matching zero or more consecutive whitespace characters (excluding newline characters).

@note Use to denote optional whitespace.
*/
  def ws0 = rule(quiet(zeroOrMore(anyOf(WS))))

/**
Rule matching zero or more consecutive whitespace characters (including newline characters).

@note Use to denote optional whitespace.
*/
  def wsnl0 = rule(quiet(zeroOrMore(anyOf(WSNL))))
}
