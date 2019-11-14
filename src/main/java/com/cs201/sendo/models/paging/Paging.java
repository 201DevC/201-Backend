package com.cs201.sendo.models.paging;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Paging<T> {
    private final Long total;
    private final Long offset;
    private final Long size;
    private final String sortColumn;
    private final SortDirection direction;
    private final List<T> content = new ArrayList<>();

    public Paging(List<T> content, Long total, Long offset, Long size, String sortColumn, SortDirection direction) {
        this.content.addAll(content);
        this.total = total;
        this.offset = offset;
        this.size = size;
        this.sortColumn = sortColumn;
        this.direction = direction;
    }

    public Paging(List<T> content, Long total) {
        this.content.addAll(content);
        this.total = total;
        this.direction = SortDirection.ASC;
        this.size = total;
        this.offset = 0L;
        this.sortColumn = null;
    }

    public Paging(List<T> content) {
        this(content, null == content ? 0L : content.size(), 0L, null == content ? 0L : content.size(), null, SortDirection.ASC);
    }

    public static <T> Paging<T> of(List<T> content, Long total, Long offset, Long size, String sortColumn, SortDirection direction) {
        return new Paging<T>(content, total, offset, size, sortColumn, direction);
    }

    public static <T> Paging<T> of(List<T> content, Long total, PagingParams pagingParams) {
        if (pagingParams != null) {
            return new Paging<T>(content, total, pagingParams.getOffset(), pagingParams.getSize(), pagingParams.getSortColumn(), pagingParams.getDirection());
        }
        return new Paging<T>(content, total);
    }
}
