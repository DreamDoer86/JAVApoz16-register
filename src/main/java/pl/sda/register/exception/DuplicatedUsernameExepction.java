package pl.sda.register.exception;

public class DuplicatedUsernameExepction extends RuntimeException{
    public DuplicatedUsernameExepction (String message) {
        super(message);
    }
}
