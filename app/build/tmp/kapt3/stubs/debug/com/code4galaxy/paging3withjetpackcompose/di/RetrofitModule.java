package com.code4galaxy.paging3withjetpackcompose.di;

/**
 * Dependency injection module for providing Retrofit-related instances and repositories.
 *
 * This module uses Dagger Hilt to inject dependencies throughout the application lifecycle.
 * It provides instances of [NewsService] for API communication and [NewsRepository] for data management.
 *
 * @see com.code4galaxy.paging3withjetpackcompose.data.NewsService
 * @see com.code4galaxy.paging3withjetpackcompose.data.repository.NewsRepository
 * @see dagger.hilt
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/code4galaxy/paging3withjetpackcompose/di/RetrofitModule;", "", "()V", "provideNewsRepository", "Lcom/code4galaxy/paging3withjetpackcompose/data/repository/NewsRepository;", "newsApiService", "Lcom/code4galaxy/paging3withjetpackcompose/data/NewsService;", "provideRetrofitInstance", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RetrofitModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.code4galaxy.paging3withjetpackcompose.di.RetrofitModule INSTANCE = null;
    
    private RetrofitModule() {
        super();
    }
    
    /**
     * Provides a singleton instance of [NewsService] configured with Retrofit.
     *
     * @return [NewsService] instance for making network calls to fetch news data.
     *
     * This method:
     * - Configures Retrofit with the base URL defined in [ApiConstants.BASE_URL].
     * - Adds a Gson converter for parsing JSON responses.
     */
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.code4galaxy.paging3withjetpackcompose.data.NewsService provideRetrofitInstance() {
        return null;
    }
    
    /**
     * Provides a singleton instance of [NewsRepository] for managing data operations.
     *
     * @param newsApiService The [NewsService] instance used by the repository.
     * @return [NewsRepository] instance for accessing and managing news data.
     */
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.code4galaxy.paging3withjetpackcompose.data.repository.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull()
    com.code4galaxy.paging3withjetpackcompose.data.NewsService newsApiService) {
        return null;
    }
}