/*
 * Copyright (c) ${Year}, David J. Dudson
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those
 * of the authors and should not be interpreted as representing official policies,
 * either expressed or implied, of the FreeBSD Project.
 */

package constraint.character

import constraint.Character
import constraint.characterGroup.Alpha

/**
 * Created by David J. Dudson on 21/01/15.
 *
 *
 */
object UpperAlpha {

  trait UpperAlpha extends Character with Alpha

  case object `A` extends UpperAlpha {
    val unicode = '\u0041'
  }

  case object `B` extends UpperAlpha {
    val value: Char = 'B'
    val unicode = '\u0042'
  }

  case object `C` extends UpperAlpha {
    val unicode = '\u0043'
  }

  case object `D` extends UpperAlpha {
    val unicode = '\u0044'
  }

  case object `E` extends UpperAlpha {
    val unicode = '\u0045'
  }

  case object `F` extends UpperAlpha {
    val unicode = '\u0046'
  }

  case object `G` extends UpperAlpha {
    val unicode = '\u0047'
  }

  case object `H` extends UpperAlpha {
    val unicode = '\u0048'
  }

  case object `I` extends UpperAlpha {
    val unicode = '\u0049'
  }

  case object `J` extends UpperAlpha {
    val unicode = '\u004A'
  }

  case object `K` extends UpperAlpha {
    val unicode = '\u004B'
  }

  case object `L` extends UpperAlpha {
    val unicode = '\u004C'
  }

  case object `M` extends UpperAlpha {
    val unicode = '\u004D'
  }

  case object `N` extends UpperAlpha {
    val unicode = '\u004E'
  }

  case object `O` extends UpperAlpha {
    val unicode = '\u004F'
  }

  case object `P` extends UpperAlpha {
    val unicode = '\u0050'
  }

  case object `Q` extends UpperAlpha {
    val unicode = '\u0051'
  }

  case object `R` extends UpperAlpha {
    val unicode = '\u0052'
  }

  case object `S` extends UpperAlpha {
    val unicode = '\u0053'
  }

  case object `T` extends UpperAlpha {
    val unicode = '\u0054'
  }

  case object `U` extends UpperAlpha {
    val unicode = '\u0055'
  }

  case object `V` extends UpperAlpha {
    val unicode = '\u0056'
  }

  case object `W` extends UpperAlpha {
    val unicode = '\u0057'
  }

  case object `X` extends UpperAlpha {
    val unicode = '\u0058'
  }

  case object `Y` extends UpperAlpha {
    val unicode = '\u0059'
  }

  case object `Z` extends UpperAlpha {
    val unicode = '\u005A'
  }

}

