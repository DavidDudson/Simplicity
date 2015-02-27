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

import nz.co.bigdavenz.simplicity.pimps.CharPimp._
import nz.co.bigdavenz.simplicity.primitives.{Decimal, Hex}
import nz.co.bigdavenz.simplicity.traits.{HasAbbreviation, HasName}

/**
 * Created by David J. Dudson on 4/02/15.
 *
 * Unicode Characters
 */

/**
 * Trait that defines whether or not a class has a glyph associated with
 */
trait HasGlyph {
  val glyph: Char

  override def toString: String = s"${super.toString} \n Glyph: $glyph"
}

/**
 * Trait that defines if a Glyph has a unicode representation
 */
trait HasUnicode extends HasGlyph {
  lazy val unicode: Hex = glyph.toHex

  override def toString: String = s"${super.toString} \n Unicode: ${unicode.toUnicodeString}"
}

/**
 * Trait that defines if a Glyph has an HTML decimal representation
 */
trait HasDecimal extends HasGlyph {
  lazy val decimal: Decimal = glyph.toDecimal

  override def toString: String = s"${super.toString} \n Decimal: $decimal"
}

/**
 * The main base trait for a Character (Requires characters to have a name)
 */
sealed trait Character extends AnyRef with HasName

/**
 * The base trait for Unicode characters
 */
sealed trait UnicodeCharacter extends Character with HasUnicode {
  override def toString: String = s"Character : ${super.toString}"
}

object Characters {

  sealed trait Null

  sealed trait StartOfHeading

  sealed trait StartOfText

  sealed trait EndOfText

  sealed trait EndOfTransmission

  sealed trait Enquiry

  sealed trait Acknowledge

  sealed trait Bell

  sealed trait Backspace

  sealed trait HorizontalTab

  sealed trait LineFeed

  sealed trait VerticalTab

  sealed trait FormFeed

  sealed trait CarriageReturn

  sealed trait ShiftOut

  sealed trait ShiftIn

  sealed trait DataLinkEscape

  sealed trait DeviceControlOne

  sealed trait DeviceControlTwo

  sealed trait DeviceControlThree

  sealed trait DeviceControlFour

  sealed trait NegativeAcknowledge

  sealed trait SynchronousIdle

  sealed trait EndOfTransmissionBlock

  sealed trait Cancel

  sealed trait EndOfMedium

  sealed trait Substitute

  sealed trait Escape

  sealed trait FileSeparator

  sealed trait GroupSeparator

  sealed trait RecordSeparator

  sealed trait UnitSeparator

  sealed trait Space

  sealed trait ExclamationMark

  sealed trait QuotationMark

  sealed trait HashTag

  sealed trait Dollar

  sealed trait Percent

  sealed trait Ampersand

  sealed trait Apostrophe

  sealed trait LeftParenthesis

  sealed trait RightParenthesis

  sealed trait Asterisk

  sealed trait Plus

  sealed trait Comma

  sealed trait Minus

  sealed trait FullStop

  sealed trait ForwardSlash

  sealed trait Zero

  sealed trait One

  sealed trait Two

  sealed trait Three

  sealed trait Four

  sealed trait Five

  sealed trait Six

  sealed trait Seven

  sealed trait Eight

  sealed trait Nine

  sealed trait Colon

  sealed trait Semicolon

  sealed trait LessThan

  sealed trait Equal

  sealed trait GreaterThan

  sealed trait QuestionMark

  sealed trait At

  sealed trait CapitalA

  sealed trait CapitalB

  sealed trait CapitalC

  sealed trait CapitalD

  sealed trait CapitalE

  sealed trait CapitalF

  sealed trait CapitalG

  sealed trait CapitalH

  sealed trait CapitalI

  sealed trait CapitalJ

  sealed trait CapitalK

  sealed trait CapitalL

  sealed trait CapitalM

  sealed trait CapitalN

  sealed trait CapitalO

  sealed trait CapitalP

  sealed trait CapitalQ

  sealed trait CapitalR

  sealed trait CapitalS

  sealed trait CapitalT

  sealed trait CapitalU

  sealed trait CapitalV

  sealed trait CapitalW

  sealed trait CapitalX

  sealed trait CapitalY

  sealed trait CapitalZ

