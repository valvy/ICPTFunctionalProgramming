package nl.hsleiden.icpt

/**
 * Wat leren jullie in deze les?
 * Wat zijn pure functies
 * De scallazi regels
 * Pattern matching met Optional
 * Recursie
 * Gebruik van
 */
object Lesson1 {

  /**
   * Maak een methode die aan alle Scalezzi regels voldoen
   *
   * @param lh
   * @param rh
   * @return
   */
  def division(lh: Int, rh: Int): Option[Int] = {
    if (rh == 0)
      None
    else
      Some(lh / rh)
  }

  def divisionWithException(lh: Int, rh: Int) = {

  }

  def binaryToInt(lh: String) = {
    -1
  }

  def faculty(n: Int) = {
    1
  }

  def pow(lh: Int, rh: Int) = {
    1
  }




}
