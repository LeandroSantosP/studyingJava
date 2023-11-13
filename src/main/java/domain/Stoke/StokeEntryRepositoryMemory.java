package domain.Stoke;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;


public class StokeEntryRepositoryMemory implements StokeEntryRepository {
    private final Map<UUID, StokeEntry> StokeEntries;
    static private StokeEntryRepositoryMemory instance = null;


    static public StokeEntryRepositoryMemory getInstance() {
        if (StokeEntryRepositoryMemory.instance == null) {
            StokeEntryRepositoryMemory.instance = new StokeEntryRepositoryMemory();
        }
        return StokeEntryRepositoryMemory.instance;
    }
    private StokeEntryRepositoryMemory() {
        this.StokeEntries = new HashMap<>();
    }

    @Override
    public StokeEntry getStokeEntryByProductId(int id) throws NoSuchStokeEntryException {
        StokeEntry stokeEntry = this.StokeEntries.values().stream().filter(i -> i.getProductId() == id).findFirst().orElse(null);
        if (stokeEntry == null) throw new NoSuchStokeEntryException("StokeEntry with ID " + id + " not found");
        return stokeEntry;
    }

    @Override
    public List<StokeEntry> getAllStokeEntriesByProductId(int productId) {
        return this.StokeEntries.values().stream().filter(entry -> entry.getProductId() == productId).collect(Collectors.toList());
    }

    @Override
    public void persist(StokeEntry StokeEntry) {
        this.StokeEntries.put(StokeEntry.getId(), StokeEntry);
    }
}
