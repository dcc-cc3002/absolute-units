/*
 * "absolute-units" (c) by Ignacio Slater M.
 * "absolute-units" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.equality

import cl.uchile.dcc.oop.constructors.GameUnit
import java.util.*


class Knight(name: String, hitPoints: Int, movement: Int) : GameUnit(name, hitPoints, movement) {
  override fun equals(other: Any?) =
    // When is kind-of an if-elseif-else statement
    when {
      this === other -> true
      other is Knight -> this::class == other::class
          && this.name == other.name
          && this.hitPoints == other.hitPoints
          && this.movement == other.movement
          && this.items == other.items
      else -> false
    }

  override fun hashCode() = Objects.hash(this::class, name, hitPoints, movement, items)
}