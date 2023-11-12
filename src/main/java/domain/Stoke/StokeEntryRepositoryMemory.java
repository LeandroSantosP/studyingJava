package domain.Stoke;

import java.util.HashMap;
import java.util.Map;


public class StokeEntryRepositoryMemory implements StokeEntryRepository {

    private final Map<Integer, StokeEntry> StokeEntries;

    public StokeEntryRepositoryMemory() {
        this.StokeEntries = new HashMap<>();
    }

    @Override
    public StokeEntry getStokeEntryByProductId(int id) throws NoSuchStokeEntryException {
        StokeEntry stokeEntry = this.StokeEntries.get(id);
        if (stokeEntry == null) {
            throw new NoSuchStokeEntryException("StokeEntry with ID " + id + " not found");
        }
        return stokeEntry;
    }

    @Override
    public void persist(StokeEntry StokeEntry) {
        this.StokeEntries.put(StokeEntry.getProductId(), StokeEntry);
    }
}
