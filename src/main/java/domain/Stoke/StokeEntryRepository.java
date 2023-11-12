package domain.Stoke;

public interface StokeEntryRepository {
    public StokeEntry getStokeEntryByProductId(int id) throws NoSuchStokeEntryException;
    void persist(StokeEntry StokeEntry);
}
