/**
 * Activity 4.9.3
 */
public class Hook extends LakeObject
{
  private int strength = 45;
  public Hook() {
    super.setCost(15);
  }

  /*---------- accessor ----------*/

  public int getStrength() 
  {
    return strength; // This return will be updated in the next activity
    //return strength;
  }

  public int getCost() {
    return super.getCost();
  }

  @Override
  public String say()
  {
    return "You now have a hook!";
  }

}