  sealed trait LeftSquareBracket

  sealed trait Backslash

  sealed trait RightSquareBracket

  sealed trait Circumflex

  sealed trait Underscore

  sealed trait Grave

  sealed trait LowerA

  sealed trait LowerB

  sealed trait LowerC

  sealed trait LowerD

  sealed trait LowerE

  sealed trait LowerF

  sealed trait LowerG

  sealed trait LowerH

  sealed trait LowerI

  sealed trait LowerJ

  sealed trait LowerK

  sealed trait LowerL

  sealed trait LowerM

  sealed trait LowerN

  sealed trait LowerO

  sealed trait LowerP

  sealed trait LowerQ

  sealed trait LowerR

  sealed trait LowerS

  sealed trait LowerT

  sealed trait LowerU

  sealed trait LowerV

  sealed trait LowerW

  sealed trait LowerX

  sealed trait LowerY

  sealed trait LowerZ

  sealed trait LeftCurlyBracket

  sealed trait VerticalBar

  sealed trait RightCurlyBracket

  sealed trait Tilde

  sealed trait Delete

  case object Null extends UnicodeCharacter with HasAbbreviation with HasDecimal with Null {
    override val glyph: Char = '\u0000'
    override val name: String = "Null"
    override val abbreviation: String = "NUL"
  }

  case object StartOfHeading extends UnicodeCharacter with HasAbbreviation with HasDecimal with StartOfHeading {
    override val glyph: Char = '\u0001'
    override val name: String = "Start of heading"
    override val abbreviation: String = "SOH"
  }

  case object StartOfText extends UnicodeCharacter with HasAbbreviation with HasDecimal with StartOfText {
    override val glyph: Char = '\u0002'
    override val name: String = "Start of text"
    override val abbreviation: String = "STX"
  }

  case object EndOfText extends UnicodeCharacter with HasAbbreviation with HasDecimal with EndOfText {
    override val glyph: Char = '\u0003'
    override val name: String = "End of text"
    override val abbreviation: String = "ETX"
  }

  case object EndOfTransmission extends UnicodeCharacter with HasAbbreviation with HasDecimal with EndOfTransmission {
    override val glyph: Char = '\u0004'
    override val name: String = "End of transmission"
    override val abbreviation: String = "EOT"
  }

  case object Enquiry extends UnicodeCharacter with HasAbbreviation with HasDecimal with Enquiry {
    override val glyph: Char = '\u0005'
    override val name: String = "Enquiry"
    override val abbreviation: String = "ENQ"
  }

  case object Acknowledge extends UnicodeCharacter with HasAbbreviation with HasDecimal with Acknowledge {
    override val glyph: Char = '\u0006'
    override val name: String = "Acknowledge"
    override val abbreviation: String = "ACK"
  }

  case object Bell extends UnicodeCharacter with HasAbbreviation with HasDecimal with Bell {
    override val glyph: Char = '\u0007'
    override val name: String = "Bell"
    override val abbreviation: String = "BEL"
  }

  case object Backspace extends UnicodeCharacter with HasAbbreviation with HasDecimal with Backspace {
    override val glyph: Char = '\u0008'
    override val name: String = "Backspace"
    override val abbreviation: String = "BS"
  }

  case object HorizontalTab extends UnicodeCharacter with HasAbbreviation with HasDecimal with HorizontalTab {
    override val glyph: Char = '\u0009'
    override val name: String = "Horizontal tab"
    override val abbreviation: String = "HT"
  }

  case object LineFeed extends UnicodeCharacter with HasAbbreviation with HasDecimal with LineFeed {
    override val glyph: Char = '\u000A'
    override val name: String = "Line feed"
    override val abbreviation: String = "LF"
  }

  case object VerticalTab extends UnicodeCharacter with HasAbbreviation with HasDecimal with VerticalTab {
    override val glyph: Char = '\u000B'
    override val name: String = "Vertical tab"
    override val abbreviation: String = "VT"
  }

  case object FormFeed extends UnicodeCharacter with HasAbbreviation with HasDecimal with FormFeed {
    override val glyph: Char = '\u000C'
    override val name: String = "Form feed"
    override val abbreviation: String = "FF"
  }

