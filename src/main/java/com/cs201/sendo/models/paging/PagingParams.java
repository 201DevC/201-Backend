package com.cs201.sendo.models.paging;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Khoa
 * @created 4/28/2019
 */
@Getter
@Setter
@Builder
public class PagingParams {
    private Long page;
    private Long offset;
    private Long size;
    private String sortColumn;
    private SortDirection direction;
}
