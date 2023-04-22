/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
    public Boot() {
      super.setCost(0);
    }
    
    @Override
    public String say()
    {
      return "You now have a boot!";
    }

    public int getCost() {
      return super.getCost();
    }
}
