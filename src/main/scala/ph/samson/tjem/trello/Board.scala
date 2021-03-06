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

package ph.samson.tjem.trello

import java.time.Instant

case class Board(
    id: Board.Id,
    name: String,
    url: String,
    dateLastActivity: Instant,
    cards: Seq[Card],
    labels: Seq[Label],
    lists: Seq[List]
)

object Board {
  import io.circe.Decoder
  import io.circe.generic.extras.semiauto._

  case class Id(id: String) extends AnyVal

  implicit val idDecoder: Decoder[Id] = deriveUnwrappedDecoder

  def parse(json: String) = {
    import io.circe.generic.auto._
    import io.circe.parser.decode

    decode[Board](json)
  }
}
