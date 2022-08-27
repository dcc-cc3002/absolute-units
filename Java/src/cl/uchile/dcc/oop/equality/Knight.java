/*
 * "absolute-units" (c) by Ignacio Slater M.
 * "absolute-units" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.equality;

import cl.uchile.dcc.oop.constructors.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Knight extends GameUnit {
  public Knight(String name, int hitPoints, int movement, List<Item> items) {
    super(name, hitPoints, movement, items);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {  // Referential equality.
      return true;
    }
    if (!(this.getClass().equals(o.getClass()))) {
      return false;
    }
    Knight knight = (Knight) o;
    return hitPoints == knight.hitPoints
           && movement == knight.movement
           // Object.equals will take care of nulls. This calls the equals method of String.
           && Objects.equals(name, knight.name)
           && Objects.equals(items, knight.items);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  public static void main(String[] args) {
    GameUnit gameUnit = new Knight("Knight", 100, 2, new ArrayList<>());
    GameUnit gameUnit2 = new Knight("Knight", 100, 2, new ArrayList<>());
    System.out.println(gameUnit.equals(gameUnit2));
    System.out.println(gameUnit.hashCode() == gameUnit2.hashCode());

    GameUnit gameUnit3 = new GameUnit("Knight", 100, 2, new ArrayList<>());
    System.out.println(gameUnit.equals(gameUnit3));
    System.out.println(gameUnit3.equals(gameUnit));
  }
}