  case object CarriageReturn extends UnicodeCharacter with HasAbbreviation with HasDecimal with CarriageReturn {
    override val glyph: Char = '\u000D'
    override val name: String = "Carriage return"
    override val abbreviation: String = "CR"
  }

  case object ShiftOut extends UnicodeCharacter with HasAbbreviation with HasDecimal with ShiftOut {
    override val glyph: Char = '\u000E'
    override val name: String = "Shift out"
    override val abbreviation: String = "SO"
  }

  case object ShiftIn extends UnicodeCharacter with HasAbbreviation with HasDecimal with ShiftIn {
    override val glyph: Char = '\u000F'
    override val name: String = "Shift in"
    override val abbreviation: String = "SI"
  }

  case object DataLinkEscape extends UnicodeCharacter with HasAbbreviation with HasDecimal with DataLinkEscape {
    override val glyph: Char = '\u0010'
    override val name: String = "DataLinkEscape"
    override val abbreviation: String = "DLE"
  }

  case object DeviceControlOne extends UnicodeCharacter with HasAbbreviation with HasDecimal with DeviceControlOne {
    override val glyph: Char = '\u0011'
    override val name: String = "DeviceControlOne"
    override val abbreviation: String = "DC1"
  }

  case object DeviceControlTwo extends UnicodeCharacter with HasAbbreviation with HasDecimal with DeviceControlTwo {
    override val glyph: Char = '\u0012'
    override val name: String = "DeviceControlTwo"
    override val abbreviation: String = "DC2"
  }

  case object DeviceControlThree extends UnicodeCharacter with HasAbbreviation with HasDecimal with DeviceControlThree {
    override val glyph: Char = '\u0013'
    override val name: String = "DeviceControlThree"
    override val abbreviation: String = "DC3"
  }

  case object DeviceControlFour extends UnicodeCharacter with HasAbbreviation with HasDecimal with DeviceControlFour {
    override val glyph: Char = '\u0014'
    override val name: String = "DeviceControlFour"
    override val abbreviation: String = "DC4"
  }

  case object NegativeAcknowledge extends UnicodeCharacter with HasAbbreviation with HasDecimal with NegativeAcknowledge {
    override val glyph: Char = '\u0015'
    override val name: String = "NegativeAcknowledge"
    override val abbreviation: String = "NAK"
  }

  case object SynchronousIdle extends UnicodeCharacter with HasAbbreviation with HasDecimal with SynchronousIdle {
    override val glyph: Char = '\u0016'
    override val name: String = "SynchronousIdle"
    override val abbreviation: String = "SYN"
  }

  case object EndOfTransmissionBlock extends UnicodeCharacter with HasAbbreviation with HasDecimal with EndOfTransmissionBlock {
    override val glyph: Char = '\u0017'
    override val name: String = "EndOfTransmissionBlock"
    override val abbreviation: String = "ETB"
  }

  case object Cancel extends UnicodeCharacter with HasAbbreviation with HasDecimal with Cancel {
    override val glyph: Char = '\u0018'
    override val name: String = "Cancel"
    override val abbreviation: String = "CAN"
  }

  case object EndOfMedium extends UnicodeCharacter with HasAbbreviation with HasDecimal with EndOfMedium {
    override val glyph: Char = '\u0019'
    override val name: String = "EndOfMedium"
    override val abbreviation: String = "EM"
  }

  case object Substitute extends UnicodeCharacter with HasAbbreviation with HasDecimal with Substitute {
    override val glyph: Char = '\u001A'
    override val name: String = "Substitute"
    override val abbreviation: String = "SUB"
  }

  case object Escape extends UnicodeCharacter with HasAbbreviation with HasDecimal with Escape {
    override val glyph: Char = '\u001B'
    override val name: String = "Escape"
    override val abbreviation: String = "ESC"
  }

  case object FileSeparator extends UnicodeCharacter with HasAbbreviation with HasDecimal with FileSeparator {
    override val glyph: Char = '\u001C'
    override val name: String = "FileSeparator"
    override val abbreviation: String = "FS"
  }

  case object GroupSeparator extends UnicodeCharacter with HasAbbreviation with HasDecimal with GroupSeparator {
    override val glyph: Char = '\u001D'
    override val name: String = "GroupSeparator"
    override val abbreviation: String = "GS"
  }

