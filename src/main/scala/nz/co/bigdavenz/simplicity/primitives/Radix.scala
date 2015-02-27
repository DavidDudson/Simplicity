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

package nz.co.bigdavenz.simplicity.primitives

import scala.annotation.tailrec


/**
 * Created by David J. Dudson on 12/02/15.
 *
 * Radix Conversions
 */

object Radix {
  /**
   * Convert any int value to any other base
   * @param number Value to Convert
   * @param radix Base to Convert to
   * @return List of Integers which each element is of that base. This is so that any bases over 10 can be represented
   */
  def radixConverter(number: Int, radix: Int): List[Int] = {
    number < radix match {
      case true ⇒ List(number)
      case _ ⇒ radixConverter(number / radix, radix) :+ (number % radix)
    }
  }

  /**
   * Format a number with appropriate 0's added and appended start. Used for Hex/Binary/Decimal
   * @param list The list of characters to format
   * @param remainder The required number of character multiples
   * @param startOfString The string to be appended to the final string
   * @return The completed list of string with attached starting string. eg. 0x01A1.
   */
  @tailrec
  def radixFormat(list: List[String], remainder: Int, startOfString: String = "", endOfString: String = ""): String = {
    list.length % remainder match {
      case 0 ⇒ startOfString ++ list.flatten ++ endOfString
      case _ ⇒ radixFormat("0" +: list, remainder, startOfString, endOfString)
    }
  }
}
