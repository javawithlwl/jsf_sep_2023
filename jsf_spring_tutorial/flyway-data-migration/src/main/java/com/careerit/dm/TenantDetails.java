package com.careerit.dm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TenantDetails {
    private String name;
    private DbDetails db;
}
