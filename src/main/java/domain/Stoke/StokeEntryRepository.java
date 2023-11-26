package domain.Stoke;

import java.util.List;

public interface StokeEntryRepository {
    StokeEntry getStokeEntryByProductId(int id) throws NoSuchStokeEntryException;
    List<StokeEntry> getAllStokeEntriesByProductId(int productId);
    void persist(StokeEntry StokeEntry);
}
