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

import nz.co.bigdavenz.simplicity.util.InvalidOperationException

import scala.language._
import scalaz.\/

/**
 * Created by David J. Dudson on 21/01/15.
 *
 * When complete will be sealed with all Unicode characters
 */
//Todo replace string type with own AlphaString Type

object Characters {

  val Null = UnicodeChar[Null]('\u0000')
  val StartOfHeading = UnicodeChar[StartOfHeading]('\u0001')
  val StartOfText = UnicodeChar[StartOfText]('\u0002')
  val EndOfText = UnicodeChar[EndOfText]('\u0003')
  val EndOfTransmission = UnicodeChar[EndOfTransmission]('\u0004')
  val Enquiry = UnicodeChar[Enquiry]('\u0005')
  val Acknowledge = UnicodeChar[Acknowledge]('\u0006')
  val Bell = UnicodeChar[Bell]('\u0007')
  val Backspace = UnicodeChar[Backspace]('\u0008')
  val CharacterTabulation = UnicodeChar[CharacterTabulation]('\u0009')
  val LineFeed = UnicodeChar[LineFeed]('\u000A')
  val LineTabulation = UnicodeChar[LineTabulation]('\u000B')
  val FormFeed = UnicodeChar[FormFeed]('\u000C')
  val CarriageReturn = UnicodeChar[CarriageReturn]('\u000D')
  val ShiftOut = UnicodeChar[ShiftOut]('\u000E')
  val ShiftIn = UnicodeChar[ShiftIn]('\u000F')
  val DataLinkEscape = UnicodeChar[DataLinkEscape]('\u0010')
  val DeviceControlOne = UnicodeChar[DeviceControlOne]('\u0011')
  val DeviceControlTwo = UnicodeChar[DeviceControlTwo]('\u0012')
  val DeviceControlThree = UnicodeChar[DeviceControlThree]('\u0013')
  val DeviceControlFour = UnicodeChar[DeviceControlFour]('\u0014')
  val NegativeAcknowledge = UnicodeChar[NegativeAcknowledge]('\u0015')
  val SynchronousIdle = UnicodeChar[SynchronousIdle]('\u0016')
  val EndOfTransmissionBlock = UnicodeChar[EndOfTransmissionBlock]('\u0017')
  val Cancel = UnicodeChar[Cancel]('\u0018')
  val EndOfMedium = UnicodeChar[EndOfMedium]('\u0019')
  val Substitute = UnicodeChar[Substitute]('\u001A')
  val Escape = UnicodeChar[Escape]('\u001B')
  val InformationSeparatorFour = UnicodeChar[InformationSeparatorFour]('\u001C')
  val InformationSeparatorThree = UnicodeChar[InformationSeparatorThree]('\u001D')
  val InformationSeparatorTwo = UnicodeChar[InformationSeparatorTwo]('\u001E')
  val InformationSeparatorOne = UnicodeChar[InformationSeparatorOne]('\u001F')
  val Space = UnicodeChar[Space]('\u0020')
  val ExclamationMark = UnicodeChar[ExclamationMark]('\u0021')
  val QuotationMark = UnicodeChar[QuotationMark]('\u0022')
  val Hash = UnicodeChar[Hash]('\u0023')
  val Dollar = UnicodeChar[Dollar]('\u0024')
  val Percent = UnicodeChar[Percent]('\u0025')
  val Ampersand = UnicodeChar[Ampersand]('\u0026')
  val Apostrophe = UnicodeChar[Apostrophe]('\u0027')
  val LeftParenthesis = UnicodeChar[LeftParenthesis]('\u0028')
  val RightParenthesis = UnicodeChar[RightParenthesis]('\u0029')
  val Asterisk = UnicodeChar[Asterisk]('\u002A')
  val Plus = UnicodeChar[Plus]('\u002B')
  val Comma = UnicodeChar[Comma]('\u002C')
  val Hyphen = UnicodeChar[Hyphen \/ Minus]('\u002D')
  val FullStop = UnicodeChar[FullStop]('\u002E')
  val Solidus = UnicodeChar[Solidus \/ ForwardSlash]('\u002F')
  val Zero = UnicodeChar[Zero]('\u0030')
  val One = UnicodeChar[One]('\u0031')
  val Two = UnicodeChar[Two]('\u0032')
  val Three = UnicodeChar[Three]('\u0033')
  val Four = UnicodeChar[Four]('\u0034')
  val Five = UnicodeChar[Five]('\u0035')
  val Six = UnicodeChar[Six]('\u0036')
  val Seven = UnicodeChar[Seven]('\u0037')
  val Eight = UnicodeChar[Eight]('\u0038')
  val Nine = UnicodeChar[Nine]('\u0039')
  val Colon = UnicodeChar[Colon]('\u003A')
  val SemiColon = UnicodeChar[SemiColon]('\u003B')
  val LessThan = UnicodeChar[LessThan]('\u003C')
  val Equals = UnicodeChar[Equals]('\u003D')
  val GreaterThan = UnicodeChar[GreaterThan]('\u003E')
  val QuestionMark = UnicodeChar[QuestionMark]('\u003F')
  val AtSign = UnicodeChar[AtSign]('\u0040')
  val UppercaseA = UnicodeChar[UppercaseA]('\u0041')
  val UppercaseB = UnicodeChar[UppercaseB]('\u0042')
  val UppercaseC = UnicodeChar[UppercaseC]('\u0043')
  val UppercaseD = UnicodeChar[UppercaseD]('\u0044')
  val UppercaseE = UnicodeChar[UppercaseE]('\u0045')
  val UppercaseF = UnicodeChar[UppercaseF]('\u0046')
  val UppercaseG = UnicodeChar[UppercaseG]('\u0047')
  val UppercaseH = UnicodeChar[UppercaseH]('\u0048')
  val UppercaseI = UnicodeChar[UppercaseI]('\u0049')
  val UppercaseJ = UnicodeChar[UppercaseJ]('\u004A')
  val UppercaseK = UnicodeChar[UppercaseK]('\u004B')
  val UppercaseL = UnicodeChar[UppercaseL]('\u004C')
  val UppercaseM = UnicodeChar[UppercaseM]('\u004D')
  val UppercaseN = UnicodeChar[UppercaseN]('\u004E')
  val UppercaseO = UnicodeChar[UppercaseO]('\u004F')
  val UppercaseP = UnicodeChar[UppercaseP]('\u0050')
  val UppercaseQ = UnicodeChar[UppercaseQ]('\u0051')
  val UppercaseR = UnicodeChar[UppercaseR]('\u0052')
  val UppercaseS = UnicodeChar[UppercaseS]('\u0053')
  val UppercaseT = UnicodeChar[UppercaseT]('\u0054')
  val UppercaseU = UnicodeChar[UppercaseU]('\u0055')
  val UppercaseV = UnicodeChar[UppercaseV]('\u0056')
  val UppercaseW = UnicodeChar[UppercaseW]('\u0057')
  val UppercaseX = UnicodeChar[UppercaseX]('\u0058')
  val UppercaseY = UnicodeChar[UppercaseY]('\u0059')
  val UppercaseZ = UnicodeChar[UppercaseZ]('\u005A')
  val LeftSquareBracket = UnicodeChar[LeftSquareBracket]('\u005B')
  val ReverseSolidus = UnicodeChar[ReverseSolidus \/ Backslash]('\\')
  val RightSquareBracket = UnicodeChar[RightSquareBracket]('\u005D')
  val CircumflexAccent = UnicodeChar[CircumflexAccent]('\u005E')
  val LowLine = UnicodeChar[LowLine \/ Underscore]('\u005F')
  val GraveAccent = UnicodeChar[GraveAccent]('\u0060')
  val LowercaseA = UnicodeChar[LowercaseA]('\u0061')
  val LowercaseB = UnicodeChar[LowercaseB]('\u0062')
  val LowercaseC = UnicodeChar[LowercaseC]('\u0063')
  val LowercaseD = UnicodeChar[LowercaseD]('\u0064')
  val LowercaseE = UnicodeChar[LowercaseE]('\u0065')
  val LowercaseF = UnicodeChar[LowercaseF]('\u0066')
  val LowercaseG = UnicodeChar[LowercaseG]('\u0067')
  val LowercaseH = UnicodeChar[LowercaseH]('\u0068')
  val LowercaseI = UnicodeChar[LowercaseI]('\u0069')
  val LowercaseJ = UnicodeChar[LowercaseJ]('\u006A')
  val LowercaseK = UnicodeChar[LowercaseK]('\u006B')
  val LowercaseL = UnicodeChar[LowercaseL]('\u006C')
  val LowercaseM = UnicodeChar[LowercaseM]('\u006D')
  val LowercaseN = UnicodeChar[LowercaseN]('\u006E')
  val LowercaseO = UnicodeChar[LowercaseO]('\u006F')
  val LowercaseP = UnicodeChar[LowercaseP]('\u0070')
  val LowercaseQ = UnicodeChar[LowercaseQ]('\u0071')
  val LowercaseR = UnicodeChar[LowercaseR]('\u0072')
  val LowercaseS = UnicodeChar[LowercaseS]('\u0073')
  val LowercaseT = UnicodeChar[LowercaseT]('\u0074')
  val LowercaseU = UnicodeChar[LowercaseU]('\u0075')
  val LowercaseV = UnicodeChar[LowercaseV]('\u0076')
  val LowercaseW = UnicodeChar[LowercaseW]('\u0077')
  val LowercaseX = UnicodeChar[LowercaseX]('\u0078')
  val LowercaseY = UnicodeChar[LowercaseY]('\u0079')
  val LowercaseZ = UnicodeChar[LowercaseZ]('\u007A')
  val LeftCurlyBracket = UnicodeChar[LeftCurlyBracket]('\u007B')
  val VerticalLine = UnicodeChar[VerticalLine]('\u007C')
  val RightCurlyBracket = UnicodeChar[RightCurlyBracket]('\u007D')
  val Tilde = UnicodeChar[Tilde]('\u007E')
  val Delete = UnicodeChar[Delete]('\u007F')

