package org.limewire.core.api.browse.server;

import java.util.Date;

public interface BrowseTracker {
    /**
     * Used to track when a library refresh is sent to a friend
     * @param friendId -- the id of a friend
     */
    public void sentRefresh(String friendId);
    
    /**
     * Used to track when a browse has been done by a friend
     * @param friendId -- the id of a friend
     */
    public void browsed(String friendId);

    /**
     * @param friendId -- the id of a friend
     * @return the last time the <code>friend</code> did a browse,
     * or null if they never have.
     */
    public Date lastBrowseTime(String friendId);
    
    /**
     * @param friendId -- the id of a friend
     * @return the last time a library refresh was sent to the <code>friend</code>,
     * or null if it never has.
     */
    public Date lastRefreshTime(String friendId);
}
