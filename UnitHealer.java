public class UnitHealer extends Character
{

    int xPos;
	
	int yPos;
	
	public UnitHealer(int x, int y)
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
<<<<<<< HEAD
        // TODO Auto-generated method stub
        // heal negative, only unit able to heal both enemy and ally
=======
        if (xPos + 2 == x || xPos - 2 == x)
        {
        	if (yPos + 2 == y || yPos - 2 == y)
        	{
        		//HEAL
        	}
        }
>>>>>>> 4145a07f355806c3e3271590948e7b0bf0052b29

    }

}
