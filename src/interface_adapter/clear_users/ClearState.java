package interface_adapter.clear_users;

// Complete me

public class ClearState {
    private Object[] deleted;
    private String deletedError = null;

    public ClearState(ClearState copy) {
        this.deleted = copy.deleted;
        this.deletedError = copy.deletedError;
    }

    public ClearState() {
    }

    public Object[] getDeleted() {
        return deleted;
    }

    public void setDeleted(Object[] deleted) {
        this.deleted = deleted;
    }

    public String getDeletedError() {
        return deletedError;
    }

    public void setDeletedError(String deletedError) {
        this.deletedError = deletedError;
    }

}
