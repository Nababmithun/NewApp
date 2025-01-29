package com.code4galaxy.paging3withjetpackcompose.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/code4galaxy/paging3withjetpackcompose/data/NewsService;", "", "getNews", "Lcom/code4galaxy/paging3withjetpackcompose/data/dto/NewsResponse;", "query", "", "page", "", "sortBy", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsService {
    
    @retrofit2.http.GET(value = "everything?apiKey=05201c0735df444483620cc6b8b2197b&pageSize=20")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNews(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull()
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "sortBy")
    @org.jetbrains.annotations.NotNull()
    java.lang.String sortBy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.code4galaxy.paging3withjetpackcompose.data.dto.NewsResponse> $completion);
}