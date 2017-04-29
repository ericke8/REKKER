public abstract class Character
{
    private int atk;

    private int def;

    private int health;

    private boolean ranged;

    private int xPos;

    private int yPos;


    public int getXPos()
    {
        return xPos;
    }


    public int getYPos()
    {
        return yPos;
    }


    public boolean isRanged()
    {
        return ranged;
    }


    public int getAtk()
    {
        return atk;
    }


    public int getDef()
    {
        return def;
    }


    public int getHealth()
    {
        return health;
    }
}