  case object RecordSeparator extends UnicodeCharacter with HasAbbreviation with HasDecimal with RecordSeparator {
    override val glyph: Char = '\u001E'
    override val name: String = "RecordSeparator"
    override val abbreviation: String = "US"
  }

  case object UnitSeparator extends UnicodeCharacter with HasAbbreviation with HasDecimal with UnitSeparator {
    override val glyph: Char = '\u001F'
    override val name: String = "UnitSeparator"
    override val abbreviation: String = "US"
  }

  case object Space extends UnicodeCharacter with HasAbbreviation with HasDecimal with Space {
    override val glyph: Char = '\u0020'
    override val name: String = "Space"
    override val abbreviation: String = "SP"
  }

  case object ExclamationMark extends UnicodeCharacter with HasDecimal with ExclamationMark {
    override val glyph: Char = '\u0021'
    override val name: String = "ExclamationMark"
  }

  case object QuotationMark extends UnicodeCharacter with HasDecimal with QuotationMark {
    override val glyph: Char = '\u0022'
    override val name: String = "QuotationMark"
  }

  case object HashTag extends UnicodeCharacter with HasDecimal with HashTag {
    override val glyph: Char = '\u0023'
    override val name: String = "HashTag"
  }

  case object Dollar extends UnicodeCharacter with HasDecimal with Dollar {
    override val glyph: Char = '\u0024'
    override val name: String = "Dollar"
  }

  case object Percent extends UnicodeCharacter with HasDecimal with Percent {
    override val glyph: Char = '\u0025'
    override val name: String = "Percent"
  }

  case object Ampersand extends UnicodeCharacter with HasDecimal with Ampersand {
    override val glyph: Char = '\u0026'
    override val name: String = "Ampersand"
  }

  case object Apostrophe extends UnicodeCharacter with HasDecimal with Apostrophe {
    override val glyph: Char = '\u0027'
    override val name: String = "Apostrophe"
  }

  case object LeftParenthesis extends UnicodeCharacter with HasDecimal with LeftParenthesis {
    override val glyph: Char = '\u0028'
    override val name: String = "LeftParenthesis"
  }

  case object RightParenthesis extends UnicodeCharacter with HasDecimal with RightParenthesis {
    override val glyph: Char = '\u0029'
    override val name: String = "RightParenthesis"
  }

  case object Asterisk extends UnicodeCharacter with HasDecimal with Asterisk {
    override val glyph: Char = '\u002A'
    override val name: String = "Asterisk"
  }

  case object Plus extends UnicodeCharacter with HasDecimal with Plus {
    override val glyph: Char = '\u002B'
    override val name: String = "Plus"
  }

  case object Comma extends UnicodeCharacter with HasDecimal with Comma {
    override val glyph: Char = '\u002C'
    override val name: String = "Comma"
  }

  case object Minus extends UnicodeCharacter with HasDecimal with Minus {
    override val glyph: Char = '\u002D'
    override val name: String = "Minus"
  }

  case object FullStop extends UnicodeCharacter with HasDecimal with FullStop {
    override val glyph: Char = '\u002E'
    override val name: String = "FullStop"
  }

  case object ForwardSlash extends UnicodeCharacter with HasDecimal with ForwardSlash {
    override val glyph: Char = '\u002F'
    override val name: String = "ForwardSlash"
  }

  case object Zero extends UnicodeCharacter with HasDecimal with Zero {
    override val glyph: Char = '\u0030'
    override val name: String = "Zero"
  }

  case object One extends UnicodeCharacter with HasDecimal with One {
    override val glyph: Char = '\u0031'
    override val name: String = "One"
  }

  case object Two extends UnicodeCharacter with HasDecimal with Two {
    override val glyph: Char = '\u0032'
    override val name: String = "Two"
  }

  case object Three extends UnicodeCharacter with HasDecimal with Three {
    override val glyph: Char = '\u0033'
    override val name: String = "Three"
  }

  case object Four extends UnicodeCharacter with HasDecimal with Four {
    override val glyph: Char = '\u0034'
    override val name: String = "Four"
  }

  case object Five extends UnicodeCharacter with HasDecimal with Five {
    override val glyph: Char = '\u0035'
    override val name: String = "Five"
  }

