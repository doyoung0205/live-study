package com.company.annotaions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface Hello {
}
// TODO SOURCE -> CLASS -> RUNTIME
// TODO