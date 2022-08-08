package section9_collections;

public interface IEmployee extends Comparable<IEmployee>{

    int getSalary(); // public is not needed, because in a interface methods are always public

}
