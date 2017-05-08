public class UnitAssassin extends Character
{

    int xPos;
	
	int yPos;
	
	public UnitAssassin(int x, int y)
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
        if (xPos + 1 == x || xPos - 1 == x)
        {
        	if (yPos + 1 == y || yPos - 1 == y)
        	{
        		//ATTACK
        	}
        }

    }

}
