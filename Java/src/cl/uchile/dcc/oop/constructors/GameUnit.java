/*
 * "absolute-units" (c) by Ignacio Slater M.
 * "absolute-units" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.constructors;

import java.util.ArrayList;
import java.util.List;

public class GameUnit {
  private final String name;
  private int hitPoints;
  private int movement;
  private final List<Item> items;

  public GameUnit(String name, int hitPoints, int movement) {
    this(name, hitPoints, movement,
         new ArrayList<>());
  }

  public GameUnit(String name, int hitPoints, int movement, List<Item> items) {
    // super();
    this.name = name;
    this.hitPoints = hitPoints;
    this.movement = movement;
    this.items = items;
  }

  public String getName() {
    return name;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public void setHitPoints(int hitPoints) {
    // We make sure that the hit points are always positive.
    this.hitPoints = Math.max(0, hitPoints);
  }

  public int getMovement() {
    return movement;
  }

  public void setMovement(int movement) {
    // We make sure that the movement is always positive.
    this.movement = Math.max(0, movement);
  }

  public List<Item> getItems() {
    return items;
  }
}
