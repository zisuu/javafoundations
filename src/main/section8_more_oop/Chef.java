package section8_more_oop;

public interface Chef {
    default void cook(String food){
        System.out.println("I am now cooking " + food);
    }

    default String cleanUp(){
        return "I0m done cleaning up";
    }

}
