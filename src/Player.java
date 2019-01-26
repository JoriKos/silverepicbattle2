public class Player extends Armour{

    private int health;
    private int attack;
    private String name;
    private int maxWeight = 100;
    private int defence;







    public void setDefence(int _defence){ // defence setter
            _defence = defence;
    }

    public int getDefence(){ //defence getter
        return defence;
    }

    public void setMaxWeight(int _mw){ // maxweight setter
        _mw = maxWeight;
    }

    public int getMaxWeight(){ // maxweight getter
        return maxWeight;
    }

    public void setName(String _name){ // name setter
        _name = name;
    }


    public String getName(){ // name getter
        return name;
    }


    public void setAttack(int _attack){ // attack setter
        if(_attack > 100){
            _attack = 99;
        }
        _attack = attack;
    }

    public int getAttack(){ // attack getter
        return attack;
    }

    public void sethealth(int _health){ // health setter
        if(_health <=0){
            _health = 0;
        } else if(_health > 100){
            _health = 100;
        }

        _health = health;
    }

    public int getHealth(){ // health getter
        return health;
    }
}
