/*
 * "absolute-units" (c) by Ignacio Slater M.
 * "absolute-units" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.equality

import cl.uchile.dcc.oop.constructors.Item
import java.util.*


open class GameUnit(
  val name: String,
  val hitPoints: Int,
  val movement: Int,
  val items: MutableList<Item> = mutableListOf(),
) {
  /* We omit some code here to make the example more readable. */
  override fun equals(other: Any?) =
    // When is kind-of an if-elseif-else statement
    when {
      this === other -> true
      other is GameUnit -> this::class == other::class
          && this.name == other.name
          && this.hitPoints == other.hitPoints
          && this.movement == other.movement
          && this.items == other.items

      else -> false
    }

  override fun hashCode() = Objects.hash(this::class, name, hitPoints, movement, items)

  override fun toString() =
    "GameUnit(name='$name', hitPoints=$hitPoints, movement=$movement, items=$items)"
}