  case object Six extends UnicodeCharacter with HasDecimal with Six {
    override val glyph: Char = '\u0036'
    override val name: String = "Six"
  }

  case object Seven extends UnicodeCharacter with HasDecimal with Seven {
    override val glyph: Char = '\u0037'
    override val name: String = "Seven"
  }

  case object Eight extends UnicodeCharacter with HasDecimal with Eight {
    override val glyph: Char = '\u0038'
    override val name: String = "Eight"
  }

  case object Nine extends UnicodeCharacter with HasDecimal with Nine {
    override val glyph: Char = '\u0039'
    override val name: String = "Nine"
  }

  case object Colon extends UnicodeCharacter with HasDecimal with Colon {
    override val glyph: Char = '\u003A'
    override val name: String = "Colon"
  }

  case object Semicolon extends UnicodeCharacter with HasDecimal with Semicolon {
    override val glyph: Char = '\u003B'
    override val name: String = "Semicolon"
  }

  case object LessThan extends UnicodeCharacter with HasDecimal with LessThan {
    override val glyph: Char = '\u003C'
    override val name: String = "LessThan"
  }

  case object Equal extends UnicodeCharacter with HasDecimal with Equal {
    override val glyph: Char = '\u003D'
    override val name: String = "Equal"
  }

  case object GreaterThan extends UnicodeCharacter with HasDecimal with GreaterThan {
    override val glyph: Char = '\u003E'
    override val name: String = "GreaterThan"
  }

  case object QuestionMark extends UnicodeCharacter with HasDecimal with QuestionMark {
    override val glyph: Char = '\u003F'
    override val name: String = "QuestionMark"
  }

  case object At extends UnicodeCharacter with HasDecimal with At {
    override val glyph: Char = '\u0040'
    override val name: String = "At"
  }

  case object CapitalA extends UnicodeCharacter with HasDecimal with CapitalA {
    override val glyph: Char = '\u0041'
    override val name: String = "CapitalA"
  }

  case object CapitalB extends UnicodeCharacter with HasDecimal with CapitalB {
    override val glyph: Char = '\u0042'
    override val name: String = "CapitalB"
  }

  case object CapitalC extends UnicodeCharacter with HasDecimal with CapitalC {
    override val glyph: Char = '\u0043'
    override val name: String = "CapitalC"
  }

  case object CapitalD extends UnicodeCharacter with HasDecimal with CapitalD {
    override val glyph: Char = '\u0044'
    override val name: String = "CapitalD"
  }

  case object CapitalE extends UnicodeCharacter with HasDecimal with CapitalE {
    override val glyph: Char = '\u0045'
    override val name: String = "CapitalE"
  }

  case object CapitalF extends UnicodeCharacter with HasDecimal with CapitalF {
    override val glyph: Char = '\u0046'
    override val name: String = "CapitalF"
  }

  case object CapitalG extends UnicodeCharacter with HasDecimal with CapitalG {
    override val glyph: Char = '\u0047'
    override val name: String = "CapitalG"
  }

  case object CapitalH extends UnicodeCharacter with HasDecimal with CapitalH {
    override val glyph: Char = '\u0048'
    override val name: String = "CapitalH"
  }

  case object CapitalI extends UnicodeCharacter with HasDecimal with CapitalI {
    override val glyph: Char = '\u0049'
    override val name: String = "CapitalI"
  }

  case object CapitalJ extends UnicodeCharacter with HasDecimal with CapitalJ {
    override val glyph: Char = '\u004A'
    override val name: String = "CapitalJ"
  }

  case object CapitalK extends UnicodeCharacter with HasDecimal with CapitalK {
    override val glyph: Char = '\u004B'
    override val name: String = "CapitalK"
  }

  case object CapitalL extends UnicodeCharacter with HasDecimal with CapitalL {
    override val glyph: Char = '\u004C'
    override val name: String = "CapitalL"
  }

  case object CapitalM extends UnicodeCharacter with HasDecimal with CapitalM {
    override val glyph: Char = '\u004D'
    override val name: String = "CapitalM"
  }

  case object CapitalN extends UnicodeCharacter with HasDecimal with CapitalN {
    override val glyph: Char = '\u004E'
    override val name: String = "CapitalN"
  }

