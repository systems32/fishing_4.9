/*
 * Activity 4.9.3
 */
public class Bait extends LakeObject
{
    public Bait() {
        super.setCost(10);
    }
    
    @Override
    public String say()
    {
    return "You now have bait!";
    }

    public int getCost() {
        return super.getCost();
    }
}