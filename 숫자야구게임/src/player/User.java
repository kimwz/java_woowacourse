package player;

import domain.Output;

public class User extends Computer{
    public void setNumber(){
        number = Output.outputInputNumberMessage();
    }
}