  sealed trait Null extends CharType

  sealed trait StartOfHeading extends CharType

  sealed trait StartOfText extends CharType

  sealed trait EndOfText extends CharType

  sealed trait EndOfTransmission extends CharType

  sealed trait Enquiry extends CharType

  sealed trait Acknowledge extends CharType

  sealed trait Bell extends CharType

  sealed trait Backspace extends CharType

  sealed trait CharacterTabulation extends CharType

  sealed trait LineFeed extends CharType

  sealed trait LineTabulation extends CharType

  sealed trait FormFeed extends CharType

  sealed trait CarriageReturn extends CharType

  sealed trait ShiftOut extends CharType

  sealed trait ShiftIn extends CharType

  sealed trait DataLinkEscape extends CharType

  sealed trait DeviceControlOne extends CharType

  sealed trait DeviceControlTwo extends CharType

  sealed trait DeviceControlThree extends CharType

  sealed trait DeviceControlFour extends CharType

  sealed trait NegativeAcknowledge extends CharType

  sealed trait SynchronousIdle extends CharType

  sealed trait EndOfTransmissionBlock extends CharType

  sealed trait Cancel extends CharType

  sealed trait EndOfMedium extends CharType

  sealed trait Substitute extends CharType

  sealed trait Escape extends CharType

