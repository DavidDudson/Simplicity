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


import nz.co.bigdavenz.simplicity.constraint.Characters._
import nz.co.bigdavenz.simplicity.pimps.CharPimp._

import scalaz.\/

/**
 * Created by David J. Dudson on 25/02/15.
 *
 * Base Character Groupings
 */
object CharacterGroup {

  type AllCharacters = CharacterBlockLatin
  type CharacterBlockLatin = Null \/ StartOfHeading \/ StartOfText \/ EndOfText \/ EndOfTransmission \/ Enquiry \/ Acknowledge \/ Bell \/
    Backspace \/ HorizontalTab \/ LineFeed \/ VerticalTab \/ FormFeed \/ CarriageReturn \/ ShiftOut \/ ShiftIn \/
    DataLinkEscape \/ DeviceControlOne \/ DeviceControlTwo \/ DeviceControlThree \/ DeviceControlFour \/
    NegativeAcknowledge \/ SynchronousIdle \/ EndOfTransmissionBlock \/ Cancel \/ EndOfMedium \/ Substitute \/
    Escape \/ FileSeparator \/ GroupSeparator \/ RecordSeparator \/ UnitSeparator \/ Space \/ ExclamationMark \/
    QuotationMark \/ HashTag \/ Dollar \/ Percent \/ Ampersand \/ Apostrophe \/ LeftParenthesis \/ RightParenthesis \/
    Asterisk \/ Plus \/ Comma \/ Minus \/ FullStop \/ ForwardSlash \/ Zero \/ One \/ Two \/ Three \/ Four \/ Five \/ Six \/ Seven \/
    Eight \/ Nine \/ Colon \/ Semicolon \/ LessThan \/ GreaterThan \/ QuestionMark \/ At \/ CapitalA \/
    CapitalB \/ CapitalC \/ CapitalD \/ CapitalE \/ CapitalF \/ CapitalG \/ CapitalH \/ CapitalI \/ CapitalJ \/ CapitalK \/
    CapitalL \/ CapitalM \/ CapitalN \/ CapitalO \/ CapitalP \/ CapitalQ \/ CapitalR \/ CapitalS \/ CapitalT \/ CapitalU \/
    CapitalV \/ CapitalW \/ CapitalX \/ CapitalY \/ CapitalZ \/ LeftSquareBracket \/ Backslash \/ RightSquareBracket \/
    Circumflex \/ Underscore \/ Grave \/ LowerA \/ LowerB \/ LowerC \/ LowerD \/ LowerE \/ LowerF \/ LowerG \/ LowerH \/ LowerI \/
    LowerJ \/ LowerK \/ LowerL \/ LowerM \/ LowerN \/ LowerO \/ LowerP \/ LowerQ \/ LowerR \/ LowerS \/ LowerT \/ LowerU \/
    LowerV \/ LowerW \/ LowerX \/ LowerY \/ LowerZ \/ LeftCurlyBracket \/ VerticalBar \/ RightCurlyBracket \/ Tilde \/ Delete
  type CapitalAlpha = CapitalA \/ CapitalB \/ CapitalC \/ CapitalD \/ CapitalE \/ CapitalF \/ CapitalG \/ CapitalH \/
    CapitalI \/ CapitalJ \/ CapitalK \/ CapitalL \/ CapitalM \/ CapitalN \/ CapitalO \/ CapitalP \/ CapitalQ \/
    CapitalR \/ CapitalS \/ CapitalT \/ CapitalU \/ CapitalV \/ CapitalW \/ CapitalX \/ CapitalY \/ CapitalZ
  type LowerAlpha = LowerA \/ LowerB \/ LowerC \/ LowerD \/ LowerE \/ LowerF \/ LowerG \/ LowerH \/ LowerI \/
    LowerJ \/ LowerK \/ LowerL \/ LowerM \/ LowerN \/ LowerO \/ LowerP \/ LowerQ \/ LowerR \/ LowerS \/ LowerT \/ LowerU \/
    LowerV \/ LowerW \/ LowerX \/ LowerY \/ LowerZ
  type Alpha = LowerAlpha \/ CapitalAlpha
  type Numeric = Zero \/ One \/ Two \/ Three \/ Four \/ Five \/ Six \/ Seven \/ Eight \/ Nine
  type AlphaNumeric = Alpha \/ Numeric
  val CharacterBlockLatin = Vector(Null, StartOfHeading, StartOfText, EndOfText, EndOfTransmission, Enquiry, Acknowledge, Bell,
    Backspace, HorizontalTab, LineFeed, VerticalTab, FormFeed, CarriageReturn, ShiftOut, ShiftIn,
    DataLinkEscape, DeviceControlOne, DeviceControlTwo, DeviceControlThree, DeviceControlFour,
    NegativeAcknowledge, SynchronousIdle, EndOfTransmissionBlock, Cancel, EndOfMedium, Substitute,
    Escape, FileSeparator, GroupSeparator, RecordSeparator, UnitSeparator, Space, ExclamationMark,
    QuotationMark, HashTag, Dollar, Percent, Ampersand, Apostrophe, LeftParenthesis, RightParenthesis,
    Asterisk, Plus, Comma, Minus, FullStop, ForwardSlash, Zero, One, Two, Three, Four, Five, Six, Seven,
    Eight, Nine, Colon, Semicolon, LessThan, GreaterThan, QuestionMark, At, CapitalA,
    CapitalB, CapitalC, CapitalD, CapitalE, CapitalF, CapitalG, CapitalH, CapitalI, CapitalJ, CapitalK,
    CapitalL, CapitalM, CapitalN, CapitalO, CapitalP, CapitalQ, CapitalR, CapitalS, CapitalT, CapitalU,
    CapitalV, CapitalW, CapitalX, CapitalY, CapitalZ, LeftSquareBracket, Backslash, RightSquareBracket,
    Circumflex, Underscore, Grave, LowerA, LowerB, LowerC, LowerD, LowerE, LowerF, LowerG, LowerH, LowerI,
    LowerJ, LowerK, LowerL, LowerM, LowerN, LowerO, LowerP, LowerQ, LowerR, LowerS, LowerT, LowerU,
    LowerV, LowerW, LowerX, LowerY, LowerZ, LeftCurlyBracket, VerticalBar, RightCurlyBracket, Tilde, Delete)
  val AllCharacters = CharacterBlockLatin

  class CharString[T <: UnicodeCharacter](val string: Vector[T]) extends AnyVal {
    override def toString: String = (for (c ← string) yield c.glyph).mkString
  }

  object CharString {
    def apply[T <: UnicodeCharacter](string: Vector[T]): CharString[T] = {
      new CharString[T](string)
    }

    def apply[T <: UnicodeCharacter](s: String): Option[CharString[T]] = {
      checkUnicodeString[T](s) match {
        case true ⇒ Some(new CharString[T]((for (c ← s) yield c.toUnicodeChar.asInstanceOf[T]).toVector))
        case false ⇒ None
      }
    }

    private def checkUnicodeString[T <: UnicodeCharacter](s: String): Boolean = {
      s.head.toUnicodeChar match {
        case _: T if s.length == 1 ⇒ true
        case _: T ⇒ checkUnicodeString(s.tail)
        case _ ⇒ false
      }
    }
  }


}
