package handler;
import user.*;

public class AddUserCommand implements Command {

    private User _user;

    public AddUserCommand ( User user ) { _user = user; }

    @Override
    public void execute ( Document doc, UserManager userManager ) throws InvalidUserIDException, UserNotFoundException, OutOfBoundsException {
        userManager.addUser(_user);
    }
}