  sealed trait InformationSeparatorFour extends CharType

  sealed trait InformationSeparatorThree extends CharType

  sealed trait InformationSeparatorTwo extends CharType

  sealed trait InformationSeparatorOne extends CharType

  sealed trait Space extends CharType

  sealed trait ExclamationMark extends CharType

  sealed trait QuotationMark extends CharType

  sealed trait Hash extends CharType

  sealed trait Dollar extends CharType

  sealed trait Percent extends CharType

  sealed trait Ampersand extends CharType

  sealed trait Apostrophe extends CharType

  sealed trait LeftParenthesis extends CharType

  sealed trait RightParenthesis extends CharType

  sealed trait Asterisk extends CharType

  sealed trait Plus extends CharType

  sealed trait Comma extends CharType

  sealed trait Hyphen extends CharType

  sealed trait Minus extends CharType

  sealed trait FullStop extends CharType

  sealed trait Solidus extends CharType

  sealed trait ForwardSlash extends CharType

  sealed trait Zero extends CharType

  sealed trait One extends CharType

  sealed trait Two extends CharType

  sealed trait Three extends CharType

  sealed trait Four extends CharType

  sealed trait Five extends CharType

  sealed trait Six extends CharType

  sealed trait Seven extends CharType

  sealed trait Eight extends CharType

  sealed trait Nine extends CharType

  sealed trait Colon extends CharType

