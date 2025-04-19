package Self_Practice;

class PasswordTooShortException extends Exception {
    public PasswordTooShortException(String message) {
        super(message);
    }
}

public class PasswordChecker {
    public static void checkpassword(String password) throws PasswordTooShortException {
        if (password.length() < 8) {
            throw new PasswordTooShortException("Password must be at least 8 characters long");
        }
        else {
            System.out.println("Password is valid");
        }

    }

    public static void main(String[] args) {
        try {
            checkpassword("12345");
        }
        catch (PasswordTooShortException e) {
            System.out.println(e.getMessage());
        }
    }
}
