package Pets_Registration;

public class Dog extends Pet
{

    public Dog() {
    }
    
    public Dog(String name_pet, int age_pet)
    {
        super(name_pet,age_pet);
    }

    @Override
    public String HacerSonido()
    {
        return("The dog can say !Guau!");
    }
    
}
