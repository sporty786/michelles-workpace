import java.util.List;
import java.util.ArrayList;

public class PetStoreService {
    // A list of pets allow us to store an ordered collection of Strings, which can be retrieved by their
    // index, versus a set of pets, which would allow us to store unique values for pets (no duplicates),
    // which do not have indexes, but are pretty good at retrieving items based off the object themselves.
    List<String> pets;

    public PetStoreService(){
        //instantiate pets
        pets = new ArrayList<String>();
        // An interface may have multiple implemented classes - classes can exhibit the behaviours defined
        // by an interface.
    }

    public void addPet(String name){
        pets.add(name);
    }

    public void purchasePet(int id){
        pets.remove(id);
    }

    public void purchasePet(String name){
        //eg if Fido is at index 2, pets.indexOf("Fido") will return 2
        int indexOfPet = pets.indexOf(name);
        if (indexOfPet != -1){pets.remove(indexOfPet);}
    }

    //I want to be able to print my pets, and I can just do that by attempting to print the List Object
    public List<String> getPets(){
        return pets;
    }
}