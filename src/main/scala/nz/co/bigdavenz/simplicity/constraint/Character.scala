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

package nz.co.bigdavenz.simplicity.constraint

import nz.co.bigdavenz.simplicity.traits.{HasAbbreviation, HasName}
import shapeless.{HNil, Nat}

/**
 * Created by David J. Dudson on 4/02/15.
 *
 * How 
 */

trait HasChar {
  val char: Char

  override def toString: String = s"${super.toString} \n Character: $char"
}

trait HasUnicode extends HasChar {
  val unicode: Nat = char.toInt

  //Replace By Hex
  override def toString: String = s"${super.toString} \n Unicode: $unicode"
}

trait HasDecimal extends HasChar {
  val decimal: String

  override def toString: String = s"${super.toString} \n Decimal: $decimal"
}

sealed trait Character extends AnyRef with HasName {
}

sealed trait UnicodeCharacter extends Character with HasUnicode {
  override def toString: String = s"Character : ${super.toString}"
}

sealed trait UnicodeCharacterBlock {
  val start: Nat
  //Replace by hex
  val end: Nat //Replace by hex
}

case object CharacterBlockLatin extends UnicodeCharacterBlock {

  override val start: Int = 0
  override val end: Int = 1

  sealed trait Null extends UnicodeCharacter with HasAbbreviation

  case object Null extends Null {
    override val char: Char = '\u0000'
    override val name: String = "Null"
    override val abbreviation: String = "NUL"
  }

}

object CharacterImplicits {

  implicit class CharImpl[A <: Character](a: A) {
    def append[B <: Character](b: B) = a :: b :: HNil
  }

}

object Character {

}
