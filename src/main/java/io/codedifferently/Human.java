package io.codedifferently;

public class Human {

    private String firstName; 
    private String lastName; 
    static int maxEnergy = 100;
    private int energy;
    

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName; 
        this.energy = 50;

    
    }
    public void eat(Fruit fruit){
        if (this.energy + fruit.getEnergy() <= maxEnergy){ 
            this.energy= this.energy + fruit.getEnergy();
        }else{
            this.energy = maxEnergy;
            System.out.println("We are full of energy! Wohoo!");
        }
    }

    public void work(int hours){
        int energySpent = hours * 10;

        if(this.energy - energySpent < 0){
            System.out.println("You can't do any work! Your energy is too low. Eat, then try to do the work again later.");
        }else{
            this.energy = this.energy - energySpent;
        }
        

        
    }

    public int getEnergy(){
        return this.energy;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
}