  case object CapitalO extends UnicodeCharacter with HasDecimal with CapitalO {
    override val glyph: Char = '\u004F'
    override val name: String = "CapitalO"
  }

  case object CapitalP extends UnicodeCharacter with HasDecimal with CapitalP {
    override val glyph: Char = '\u0050'
    override val name: String = "CapitalP"
  }

  case object CapitalQ extends UnicodeCharacter with HasDecimal with CapitalQ {
    override val glyph: Char = '\u0051'
    override val name: String = "CapitalQ"
  }

  case object CapitalR extends UnicodeCharacter with HasDecimal with CapitalR {
    override val glyph: Char = '\u0052'
    override val name: String = "CapitalR"
  }

  case object CapitalS extends UnicodeCharacter with HasDecimal with CapitalS {
    override val glyph: Char = '\u0053'
    override val name: String = "CapitalS"
  }

  case object CapitalT extends UnicodeCharacter with HasDecimal with CapitalT {
    override val glyph: Char = '\u0054'
    override val name: String = "CapitalT"
  }

  case object CapitalU extends UnicodeCharacter with HasDecimal with CapitalU {
    override val glyph: Char = '\u0055'
    override val name: String = "CapitalU"
  }

  case object CapitalV extends UnicodeCharacter with HasDecimal with CapitalV {
    override val glyph: Char = '\u0056'
    override val name: String = "CapitalV"
  }

  case object CapitalW extends UnicodeCharacter with HasDecimal with CapitalW {
    override val glyph: Char = '\u0057'
    override val name: String = "CapitalW"
  }

  case object CapitalX extends UnicodeCharacter with HasDecimal with CapitalX {
    override val glyph: Char = '\u0058'
    override val name: String = "CapitalX"
  }

  case object CapitalY extends UnicodeCharacter with HasDecimal with CapitalY {
    override val glyph: Char = '\u0059'
    override val name: String = "CapitalY"
  }

  case object CapitalZ extends UnicodeCharacter with HasDecimal with CapitalZ {
    override val glyph: Char = '\u005A'
    override val name: String = "CapitalZ"
  }

  case object LeftSquareBracket extends UnicodeCharacter with HasDecimal with LeftSquareBracket {
    override val glyph: Char = '\u005B'
    override val name: String = "LeftSquareBracket"
  }

  case object Backslash extends UnicodeCharacter with HasDecimal with Backslash {
    override val glyph: Char = '\\'
    override val name: String = "Backslash"
  }

  case object RightSquareBracket extends UnicodeCharacter with HasDecimal with RightSquareBracket {
    override val glyph: Char = '\u005D'
    override val name: String = "RightSquareBracket"
  }

  case object Circumflex extends UnicodeCharacter with HasDecimal with Circumflex {
    override val glyph: Char = '\u005E'
    override val name: String = "Circumflex"
  }

  case object Underscore extends UnicodeCharacter with HasDecimal with Underscore {
    override val glyph: Char = '\u005F'
    override val name: String = "Underscore"
  }

  case object Grave extends UnicodeCharacter with HasDecimal with Grave {
    override val glyph: Char = '\u0060'
    override val name: String = "Grave"
  }

  case object LowerA extends UnicodeCharacter with HasDecimal with LowerA {
    override val glyph: Char = '\u0061'
    override val name: String = "LowerA"
  }

  case object LowerB extends UnicodeCharacter with HasDecimal with LowerB {
    override val glyph: Char = '\u0062'
    override val name: String = "LowerB"
  }

  case object LowerC extends UnicodeCharacter with HasDecimal with LowerC {
    override val glyph: Char = '\u0063'
    override val name: String = "LowerC"
  }

  case object LowerD extends UnicodeCharacter with HasDecimal with LowerD {
    override val glyph: Char = '\u0064'
    override val name: String = "LowerD"
  }

  case object LowerE extends UnicodeCharacter with HasDecimal with LowerE {
    override val glyph: Char = '\u0065'
    override val name: String = "LowerE"
  }

  case object LowerF extends UnicodeCharacter with HasDecimal with LowerF {
    override val glyph: Char = '\u0066'
    override val name: String = "LowerF"
  }

  case object LowerG extends UnicodeCharacter with HasDecimal with LowerG {
    override val glyph: Char = '\u0067'
    override val name: String = "LowerG"
  }

