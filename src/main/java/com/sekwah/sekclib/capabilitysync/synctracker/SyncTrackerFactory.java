package com.sekwah.sekclib.capabilitysync.synctracker;

import com.sekwah.sekclib.capabilitysync.SyncEntry;

public interface SyncTrackerFactory<T extends SyncEntry> {
    SyncTracker create(T syncTracker);
}
