package Pets_Registration;

public class Cat extends Pet
{

    public Cat(){
    }
    
    public Cat(String name_pet, int age_pet)
    {
        super(name_pet, age_pet);
    }

    @Override
    public String HacerSonido()
    {
        return("The cat can say !Miau!");
    }
    
}