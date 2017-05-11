public class UnitRanged extends Character
{

    int xPos;
	
	int yPos;
	
	public UnitRanged(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	
    @Override
    public void move()
    {
        // TODO Auto-generated method stub

    }


    @Override
    public void attack(int x, int y)
    {
        if (xPos + 3 == x || xPos - 3 == x)
        {
        	if (yPos + 3 == y || yPos - 3 == y)
        	{
        		//ATTACK
        	}
        }

    }

}
