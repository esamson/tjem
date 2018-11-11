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

case class List(
    id: List.Id,
    name: String,
    closed: Boolean,
    idBoard: Board.Id,
    pos: Int
)

object List {
  import io.circe.Decoder
  import io.circe.generic.extras.semiauto._

  case class Id(id: String) extends AnyVal

  implicit val idDecoder: Decoder[Id] = deriveUnwrappedDecoder
}
