package use_case.clear_users;

// Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDAO, ClearOutputBoundary output) {
        this.userDataAccessObject = userDAO;
        this.clearPresenter = output;
    }

    @Override
    public void execute() {
        if (userDataAccessObject.isEmpty()) {
            clearPresenter.prepareFailView("No users to delete");
        } else {
            Object[] usernames = userDataAccessObject.deleteAllUsers();

            ClearOutputData outputData = new ClearOutputData(usernames, false);
            clearPresenter.prepareSuccessView(outputData);
        }
    }

}
