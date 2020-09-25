package b1;

public class Account {
    public void deposit(double value){
        if (value<0)
            throw new IllegalArgumentException();
    }
}
