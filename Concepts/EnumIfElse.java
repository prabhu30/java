package Concepts;

enum Status {
    Pending, Running, Success, Failed;
}

public class EnumIfElse {
    public static void main(String[] args) {

        Status s = Status.Success;

        switch (s) {
            case Pending -> System.out.println("Waiting to Run...");
            case Running -> System.out.println("Running...");
            case Failed -> System.out.println("Process Failed");
            default -> System.out.println("Execution Done!!!");
        }
    }
}
