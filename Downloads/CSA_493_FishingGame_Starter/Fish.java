/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    @Override
    public String say()
    {
      return "You now have a fish!";
    }

    @Override
    public int getCost()
    {
      int weight = super.getWeight();
      return (weight * 2);
    }
}