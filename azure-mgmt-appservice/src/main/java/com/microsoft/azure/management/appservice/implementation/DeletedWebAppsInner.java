/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DeletedWebApps.
 */
public class DeletedWebAppsInner {
    /** The Retrofit service to perform REST calls. */
    private DeletedWebAppsService service;
    /** The service client containing this operation class. */
    private WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of DeletedWebAppsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DeletedWebAppsInner(Retrofit retrofit, WebSiteManagementClientImpl client) {
        this.service = retrofit.create(DeletedWebAppsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DeletedWebApps to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DeletedWebAppsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.appservice.DeletedWebApps list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Web/deletedSites")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.appservice.DeletedWebApps listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DeletedSiteInner&gt; object if successful.
     */
    public PagedList<DeletedSiteInner> list() {
        ServiceResponse<Page<DeletedSiteInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<DeletedSiteInner>(response.body()) {
            @Override
            public Page<DeletedSiteInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DeletedSiteInner>> listAsync(final ListOperationCallback<DeletedSiteInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<DeletedSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeletedSiteInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeletedSiteInner&gt; object
     */
    public Observable<Page<DeletedSiteInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<DeletedSiteInner>>, Page<DeletedSiteInner>>() {
                @Override
                public Page<DeletedSiteInner> call(ServiceResponse<Page<DeletedSiteInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeletedSiteInner&gt; object
     */
    public Observable<ServiceResponse<Page<DeletedSiteInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<DeletedSiteInner>>, Observable<ServiceResponse<Page<DeletedSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeletedSiteInner>>> call(ServiceResponse<Page<DeletedSiteInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DeletedSiteInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DeletedSiteInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-03-01";
        return service.list(this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DeletedSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeletedSiteInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DeletedSiteInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DeletedSiteInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DeletedSiteInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DeletedSiteInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DeletedSiteInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DeletedSiteInner&gt; object if successful.
     */
    public PagedList<DeletedSiteInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<DeletedSiteInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<DeletedSiteInner>(response.body()) {
            @Override
            public Page<DeletedSiteInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DeletedSiteInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<DeletedSiteInner>> serviceFuture, final ListOperationCallback<DeletedSiteInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<DeletedSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeletedSiteInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeletedSiteInner&gt; object
     */
    public Observable<Page<DeletedSiteInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<DeletedSiteInner>>, Page<DeletedSiteInner>>() {
                @Override
                public Page<DeletedSiteInner> call(ServiceResponse<Page<DeletedSiteInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DeletedSiteInner&gt; object
     */
    public Observable<ServiceResponse<Page<DeletedSiteInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<DeletedSiteInner>>, Observable<ServiceResponse<Page<DeletedSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeletedSiteInner>>> call(ServiceResponse<Page<DeletedSiteInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get all deleted apps for a subscription.
     * Get all deleted apps for a subscription.
     *
    ServiceResponse<PageImpl<DeletedSiteInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DeletedSiteInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DeletedSiteInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DeletedSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DeletedSiteInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DeletedSiteInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DeletedSiteInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DeletedSiteInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DeletedSiteInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DeletedSiteInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