  sealed trait SemiColon extends CharType

  sealed trait LessThan extends CharType

  sealed trait Equals extends CharType

  sealed trait GreaterThan extends CharType

  sealed trait QuestionMark extends CharType

  sealed trait AtSign extends CharType

  sealed trait UppercaseA extends CharType

  sealed trait UppercaseB extends CharType

  sealed trait UppercaseC extends CharType

  sealed trait UppercaseD extends CharType

  sealed trait UppercaseE extends CharType

  sealed trait UppercaseF extends CharType

  sealed trait UppercaseG extends CharType

  sealed trait UppercaseH extends CharType

  sealed trait UppercaseI extends CharType

  sealed trait UppercaseJ extends CharType

  sealed trait UppercaseK extends CharType

  sealed trait UppercaseL extends CharType

  sealed trait UppercaseM extends CharType

  sealed trait UppercaseN extends CharType

  sealed trait UppercaseO extends CharType

  sealed trait UppercaseP extends CharType

  sealed trait UppercaseQ extends CharType

  sealed trait UppercaseR extends CharType

  sealed trait UppercaseS extends CharType

  sealed trait UppercaseT extends CharType

  sealed trait UppercaseU extends CharType

  sealed trait UppercaseV extends CharType

  sealed trait UppercaseW extends CharType

  sealed trait UppercaseX extends CharType

  sealed trait UppercaseY extends CharType

  sealed trait UppercaseZ extends CharType

  sealed trait LeftSquareBracket extends CharType

  sealed trait ReverseSolidus extends CharType

  sealed trait Backslash extends CharType

  sealed trait RightSquareBracket extends CharType

  sealed trait CircumflexAccent extends CharType

  sealed trait LowLine extends CharType

  sealed trait Underscore extends CharType

  sealed trait GraveAccent extends CharType

  sealed trait LowercaseA extends CharType

  sealed trait LowercaseB extends CharType

  sealed trait LowercaseC extends CharType

  sealed trait LowercaseD extends CharType

  sealed trait LowercaseE extends CharType

  sealed trait LowercaseF extends CharType

  sealed trait LowercaseG extends CharType

  sealed trait LowercaseH extends CharType

  sealed trait LowercaseI extends CharType

  sealed trait LowercaseJ extends CharType

  sealed trait LowercaseK extends CharType

  sealed trait LowercaseL extends CharType

  sealed trait LowercaseM extends CharType

  sealed trait LowercaseN extends CharType

  sealed trait LowercaseO extends CharType

  sealed trait LowercaseP extends CharType

  sealed trait LowercaseQ extends CharType

  sealed trait LowercaseR extends CharType

  sealed trait LowercaseS extends CharType

  sealed trait LowercaseT extends CharType

  sealed trait LowercaseU extends CharType

  sealed trait LowercaseV extends CharType

  sealed trait LowercaseW extends CharType

  sealed trait LowercaseX extends CharType

  sealed trait LowercaseY extends CharType

  sealed trait LowercaseZ extends CharType

  sealed trait LeftCurlyBracket extends CharType

  sealed trait VerticalLine extends CharType

  sealed trait RightCurlyBracket extends CharType

  sealed trait Tilde extends CharType

  sealed trait Delete extends CharType

}

sealed trait CharType


final class UnicodeChar[A](val char: Char) extends AnyVal {

  def +(b: String) = throw InvalidOperationException("Default Any + String method not currently usable, throwing exception until workaround is made")

  def toInt: Int = char.toInt

  //  def +[B <: UnicodeChar](b: UnicodeChar): Vector[A] = Vector[A](this, b) flatten
  //
  //  def ++[B <: CharType](b: Vector[B]): Vector[B] = CharVector(b, this) flatten

  def ==(b: UnicodeChar[A]): Boolean = b.char == char

  def prln: Unit = println(toString)

  override def toString = s"$char : ${char.toInt}"
}

//object Unicode {
//  val unicodeMap: mutable.ParHashMap[Int, UnicodeChar[Upp]] = new mutable.ParHashMap()
//}

object UnicodeChar {

  def apply[A](char: Char): UnicodeChar[A] = {
    val newChar = new UnicodeChar[A](char)
    //Unicode.unicodeMap.put(newChar.toInt, newChar[A])
    newChar
  }
}

