package Pets_Registration;

public class Pet
{
    String name_pet;
    int age_pet;

    public Pet() {
    }

    public Pet(String name_pet, int age_pet) {
        this.name_pet = name_pet;
        this.age_pet = age_pet;
    }
    
    public String HacerSonido()
    {
        return("The pet makes a sound");
    }
    
    
}