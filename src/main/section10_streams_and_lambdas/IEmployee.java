package section10_streams_and_lambdas;

public interface IEmployee extends Comparable<IEmployee>{

    int getSalary(); // public is not needed, because in a interface methods are always public

}
