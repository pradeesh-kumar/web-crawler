/*
 * Copyright (c) 2021. Pradeesh Kumar
 */
package org.pradeesh.crawler.crawlerweb.service;

import org.pradeesh.crawler.crawlerweb.dto.IndexResponse;
import reactor.core.publisher.Mono;

/**
 * The interface Url indexer service.
 *
 * @author pradeesh.kumar
 */
public interface UrlIndexerService {

    /**
     * Add the url to the index
     *
     * @param url the url
     * @return the mono of IndexResponse
     */
    Mono<IndexResponse> addToIndex(String url);
}
