package class20;

import class17.Animal;
import class17.Cat;
import class17.Dog;

public class E4PolyMor {
    public static void main(String[] args) {
        Animal []arr={new Dog(),new Cat(),new Animal()};
        for(Animal animal:arr){
            animal.eat();
            animal.Sleep();
            animal.Speak();
        }
      /*  for (int i = 0; i < arr.length; i++) {
            arr[i].Speak();
            arr[i].Sleep();
            arr[i].eat();


        }*/

    }
}
