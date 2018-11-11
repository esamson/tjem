/*
 * Copyright (C) 2018  Edward Samson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ph.samson.tjem.csv

import kantan.csv.{CellEncoder, RowEncoder}

case class Card(
    list: String,
    name: String,
    description: String,
    labels: Seq[String],
    url: String
)

object Card {
  implicit val labelsEncoder: CellEncoder[Seq[String]] =
    CellEncoder.from(labels => labels.mkString("; "))
  implicit val cardEncoder: RowEncoder[Card] =
    RowEncoder.caseEncoder(0, 1, 2, 3, 4)(Card.unapply)
}
