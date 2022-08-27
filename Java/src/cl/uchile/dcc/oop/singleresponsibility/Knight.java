/*
 * "absolute-units" (c) by Ignacio Slater M.
 * "absolute-units" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.singleresponsibility;

import cl.uchile.dcc.oop.constructors.GameUnit;

public class Knight extends GameUnit {
  public Knight(String name, int hitPoints, int movement) {
    super(name, hitPoints, movement);
  }
}