  case object LowerH extends UnicodeCharacter with HasDecimal with LowerH {
    override val glyph: Char = '\u0068'
    override val name: String = "LowerH"
  }

  case object LowerI extends UnicodeCharacter with HasDecimal with LowerI {
    override val glyph: Char = '\u0069'
    override val name: String = "LowerI"
  }

  case object LowerJ extends UnicodeCharacter with HasDecimal with LowerJ {
    override val glyph: Char = '\u006A'
    override val name: String = "LowerJ"
  }

  case object LowerK extends UnicodeCharacter with HasDecimal with LowerK {
    override val glyph: Char = '\u006B'
    override val name: String = "LowerK"
  }

  case object LowerL extends UnicodeCharacter with HasDecimal with LowerL {
    override val glyph: Char = '\u006C'
    override val name: String = "LowerL"
  }

  case object LowerM extends UnicodeCharacter with HasDecimal with LowerM {
    override val glyph: Char = '\u006D'
    override val name: String = "LowerM"
  }

  case object LowerN extends UnicodeCharacter with HasDecimal with LowerN {
    override val glyph: Char = '\u006E'
    override val name: String = "LowerN"
  }

  case object LowerO extends UnicodeCharacter with HasDecimal with LowerO {
    override val glyph: Char = '\u006F'
    override val name: String = "LowerO"
  }

  case object LowerP extends UnicodeCharacter with HasDecimal with LowerP {
    override val glyph: Char = '\u0070'
    override val name: String = "LowerP"
  }

  case object LowerQ extends UnicodeCharacter with HasDecimal with LowerQ {
    override val glyph: Char = '\u0071'
    override val name: String = "LowerQ"
  }

  case object LowerR extends UnicodeCharacter with HasDecimal with LowerR {
    override val glyph: Char = '\u0072'
    override val name: String = "LowerR"
  }

  case object LowerS extends UnicodeCharacter with HasDecimal with LowerS {
    override val glyph: Char = '\u0073'
    override val name: String = "LowerS"
  }

  case object LowerT extends UnicodeCharacter with HasDecimal with LowerT {
    override val glyph: Char = '\u0074'
    override val name: String = "LowerT"
  }

  case object LowerU extends UnicodeCharacter with HasDecimal with LowerU {
    override val glyph: Char = '\u0075'
    override val name: String = "LowerU"
  }

  case object LowerV extends UnicodeCharacter with HasDecimal with LowerV {
    override val glyph: Char = '\u0076'
    override val name: String = "LowerV"
  }

  case object LowerW extends UnicodeCharacter with HasDecimal with LowerW {
    override val glyph: Char = '\u0077'
    override val name: String = "LowerW"
  }

  case object LowerX extends UnicodeCharacter with HasDecimal with LowerX {
    override val glyph: Char = '\u0078'
    override val name: String = "LowerX"
  }

  case object LowerY extends UnicodeCharacter with HasDecimal with LowerY {
    override val glyph: Char = '\u0079'
    override val name: String = "LowerY"
  }

  case object LowerZ extends UnicodeCharacter with HasDecimal with LowerZ {
    override val glyph: Char = '\u007A'
    override val name: String = "LowerZ"
  }

  case object LeftCurlyBracket extends UnicodeCharacter with HasDecimal with LeftCurlyBracket {
    override val glyph: Char = '\u007B'
    override val name: String = "LeftCurlyBracket"
  }

  case object VerticalBar extends UnicodeCharacter with HasDecimal with VerticalBar {
    override val glyph: Char = '\u007C'
    override val name: String = "VerticalBar"
  }

  case object RightCurlyBracket extends UnicodeCharacter with HasDecimal with RightCurlyBracket {
    override val glyph: Char = '\u007D'
    override val name: String = "RightCurlyBracket"
  }

  case object Tilde extends UnicodeCharacter with HasDecimal with Tilde {
    override val glyph: Char = '\u007E'
    override val name: String = "Tilde"
  }

  case object Delete extends UnicodeCharacter with HasAbbreviation with HasDecimal with Delete {
    override val glyph: Char = '\u007F'
    override val name: String = "Delete"
    override val abbreviation: String = "DEL"
  }

}
