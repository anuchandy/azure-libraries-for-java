/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.Page;
import com.microsoft.azure.v2.PagedList;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * AvailableEndpointServices.
 */
public final class AvailableEndpointServicesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private AvailableEndpointServicesService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of AvailableEndpointServicesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public AvailableEndpointServicesInner(NetworkManagementClientImpl client) {
        this.service = AzureProxy.create(AvailableEndpointServicesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for AvailableEndpointServices to
     * be used by the proxy service to perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface AvailableEndpointServicesService {
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/virtualNetworkAvailableEndpointServices")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<EndpointServiceResultInner>>> list(@PathParam("location") String location, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("{nextUrl}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<EndpointServiceResultInner>>> listNext(@PathParam(value = "nextUrl", encoded = true) String nextUrl, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;EndpointServiceResultInner&gt; object if successful.
     */
    public PagedList<EndpointServiceResultInner> list(@NonNull String location) {
        Page<EndpointServiceResultInner> response = listSinglePageAsync(location).blockingGet();
        return new PagedList<EndpointServiceResultInner>(response) {
            @Override
            public Page<EndpointServiceResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;EndpointServiceResultInner&gt; object.
     */
    public Observable<Page<EndpointServiceResultInner>> listAsync(@NonNull String location) {
        return listSinglePageAsync(location)
            .toObservable()
            .concatMap((Page<EndpointServiceResultInner> page) -> {
                String nextPageLink = page.nextPageLink();
                if (nextPageLink == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink));
            });
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;EndpointServiceResultInner&gt;&gt; object if successful.
     */
    public Single<Page<EndpointServiceResultInner>> listSinglePageAsync(@NonNull String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2017-08-01";
        return service.list(location, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<EndpointServiceResultInner>> res) -> res.body());
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;EndpointServiceResultInner&gt; object if successful.
     */
    public PagedList<EndpointServiceResultInner> listNext(@NonNull String nextPageLink) {
        Page<EndpointServiceResultInner> response = listNextSinglePageAsync(nextPageLink).blockingGet();
        return new PagedList<EndpointServiceResultInner>(response) {
            @Override
            public Page<EndpointServiceResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;EndpointServiceResultInner&gt; object.
     */
    public Observable<Page<EndpointServiceResultInner>> listNextAsync(@NonNull String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .toObservable()
            .concatMap((Page<EndpointServiceResultInner> page) -> {
                String nextPageLink1 = page.nextPageLink();
                if (nextPageLink1 == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink1));
            });
    }

    /**
     * List what values of endpoint services are available for use.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;EndpointServiceResultInner&gt;&gt; object if successful.
     */
    public Single<Page<EndpointServiceResultInner>> listNextSinglePageAsync(@NonNull String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<EndpointServiceResultInner>> res) -> res.body());
    }
}
