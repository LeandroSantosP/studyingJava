package domain.Stoke;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


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
    public List<StokeEntry> getAllStokeEntriesByProductId(int productId) {
        return this.StokeEntries.values().stream().filter(entry -> entry.getProductId() == productId).collect(Collectors.toList());
    }

    @Override
    public void persist(StokeEntry StokeEntry) {
        this.StokeEntries.put(StokeEntry.getProductId(), StokeEntry);
    }
}
