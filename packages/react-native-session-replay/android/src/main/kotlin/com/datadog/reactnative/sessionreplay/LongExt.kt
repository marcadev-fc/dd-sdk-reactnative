/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache License Version 2.0.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2016-Present Datadog, Inc.
 */

package com.datadog.reactnative.sessionreplay

internal fun Long.convertToDensityNormalized(density: Float): Long {
    return if (density == 0f) {
        this
    } else {
        (this / density).toLong()
    }
}
