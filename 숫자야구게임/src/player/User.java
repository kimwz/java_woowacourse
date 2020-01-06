package player;

import domain.Output;

public class User extends Computer{
    public void setNumber(){
        this.number = Output.outputInputNumberMessage();
    }
}
