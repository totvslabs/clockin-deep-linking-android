package com.totvs.camera.vision.utils

import androidx.annotation.RestrictTo
import com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata

@RestrictTo(RestrictTo.Scope.LIBRARY)
internal fun Int.toFirebaseVisionRotation() = when (this) {
    0 -> FirebaseVisionImageMetadata.ROTATION_0
    90 -> FirebaseVisionImageMetadata.ROTATION_180
    180 -> FirebaseVisionImageMetadata.ROTATION_180
    270 -> FirebaseVisionImageMetadata.ROTATION_270
    else -> throw IllegalArgumentException("Rotation must be 0, 90, 180, 270")
}