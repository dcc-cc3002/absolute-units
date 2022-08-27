/*
 * "absolute-units" (c) by Ignacio Slater M.
 * "absolute-units" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.equality;

import cl.uchile.dcc.oop.constructors.Item;

import java.util.List;
import java.util.Objects;

public class GameUnit {
  protected final String name;
  protected int hitPoints;
  protected int movement;
  protected final List<Item> items;

  public GameUnit(String name, int hitPoints, int movement, List<Item> items) {
    // super();
    this.name = name;
    this.hitPoints = hitPoints;
    this.movement = movement;
    this.items = items;
  }

  /* Some code is omitted here. */

  @Override
  public boolean equals(Object o) {
    if (this == o) {  // Referential equality.
      return true;
    }
    if (!(this.getClass().equals(o.getClass()))) {
      return false;
    }
    GameUnit gameUnit = (GameUnit) o;
    return hitPoints == gameUnit.hitPoints
           && movement == gameUnit.movement
           // Object.equals will take care of nulls. This calls the equals method of String.
           && Objects.equals(name, gameUnit.name)
           && Objects.equals(items, gameUnit.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GameUnit.class, name, hitPoints, movement, items);
  }

  @Override
  public String toString() {
    return "GameUnit{" +
           "name='" + name + '\'' +
           ", hitPoints=" + hitPoints +
           ", movement=" + movement +
           ", items=" + items +
           '}';
  }
}
