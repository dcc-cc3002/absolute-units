/*
 * "absolute-units" (c) by Ignacio Slater M.
 * "absolute-units" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.constructors

import java.util.*
import kotlin.math.max

open class GameUnit(
  val name: String,
  hitPoints: Int,
  movement: Int,
  val items: MutableList<Item> = mutableListOf(),
) {
  var hitPoints: Int = max(0, hitPoints)  // We make sure that hitPoints is always positive
    set(value) {
      field = max(0, value)
    }
  var movement: Int = max(0, movement)  // We make sure that movement is always positive
    set(value) {
      field = max(0, value)
    }
}