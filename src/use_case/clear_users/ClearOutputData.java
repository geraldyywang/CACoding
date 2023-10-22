package use_case.clear_users;

// Complete me

public class ClearOutputData {

    private final Object[] deleted;
    private boolean useCaseFailed;

    public ClearOutputData(Object[] deleted, boolean useCaseFailed) {
        this.deleted = deleted;
        this.useCaseFailed = useCaseFailed;
    }

    public Object[] getDeleted() {
        return deleted;
    }
}
