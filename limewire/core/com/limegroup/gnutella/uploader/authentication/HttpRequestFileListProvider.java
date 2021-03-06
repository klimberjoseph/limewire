package com.limegroup.gnutella.uploader.authentication;


import org.apache.http.HttpRequest;
import org.apache.http.protocol.HttpContext;

import com.limegroup.gnutella.library.SharedFileList;
import com.limegroup.gnutella.uploader.HttpException;

/**
 * Implemented by classes that that lookup a file lists for an {@link HttpRequest}.
 */
public interface HttpRequestFileListProvider {

    /**
     * @param userId can be null if there is no user id in the request uri
     * @return iterable of file lists
     * @throws HttpException if the file list for the request was not found or
     * the request is not authorized
     */
    Iterable<SharedFileList> getFileLists(String userId, HttpContext httpContext) throws HttpException;
}