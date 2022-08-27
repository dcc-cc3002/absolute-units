/*
 * "absolute-units" (c) by Ignacio Slater M.
 * "absolute-units" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop
package equality

import java.util.Objects


class GameUnit(val name: String, val hitPoints: Int, val movement: Int,
               val items: List[String] = List()) {
  /* Some code is omitted here. */
  override def equals(other: Any): Boolean = {
    //noinspection TypeCheckCanBeMatch
    if (other.isInstanceOf[GameUnit]) {
      val otherUnit = other.asInstanceOf[GameUnit]
      this.getClass == other.getClass &&
        this.name == otherUnit.name &&
        this.hitPoints == otherUnit.hitPoints &&
        this.movement == otherUnit.movement &&
        this.items == otherUnit.items
    }
    false
  }

  override def hashCode: Int = Objects.hash(classOf[GameUnit], name, hitPoints, movement, items)


  override def toString =
    s"GameUnit(name=$name, hitPoints=$hitPoints, movement=$movement, items=$items)"
}
