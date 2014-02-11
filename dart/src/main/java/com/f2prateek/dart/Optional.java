/*
 * Copyright 2013 Jake Wharton
 * Copyright 2014 Prateek Srivastava (@f2prateek)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.f2prateek.dart;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Denote that the extra specified by the injection is not required to be present.
 * <pre><code>
 * {@literal @}Optional InjectExtra("key") String title;
 * </code></pre>
 */
@Retention(CLASS) @Target({ FIELD, METHOD })
public @interface Optional {
    String defaultString() default "";
    String[] defaultStringArray() default {};
    boolean defaultBool() default false;
    int defaultInt() default 0;
    long defaultLong() default 0L;
}
