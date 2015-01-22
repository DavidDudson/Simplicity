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
 * Lower case alphabet
 */

object LowerAlpha {

  trait LowerAlpha extends Character with Alpha

  case object `a` extends LowerAlpha {
    val unicode = '\u0061'
  }

  case object `b` extends LowerAlpha {
    val unicode = '\u0062'
  }

  case object `c` extends LowerAlpha {
    val unicode = '\u0063'
  }

  case object `d` extends LowerAlpha {
    val unicode = '\u0064'
  }

  case object `e` extends LowerAlpha {
    val unicode = '\u0065'
  }

  case object `f` extends LowerAlpha {
    val unicode = '\u0066'
  }

  case object `g` extends LowerAlpha {
    val unicode = '\u0067'
  }

  case object `h` extends LowerAlpha {
    val unicode = '\u0068'
  }

  case object `i` extends LowerAlpha {
    val unicode = '\u0069'
  }

  case object `j` extends LowerAlpha {
    val unicode = '\u006A'
  }

  case object `k` extends LowerAlpha {
    val unicode = '\u006B'
  }

  case object `l` extends LowerAlpha {
    val unicode = '\u006C'
  }

  case object `m` extends LowerAlpha {
    val unicode = '\u006D'
  }

  case object `n` extends LowerAlpha {
    val unicode = '\u006E'
  }

  case object `o` extends LowerAlpha {
    val unicode = '\u006F'
  }

  case object `p` extends LowerAlpha {
    val unicode = '\u0070'
  }

  case object `q` extends LowerAlpha {
    val unicode = '\u0071'
  }

  case object `r` extends LowerAlpha {
    val unicode = '\u0072'
  }

  case object `s` extends LowerAlpha {
    val unicode = '\u0073'
  }

  case object `t` extends LowerAlpha {
    val unicode = '\u0074'
  }

  case object `u` extends LowerAlpha {
    val unicode = '\u0075'
  }

  case object `v` extends LowerAlpha {
    val unicode = '\u0076'
  }

  case object `w` extends LowerAlpha {
    val unicode = '\u0077'
  }

  case object `x` extends LowerAlpha {
    val unicode = '\u0078'
  }

  case object `y` extends LowerAlpha {
    val unicode = '\u0079'
  }

  case object `z` extends LowerAlpha {
    val unicode = '\u007A'
  }

}
