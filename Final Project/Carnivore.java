/**
 * Created by Lenny on 12/24/2016.
 */
public class Carnivore extends Organism {
    public Carnivore(int x, int y, World world, Manager manager)
    {
        super(x, y, world);
        setInitAge();
        initEnergy();
        setManagerRef(manager);
    }
}